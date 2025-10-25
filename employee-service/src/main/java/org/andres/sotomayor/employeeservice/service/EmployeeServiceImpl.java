package org.andres.sotomayor.employeeservice.service;

import jakarta.persistence.EntityNotFoundException;
import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.dto.EmployeePage;
import org.andres.sotomayor.employeeservice.mapper.EmployeeMapper;
import org.andres.sotomayor.employeeservice.model.EmployeeEntity;
import org.andres.sotomayor.employeeservice.repository.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Value("${validation.message.resource.not.found }")
    private String errorMessage;
    private final EmployeeServiceUtils employeeServiceUtils;
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeServiceUtils employeeServiceUtils, EmployeeRepository employeeRepository) {
        this.employeeServiceUtils = employeeServiceUtils;
        this.employeeRepository = employeeRepository;
        this.employeeMapper = EmployeeMapper.INSTANCE;
    }

    @Override
    public Employee create(Employee employee) {
        Employee employeeValidated = employeeServiceUtils.calculateNetSalary(employee);
        EmployeeEntity employeeEntity = employeeMapper.employeeToEmployeeEntity(employeeValidated);

        employeeEntity.getLaboralInformation().setEmployee(employeeEntity);
        employeeEntity.getPersonalInformation().setEmployee(employeeEntity);
        employeeEntity.getDeductions().forEach(deduction -> deduction.setEmployee(employeeEntity));
        employeeEntity.getCompensations().forEach(compensation -> compensation.setEmployee(employeeEntity));


        employeeRepository.save(employeeEntity);

        return employeeMapper.employeeEntityToEmployee(employeeEntity);
    }

    @Override
    public EmployeePage findByAllByName(String name, int pageSize, int pageNumber) {
        Page<EmployeeEntity> employeeEntities = employeeRepository.findByPersonalInformationNameContaining(name, PageRequest.of(pageNumber, pageSize));
        List<Employee> employees = employeeEntities.getContent().stream().map(employeeMapper::employeeEntityToEmployee).toList();
        if (employeeEntities.getTotalElements() == 0)
            throw new EntityNotFoundException(errorMessage);
        return EmployeePage.builder()
                .employeeList(employees)
                .hasNextPage(employeeEntities.hasNext())
                .hasPreviousPage(employeeEntities.hasPrevious())
                .totalElements(employeeEntities.getTotalElements())
                .totalPages(employeeEntities.getTotalPages())
                .build();
    }

    @Override
    public Employee findByEmployeeNumber(String employeeNumber) {
        EmployeeEntity employeeResult = employeeRepository.findByLaboralInformationEmployeeNumber(employeeNumber).orElseThrow(() -> new EntityNotFoundException(errorMessage));
        return employeeMapper.employeeEntityToEmployee(employeeResult);
    }

    @Override
    public void deleteByEmployeeNumber(String employeeNumber) {
        EmployeeEntity entity = employeeRepository.findByLaboralInformationEmployeeNumber(employeeNumber).orElseThrow(() -> new EntityNotFoundException(errorMessage));
        employeeRepository.delete(entity);
    }

    @Override
    public Employee updateByEmployeeNumber(String employeeNumber, Employee employee) {
        EmployeeEntity employeeEntity = employeeRepository.findByLaboralInformationEmployeeNumber(employeeNumber).orElseThrow(() -> new EntityNotFoundException(errorMessage));
        EmployeeEntity employeeResult = employeeMapper.employeeToEmployeeEntity(employee);
        employeeEntity.setLaboralInformation(employeeResult.getLaboralInformation());
        employeeEntity.setPersonalInformation(employeeResult.getPersonalInformation());
        employeeEntity.setDeductions(employeeResult.getDeductions());
        employeeEntity.setCompensations(employeeResult.getCompensations());
        return employeeMapper.employeeEntityToEmployee(employeeRepository.save(employeeEntity));
    }

}

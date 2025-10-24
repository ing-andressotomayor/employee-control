package org.andres.sotomayor.employeeservice.service;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.mapper.EmployeeMapper;
import org.andres.sotomayor.employeeservice.model.EmployeeEntity;
import org.andres.sotomayor.employeeservice.repository.*;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

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
    public Page<Employee> findByAllByName(String name, int pageSize, int pageNumber) {

        return null;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public Employee findByEmployeeNumber(String employeeNumber) {
        return null;
    }

    @Override
    public Employee deleteByEmployeeNumber(String employeeNumber) {
        return null;
    }
}

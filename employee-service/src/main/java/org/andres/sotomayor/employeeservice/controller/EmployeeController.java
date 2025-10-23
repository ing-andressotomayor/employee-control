package org.andres.sotomayor.employeeservice.controller;

import jakarta.validation.Valid;
import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.entity.EmployeeEntity;
import org.andres.sotomayor.employeeservice.jpa.EmployeeRepository;
import org.andres.sotomayor.employeeservice.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andrés Sotomayor Venegas on 17/10/2025.
 * employee-control
 */
@RestController
@RequestMapping(value = "api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;

    @PostMapping(value = "create")
    public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee){
        EmployeeEntity employeeEntity = employeeMapper.employeeToEmployeeEntity(employee);
        EmployeeEntity persistResult = employeeRepository.save(employeeEntity);
        return ResponseEntity.ok(employeeMapper.employeeEntityToEmployee(persistResult));
    }
}

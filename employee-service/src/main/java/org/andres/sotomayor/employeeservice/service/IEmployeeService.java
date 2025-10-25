package org.andres.sotomayor.employeeservice.service;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.dto.EmployeePage;


public interface IEmployeeService {
    Employee create(Employee employee);

    EmployeePage findByAllByName(String name, int pageSize, int pageNumber);

    Employee findByEmployeeNumber(String employeeNumber);

    void deleteByEmployeeNumber(String employeeNumber);
    Employee updateByEmployeeNumber(String employeeNumber,Employee employee);
}

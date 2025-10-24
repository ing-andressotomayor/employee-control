package org.andres.sotomayor.employeeservice.service;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.dto.EmployeePage;


public interface IEmployeeService {
    public Employee create(  Employee employee);

    public EmployeePage findByAllByName(String name, int pageSize, int pageNumber);

    public Employee findByEmployeeNumber(String employeeNumber);

    public Employee deleteByEmployeeNumber(String employeeNumber);
}

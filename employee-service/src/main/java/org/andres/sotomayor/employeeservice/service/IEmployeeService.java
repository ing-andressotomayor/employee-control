package org.andres.sotomayor.employeeservice.service;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.springframework.data.domain.Page;

public interface IEmployeeService {
    public Employee create(  Employee employee);

    public Page<Employee> findByAllByName(String name,int pageSize, int pageNumber);

    public Employee findById(Long id);

    public Employee findByEmployeeNumber(String employeeNumber);

    public Employee deleteByEmployeeNumber(String employeeNumber);
}

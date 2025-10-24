package org.andres.sotomayor.employeeservice.mapper;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.model.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "id", ignore = true)
    EmployeeEntity employeeToEmployeeEntity(Employee employee);

    Employee employeeEntityToEmployee(EmployeeEntity employeeEntity);
}

package org.andres.sotomayor.employeeservice.mapper;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by Andrés Sotomayor Venegas on 17/10/2025.
 * employee-control
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "id",ignore = true)
    EmployeeEntity employeeToEmployeeEntity(Employee employee);
    Employee employeeEntityToEmployee(EmployeeEntity employeeEntity);
}

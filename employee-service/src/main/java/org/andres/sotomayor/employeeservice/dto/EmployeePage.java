package org.andres.sotomayor.employeeservice.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class EmployeePage implements Serializable {

    @Serial
    private static final long serialVersionUID = 2537689421289451795L;
    private List<Employee> employeeList;
    private Boolean hasNextPage;
    private Boolean hasPreviousPage;
    private Long totalElements;
    private Integer totalPages;
}

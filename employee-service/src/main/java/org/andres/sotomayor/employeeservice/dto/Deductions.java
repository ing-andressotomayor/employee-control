package org.andres.sotomayor.employeeservice.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class Deductions implements Serializable {
    @Serial
    private static final long serialVersionUID = 6704157595098975023L;
    private Integer absences;
    private Integer delays;
    private List<Taxes> taxes;
}

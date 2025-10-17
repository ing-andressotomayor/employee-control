package org.andres.sotomayor.employeeservice.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class Deduction implements Serializable {
    @Serial
    private static final long serialVersionUID = 6704157595098975023L;
    private String type;
    private Double amount;
    private String description;
}

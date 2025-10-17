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
public class Remuneration implements Serializable {
    @Serial
    private static final long serialVersionUID = 1125268676712433917L;
    private String type;
    private Double amount;
    private String description;
}

package org.andres.sotomayor.employeeservice.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class AdditionalRemuneration implements Serializable {
    @Serial
    private static final long serialVersionUID = -8544821889292419804L;
    private String remunerationName;
    private String remunerationAmount;
}

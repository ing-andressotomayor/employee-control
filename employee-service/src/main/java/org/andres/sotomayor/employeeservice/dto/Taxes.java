package org.andres.sotomayor.employeeservice.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class Taxes implements Serializable {
    @Serial
    private static final long serialVersionUID = 5997361951930292287L;
    private String taxName;
    private String taxAmount;
}

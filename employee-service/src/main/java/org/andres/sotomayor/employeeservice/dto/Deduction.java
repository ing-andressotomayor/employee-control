package org.andres.sotomayor.employeeservice.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Size(min = 1, max = 20)
    @NotBlank
    private String type;
    @Digits(integer = 10, fraction = 2)
    @NotNull
    private Double amount;
    @Size(min = 1, max = 50)
    @NotBlank
    private String description;
}

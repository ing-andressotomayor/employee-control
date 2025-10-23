package org.andres.sotomayor.employeeservice.dto;

import jakarta.validation.constraints.*;
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

    @Size(min = 1,max = 20, message = "{validation.message.size}")
    @NotBlank(message = "{validation.message.blank}")
    private String type;

    @Digits(integer = 10,fraction = 2, message = "{validation.message.digits}")
    @NotNull(message = "{validation.message.null}")
    @Positive(message = "{validation.message.positive}")
    private Double amount;

    @Size(min = 1,max = 50, message = "{validation.message.descriptions}")
    @NotBlank(message = "{validation.message.blank}")
    private String description;
}

package org.andres.sotomayor.employeeservice.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class PersonalInformation implements Serializable {
    @Serial
    private static final long serialVersionUID = -1173301774782064784L;

    @Size(min = 1, max = 20, message = "{validation.message.size}")
    @NotBlank(message = "{validation.message.blank}")
    private String name;

    @Size(min = 1, max = 20, message = "{validation.message.size}")
    @NotBlank(message = "{validation.message.blank}")
    private String lastName;

    @Size(min = 1, max = 20, message = "{validation.message.size}")
    @NotBlank(message = "{validation.message.blank}")
    private String dni;

    @Email
    @NotBlank
    private String personalEmail;

    @Size(min = 1, max = 20, message = "{validation.message.size}")
    @NotBlank(message = "{validation.message.blank}")
    private String personalNumberPhone;

    @Min(value = 18, message = "{validation.message.min.years.old}")
    @Max(value = 60, message = "{validation.message.max.years.old}")
    @NotNull(message = "{validation.message.null}")
    private Integer age;

    @Past(message = "")
    @NotNull(message = "{validation.message.null}")
    private LocalDate birthDate;
}

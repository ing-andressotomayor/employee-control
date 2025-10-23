package org.andres.sotomayor.employeeservice.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.andres.sotomayor.employeeservice.enums.State;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class LaboralInformation implements Serializable {

    @Serial
    private static final long serialVersionUID = -3060964121345458095L;
    @Size(min = 1, max = 30, message = "{validation.message.size}")
    @NotBlank(message = "{validation.message.blank}")
    private String jobPosition;

    private String employeeNumber;

    @Min(value = 18, message = "{validation.message.min.years.old}")
    @Max(value = 60, message = "{validation.message.max.years.old}")
    @NotNull(message = "{validation.message.null}")
    private Integer yearsOld;

    @PastOrPresent(message = "{validation.message.past.present}")
    @NotNull
    private LocalDate dateOfEntry;

    @Min(value = 1, message = "{validation.message.min.weekly.working.hours}")
    @Max(value = 50, message = "{validation.message.max.weekly.working.hours}")
    @NotNull(message = "{validation.message.null}")
    private Integer weeklyWorkingHours;

    @NotBlank(message = "{validation.message.blank}")
    @Size(min = 1, max = 15, message = "{validation.message.size}")
    private String corporatePhoneNumber;

    @Email(message = "{validation.message.email}")
    @NotNull(message = "{validation.message.null}")
    private String emailCorporate;

    @Enumerated(EnumType.STRING)
    private State state;

    @Digits(integer = 10, fraction = 2, message = "{validation.message.digits}")
    @Positive(message = "{validation.message.positive}")
    @NotNull(message = "{validation.message.null}")
    private Double netSalary;
}

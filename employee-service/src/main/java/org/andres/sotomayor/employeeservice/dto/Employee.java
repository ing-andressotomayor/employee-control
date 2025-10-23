package org.andres.sotomayor.employeeservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 8983907628592843589L;
    private Long id;

    @Valid
    @NotNull(message = "{validation.message.null}")
    private LaboralInformation laboralInformation;

    @Valid
    @NotNull(message = "{validation.message.null}")
    private PersonalInformation personalInformation;

    @Valid
    @NotNull(message = "{validation.message.null}")
    @Size(min = 1,message = "{validation.message.size.collections}")
    private List<GrossMonthlyCompensation> grossMonthlyCompensations = new ArrayList<>();

    @Valid
    @NotNull(message = "{validation.message.null}")
    @Size(min = 1,message = "{validation.message.size.collections}")
    private List<Deduction> deductions = new ArrayList<>();

}

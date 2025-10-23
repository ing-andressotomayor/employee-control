package org.andres.sotomayor.employeeservice.dto;

import jakarta.validation.Valid;
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
    private LaboralInformation laboralInformation;
    @Valid
    private PersonalInformation personalInformation;
    @Valid
    private List<Remuneration> remunerations = new ArrayList<>();
    @Valid
    private List<Deduction> deductions = new ArrayList<>();

}

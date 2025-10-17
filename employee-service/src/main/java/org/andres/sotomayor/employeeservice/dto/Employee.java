package org.andres.sotomayor.employeeservice.dto;

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
    private LaboralInformation laboralInformation;
    private PersonalInformation personalInformation;
    private List<Remuneration> remunerations = new ArrayList<>();
    private List<Deduction> deductions = new ArrayList<>();

}

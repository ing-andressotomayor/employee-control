package org.andres.sotomayor.employeeservice.dto.input;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 8983907628592843589L;
    private LaboralInformation laboralInformation;
    private PersonalInformation personalInformation;
    private RemunerationInformation remunerationInformation;
}

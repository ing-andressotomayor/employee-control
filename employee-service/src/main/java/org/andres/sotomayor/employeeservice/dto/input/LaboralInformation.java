package org.andres.sotomayor.employeeservice.dto.input;

import lombok.Data;

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
    private String jobPosition;
    private Integer yearsOld;
    private LocalDate dateOfEntry;
    private Integer weeklyWorkingHours;
}

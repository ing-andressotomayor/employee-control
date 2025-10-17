package org.andres.sotomayor.employeeservice.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.andres.sotomayor.employeeservice.entity.EmployeeEntity;
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
    private String jobPosition;
    private String employeeNumber;
    private Integer yearsOld;
    private LocalDate dateOfEntry;
    private Integer weeklyWorkingHours;
    private String corporatePhoneNumber;
    private String emailCorporate;
    @Enumerated(EnumType.STRING)
    private State state;
    private Double netSalary;
}

package org.andres.sotomayor.employeeservice.dto.input;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */

@Data
public class RemunerationInformation implements Serializable {
    @Serial
    private static final long serialVersionUID = 1125268676712433917L;
    private Double grossMonthlySalary;
    private Double monthlyNetSalary;
    private Double weeklyNetSalary;
    private Double dailyNetSalary;
}

package org.andres.sotomayor.employeeservice.listener;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;
import org.andres.sotomayor.employeeservice.entity.EmployeeEntity;
import org.andres.sotomayor.employeeservice.entity.RemunerationEntity;
import org.springframework.stereotype.Component;

/**
 * Created by Andrés Sotomayor Venegas on 17/10/2025.
 * employee-control
 */

@Component
public class EmployeeListener {

    @PrePersist
    public void employeePrePersist(EmployeeEntity employee){
        Double totalRemuneration = 0.0;

        for (RemunerationEntity remuneration : employee.getRemunerations()){
            totalRemuneration += remuneration.getAmount();
        }
        employee.getLaboralInformation().setNetSalary(totalRemuneration);
    }
}

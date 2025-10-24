package org.andres.sotomayor.employeeservice.repository;

import org.andres.sotomayor.employeeservice.model.DeductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andrés Sotomayor Venegas on 16/10/2025.
 * employee-control
 */
public interface DeductionsRepository extends JpaRepository<DeductionEntity,Long> {
}

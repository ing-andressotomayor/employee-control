package org.andres.sotomayor.employeeservice.repository;

import org.andres.sotomayor.employeeservice.model.LaboralInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andrés Sotomayor Venegas on 16/10/2025.
 * employee-control
 */
public interface LaboralInformationRepository extends JpaRepository<LaboralInformationEntity,Long> {
}

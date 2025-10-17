package org.andres.sotomayor.employeeservice.jpa;

import org.andres.sotomayor.employeeservice.entity.RemunerationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andrés Sotomayor Venegas on 16/10/2025.
 * employee-control
 */
public interface RemunerationRepository extends JpaRepository<RemunerationEntity,Long> {
}

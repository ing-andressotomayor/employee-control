package org.andres.sotomayor.employeeservice.repository;

import org.andres.sotomayor.employeeservice.model.CompensationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompensationRepository extends JpaRepository<CompensationEntity, Long> {
}

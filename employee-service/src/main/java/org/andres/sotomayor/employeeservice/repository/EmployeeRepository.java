package org.andres.sotomayor.employeeservice.repository;

import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.model.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by Andrés Sotomayor Venegas on 16/10/2025.
 * employee-control
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    Page<EmployeeEntity> findByPersonalInformationNameContaining(String personalInformationName, Pageable pageable);
    Optional<EmployeeEntity> findByLaboralInformationEmployeeNumber(String employeeNumber);
}

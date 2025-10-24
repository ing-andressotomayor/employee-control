package org.andres.sotomayor.employeeservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
@Entity
@Table(name = "deductions")
public class DeductionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double percentage;
    private String description;
    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
}

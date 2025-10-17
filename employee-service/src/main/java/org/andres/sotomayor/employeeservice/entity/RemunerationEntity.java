package org.andres.sotomayor.employeeservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */

@Data
@Entity
@Table(name = "remuneration_information")
public class RemunerationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double amount;
    private String description;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;

}

package org.andres.sotomayor.employeeservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */

@Data
@Entity
@Table(name = "remuneration_information")
public class RemunerationInformationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "gross_monthly_salary")
    private Double grossMonthlySalary;
    @Column(name = "monthly_net_salary")
    private Double monthlyNetSalary;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "remunerationInformation")
    private List<AdditionalRemunerationEntity> additionalRemunerations;

    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
}

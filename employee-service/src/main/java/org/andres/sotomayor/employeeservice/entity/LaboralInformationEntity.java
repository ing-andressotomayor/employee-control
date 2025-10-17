package org.andres.sotomayor.employeeservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.andres.sotomayor.employeeservice.enums.State;

import java.time.LocalDate;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
@Entity
@Table(name = "laboral_information")
public class LaboralInformationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "job_position")
    private String jobPosition;
    @Column(name = "employee_number")
    private String employeeNumber;
    @Column(name = "years_old")
    private Integer yearsOld;
    @Column(name = "date_entry")
    private LocalDate dateOfEntry;
    @Column(name = "weekly_working_hours")
    private Integer weeklyWorkingHours;
    @Column(name = "corporate_phone_number")
    private String corporatePhoneNumber;
    @Column(name = "email_corporate")
    private String emailCorporate;
    @Enumerated(EnumType.STRING)
    private State state;
    private Double netSalary;

    @ToString.Exclude
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;
}

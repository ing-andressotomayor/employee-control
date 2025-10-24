package org.andres.sotomayor.employeeservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
@Entity
@Table(name = "personal_information")
public class PersonalInformationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String dni;
    @Column(name = "personal_email")
    private String personalEmail;
    @Column(name = "personal_number_phone")
    private String personalNumberPhone;
    private Integer age;
    @Column(name = "brith_date")
    private LocalDate birthDate;

    @ToString.Exclude
    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;

}

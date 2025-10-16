package org.andres.sotomayor.employeeservice.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */

@Data
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.REMOVE, mappedBy = "employee", fetch = FetchType.EAGER)
    private LaboralInformationEntity laboralInformation;
    @OneToOne(cascade = CascadeType.REMOVE, mappedBy = "employee", fetch = FetchType.EAGER)
    private PersonalInformationEntity personalInformation;
    @OneToOne(cascade = CascadeType.REMOVE, mappedBy = "employee", fetch = FetchType.EAGER)
    private RemunerationInformationEntity remunerationInformation;
}

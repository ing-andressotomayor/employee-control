package org.andres.sotomayor.employeeservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.andres.sotomayor.employeeservice.listener.EmployeeListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */

@Data
@Entity
@Table(name = "employees")
@EntityListeners(EmployeeListener.class)
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "employee", fetch = FetchType.EAGER)
    private LaboralInformationEntity laboralInformation;
    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "employee", fetch = FetchType.EAGER)
    private PersonalInformationEntity personalInformation;
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "employee", fetch = FetchType.EAGER)
    private List<RemunerationEntity> remunerations = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST},mappedBy = "employee")
    private List<DeductionEntity> deductions = new ArrayList<>();
}

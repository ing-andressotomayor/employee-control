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
@Table(name = "deductions")
public class DeductionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer absences;
    private Integer delays;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "deductions")
    private List<TaxesEntity> taxes;
}

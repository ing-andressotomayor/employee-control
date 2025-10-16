package org.andres.sotomayor.employeeservice.dto.input;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Andrés Sotomayor Venegas on 15/10/2025.
 * employee-control
 */
@Data
public class PersonalInformation implements Serializable {
    @Serial
    private static final long serialVersionUID = -1173301774782064784L;
    private String name;
    private String lastName;
    private String personalEmail;
    private Integer age;
    private LocalDate birthdate;
}

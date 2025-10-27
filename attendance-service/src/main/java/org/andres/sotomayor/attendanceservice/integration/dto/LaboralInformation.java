package org.andres.sotomayor.attendanceservice.integration.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class LaboralInformation implements Serializable {
    @Serial
    private static final long serialVersionUID = -3405799567294282060L;
    private String employeeNumber;
}

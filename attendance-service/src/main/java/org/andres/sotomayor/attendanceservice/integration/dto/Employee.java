package org.andres.sotomayor.attendanceservice.integration.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 500728812040258682L;
    private LaboralInformation laboralInformation;
}

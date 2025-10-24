package org.andres.sotomayor.employeeservice.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Compensation implements Serializable {
    @Serial
    private static final long serialVersionUID = 85413354184827276L;
    private String type;
    private Double amount;
    private String description;
}

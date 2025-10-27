package org.andres.sotomayor.attendanceservice.errorhandling;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class MessageDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -5441479088248784488L;
    private String field;
    private String message;
}

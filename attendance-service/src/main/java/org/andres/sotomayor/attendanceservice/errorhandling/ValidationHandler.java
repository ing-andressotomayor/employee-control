package org.andres.sotomayor.attendanceservice.errorhandling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ValidationHandler {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<MessageDTO> handleIllegalStateException(IllegalStateException ex){
        log.error(ex.getMessage());
        log.error("service employee-service unavailable");
        return ResponseEntity.status(503).body(
                MessageDTO.builder()
                        .message(ex.getMessage())
                        .message("error code: " + 503)
                        .build()
        );
    }
}

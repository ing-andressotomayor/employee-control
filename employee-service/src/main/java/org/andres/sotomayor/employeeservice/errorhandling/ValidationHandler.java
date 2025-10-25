package org.andres.sotomayor.employeeservice.errorhandling;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ValidationHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<MessageDTO>> handleException(MethodArgumentNotValidException e) {
         List<MessageDTO> messages =  e.getBindingResult().getFieldErrors().stream().map(error->
            MessageDTO.builder()
                    .field(error.getField())
                    .message(error.getDefaultMessage())
                    .build()
        ).toList();
         return ResponseEntity.badRequest().body(messages);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Void> entityNotFoundException(EntityNotFoundException e) {
        return ResponseEntity.notFound().build();
    }
}

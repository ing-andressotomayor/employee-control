package org.andres.sotomayor.attendanceservice.controller;

import org.andres.sotomayor.attendanceservice.integration.dto.Employee;
import org.andres.sotomayor.attendanceservice.integration.rest.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendDanceController {
    @Autowired
    private RestService restService;
    @GetMapping
    public ResponseEntity<Employee> test(){
        return ResponseEntity.ok(restService.getEmployeeForEmployeeNumber("b6fc1c3a-bc00-444f-b034-97390f21fe0d"));
    }
}

package org.andres.sotomayor.employeeservice.controller;

import jakarta.validation.Valid;
import org.andres.sotomayor.employeeservice.dto.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Andrés Sotomayor Venegas on 17/10/2025.
 * employee-control
 */
@RestController
@RequestMapping(value = "api/employee")
public class EmployeeController {

    @PostMapping("create")
    public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee) {
        return null;
    }

    @GetMapping("search-matches-by-name")
    public ResponseEntity<Employee> findByName(@RequestParam String name) {
        return null;
    }

    @GetMapping("find-by-id")
    public ResponseEntity<Employee> findById(@RequestParam Long id) {
        return null;
    }

    @GetMapping("find-by-employee-number")
    public ResponseEntity<Employee> findByEmployeeNumber(@RequestParam String employeeNumber) {
        return null;
    }

    @DeleteMapping("delete-by-employee-number")
    public ResponseEntity<Employee> deleteByEmployeeNumber(@RequestParam String employeeNumber) {
        return null;
    }
}

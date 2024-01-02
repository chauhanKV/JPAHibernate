package com.example.springJPA.controller;

import com.example.springJPA.entity.Employee;
import com.example.springJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmp(@RequestBody Employee employee)
    {
        Employee response = employeeService.createEmployee(employee);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployees(@PathVariable Long id)
    {
        Employee employee = employeeService.getEmployees(id);
        return ResponseEntity.ok().body(employee);
    }

    @GetMapping("/email")
    public ResponseEntity<Employee> getEmployeeByEmail(@RequestParam String email)
    {
        Employee employeeByEmail = employeeService.getEmployeeByEmail(email);
        return ResponseEntity.ok().body(employeeByEmail);
    }
}

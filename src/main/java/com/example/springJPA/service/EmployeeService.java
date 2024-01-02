package com.example.springJPA.service;

import com.example.springJPA.entity.Employee;
import com.example.springJPA.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;

    public Employee createEmployee(Employee emp)
    {
        emp = employeeRepo.save(emp);
        return emp;
    }

    public Employee getEmployees(Long id)
    {
        return employeeRepo.findById(id).orElse(null);
    }

    public Employee getEmployeeByEmail(String email)
    {
        return employeeRepo.findByEmail(email);
    }

}

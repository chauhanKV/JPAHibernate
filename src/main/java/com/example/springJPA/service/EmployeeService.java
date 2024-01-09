package com.example.springJPA.service;

import com.example.springJPA.EmployeeDetailDTO;
import com.example.springJPA.entity.Address;
import com.example.springJPA.entity.Employee;
import com.example.springJPA.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;

    public Employee createEmployee(EmployeeDetailDTO employeeDetailDTO)
    {
        Employee employee = Employee.builder().name(employeeDetailDTO.getName()).email(employeeDetailDTO.getEmail()).build();
        Address address = Address.builder().line1(employeeDetailDTO.getLine1()).line2(employeeDetailDTO.getLine2()).city(employeeDetailDTO.getCity()).build();
        employee.setAddress(address);
        Employee emp = employeeRepo.save(employee);
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

    public Employee deleteEmployee(Long id)
    {
        Employee emp = getEmployees(id);
        employeeRepo.delete(emp);
        return emp;
    }

}

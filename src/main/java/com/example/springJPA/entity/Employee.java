package com.example.springJPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @OneToOne
    private Address address;

    // @ManyToOne -> Many employees can be mapped to one branch
    // @JsonIgnoreProperties -> this will not include employeeSet inside Branch response
    @ManyToOne
    @JsonIgnoreProperties("employeeSet")
    private Branch branch;

}

package com.example.springJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication {


	// Hibernate is a open source, lightweight, ORM (Object Relational Mapping) -> its converts Objects into Database tables and columns.
	// Hibernate implements the specification of JPA (JAVA Persistence API) for data persistence.
	// Hibernate uses Hibernate query language which makes it database independent.
	// It supports DDL operations
	// Hibernate has Auto Primary Key Generate Support
	// It supports Cache memory
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}

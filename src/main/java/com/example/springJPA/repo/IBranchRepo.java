package com.example.springJPA.repo;

import com.example.springJPA.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBranchRepo extends JpaRepository<Branch, Long> {
}

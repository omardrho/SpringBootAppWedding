package com.example.mariagee.repository;

import com.example.mariagee.entity.Mariage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MariageRepo extends JpaRepository<Mariage,Long> {
}

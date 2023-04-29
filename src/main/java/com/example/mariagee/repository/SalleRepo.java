package com.example.mariagee.repository;

import com.example.mariagee.entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepo extends JpaRepository<Salle,Integer> {
}

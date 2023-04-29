package com.example.mariagee.repository;

import com.example.mariagee.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepo extends JpaRepository<Personne, Integer> {
}

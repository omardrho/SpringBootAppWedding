package com.example.mariagee.controller;

import com.example.mariagee.entity.Mariage;
import com.example.mariagee.entity.Personne;
import com.example.mariagee.repository.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonneController {
    @Autowired
    PersonneRepo personneRepo;



    @GetMapping("/all/personnes")
    private List<Personne> getAllPersonnes(){

        return personneRepo.findAll();
    }
    @DeleteMapping("/delete/personne/{cin}")
    private void deleteCIN(@PathVariable int cin){

    }


}

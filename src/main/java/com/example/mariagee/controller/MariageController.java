package com.example.mariagee.controller;

import com.example.mariagee.entity.Mariage;
import com.example.mariagee.repository.MariageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MariageController {
    @Autowired
    MariageRepo mariageRepo;




    @GetMapping("/all/mariages")
    private List<Mariage> getAll(){
        return mariageRepo.findAll();
    }
}

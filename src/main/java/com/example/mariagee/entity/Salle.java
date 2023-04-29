package com.example.mariagee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Salle {
    @Id
    private int id;
    private String nom;
    private String adresse;
    private String ville;
    private int capacite;
    @OneToMany(mappedBy = "salle")
    @JsonIgnore
    private List<Mariage> mariages;
}

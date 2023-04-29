package com.example.mariagee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import java.util.List;

@Inheritance
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Personne {
    @Id
    private int CIN;
    @NotNull
    private  String nom;
    @OneToMany(mappedBy = "epoux")
    @JsonIgnore
    private List<Mariage> mariages_epoux;
    @OneToMany(mappedBy = "epouse")
    @JsonIgnore
    private List<Mariage> mariages_epouse;
}

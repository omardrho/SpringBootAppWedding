package com.example.mariagee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Invite extends Personne{

    @ManyToMany(mappedBy = "invites")
    @JsonIgnore
    private List<Mariage> mariages;



}

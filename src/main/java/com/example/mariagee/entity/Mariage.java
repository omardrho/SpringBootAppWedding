package com.example.mariagee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Mariage {
    @Id
    private Long numero;
    private Date localdate;
    private int nbrMaxTemoins;
    private int capaciteMax;
    private int nbrMaxInviteEpoux;
    @ManyToOne
    private Personne epoux;
    @ManyToOne
    private Personne epouse;
    @ManyToMany
    private List<Invite> invites;
    @ManyToOne
    private Salle salle;

}

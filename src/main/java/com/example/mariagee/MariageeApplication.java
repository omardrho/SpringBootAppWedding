package com.example.mariagee;

import com.example.mariagee.entity.Invite;
import com.example.mariagee.entity.Mariage;
import com.example.mariagee.entity.Personne;
import com.example.mariagee.entity.Salle;
import com.example.mariagee.repository.InviteRepo;
import com.example.mariagee.repository.MariageRepo;
import com.example.mariagee.repository.PersonneRepo;
import com.example.mariagee.repository.SalleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MariageeApplication {
    @Autowired
    PersonneRepo personneRepo;
    @Autowired
    InviteRepo inviteRepo;
    @Autowired
    MariageRepo mariageRepo;
    @Autowired
    SalleRepo salleRepo;


    public static void main(String[] args) {
        SpringApplication.run(MariageeApplication.class, args);
    }
    @Bean
    CommandLineRunner start(){
        return args -> {
            Personne personne= new Personne();
            Personne personne1= new Personne();
            Invite invite= new Invite();
            Mariage mariage = new Mariage();
            Salle salle = new Salle();
            personne.setCIN(2);
            personne.setNom("hamid");
            personne1.setCIN(3);
            personneRepo.save(personne);
            personneRepo.save(personne1);
            personne1.setNom("hamida");
            invite.setCIN(1);
            invite.setNom("omar");
            inviteRepo.save(invite);
            mariage.setNumero(1L);
            mariage.setEpouse(personne1);
            mariage.setEpoux(personne);
            mariageRepo.save(mariage);
            salle.setNom("9a3a");
            salle.setAdresse("bla");
            salle.setId(1);
            salle.setCapacite(155);
            salle.setVille("Meknes");
            salleRepo.save(salle);
            List<Invite> list = inviteRepo.findAll();
            mariage.setInvites(list);
            mariageRepo.save(mariage);


        };
    }

}

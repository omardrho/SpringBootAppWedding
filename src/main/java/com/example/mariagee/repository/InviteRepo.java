package com.example.mariagee.repository;

import com.example.mariagee.entity.Invite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteRepo extends JpaRepository<Invite, Integer> {
}

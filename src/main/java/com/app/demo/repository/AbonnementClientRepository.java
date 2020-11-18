package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entities.ClientAbonnement;

@Repository
public interface AbonnementClientRepository extends JpaRepository<ClientAbonnement, Long> {

}

package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entities.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long>{

}

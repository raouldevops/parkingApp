package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

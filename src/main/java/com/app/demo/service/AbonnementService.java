package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entities.Abonnement;
import com.app.demo.repository.AbonnementRepository;

@RestController
public class AbonnementService {
	@Autowired
	AbonnementRepository abonnementRepository;
	
	@GetMapping(value = "/abonnementRest")
	public List<Abonnement> getAllAbonnement(){
		return abonnementRepository.findAll(Sort.by(Direction.DESC, "idAbonnement"));
	}
	
	@PostMapping(value = "/saveAbonnementRest")
	public Abonnement saveAbonnement(Abonnement abonnement) {
		return abonnementRepository.save(abonnement);
	}
}

package com.app.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entities.Abonnement;
import com.app.demo.repository.AbonnementRepository;

@Service
public class AbonnementService {
	@Autowired
	AbonnementRepository abonnementRepository;
	
	public List<Abonnement> getAllAbonnement(){
		return abonnementRepository.findAll(Sort.by(Direction.DESC, "idAbonnement"));
	}
	
	public Abonnement saveAbonnement(Abonnement abonnement) {
		return abonnementRepository.save(abonnement);
	}
	
	public Optional<Abonnement> getAbonnementById(Long id) {
		return abonnementRepository.findById(id);
	}
	
	public boolean deleteAbonnement(Long id) {
		abonnementRepository.deleteById(id);
		return true;
	}
}

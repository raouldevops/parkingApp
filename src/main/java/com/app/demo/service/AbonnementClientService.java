package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entities.ClientAbonnement;
import com.app.demo.repository.AbonnementClientRepository;

@Service
public class AbonnementClientService {
	@Autowired
	AbonnementClientRepository abonnementClientRepository;
	
	public List<ClientAbonnement> getAllAbonnementCustomer() {
		return abonnementClientRepository.findAll();
	}
	
	public ClientAbonnement saveClientAbonnement(ClientAbonnement clientAbonnement) {
		return abonnementClientRepository.save(clientAbonnement);
	}

}

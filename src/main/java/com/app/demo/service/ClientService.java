package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entities.Client;
import com.app.demo.repository.ClientRepository;

@RestController
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping(value = "/clientRest")
	public List<Client> getAllClient(){
		return clientRepository.findAll();
	}
	
	@PostMapping(value = "/clientsaveRest")
	public Client saveClient(Client client){
		return clientRepository.save(client);
	}
	
	
	

}

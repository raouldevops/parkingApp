package com.app.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entities.Client;
import com.app.demo.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	public List<Client> getAllClient(){
		return clientRepository.findAll();
	}
	
	public Client saveClient(Client client){
		return clientRepository.save(client);
	}
	
	public Client getClientById(long id) {
		return clientRepository.findById(id).get();
	}
	
	public boolean deleteClient(long id) {
		 clientRepository.deleteById(id);
		 return true;
	}
	

}

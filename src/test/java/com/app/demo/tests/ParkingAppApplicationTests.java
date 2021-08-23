package com.app.demo.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.demo.repository.ClientRepository;

import com.app.demo.entities.Client;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ParkingAppApplicationTests {
	
	@Autowired
	ClientRepository clientRepository;

	@Test
	@Order(1)
	public void testInsertClient() {
		Client client=new Client();

		client.setImmatriculation("kmlkmmkkk021");
		client.setMarque("toyota");
		client.setModele("auris");
		client.setNom("test");
		client.setTelephone("123456789");
		client.setIs_deleted(true);
		clientRepository.save(client);
		
		assertThat(client.getIdclient()).isGreaterThan(0);
	}
	

	@Test
	@Order(2)
	public void testReadAll() {
		List<Client> list=clientRepository.findAll();
		assertThat(list).size().isGreaterThan(0);	
	}
	/*
	@Test
	@Order(3)
	public void testGetOne() {
		Client c=clientRepository.findById(1L).get();
		assertThat(c.getNom()).isEqualTo("test");	
	}
	
	@Test
	@Order(4)
	public void testUpdate() {
		Client c=clientRepository.findById(1L).get();
		c.setModele("Mercedes Benz");
		clientRepository.save(c);
		assertThat(c.getNom()).isEqualTo("test");
	}

	@Test
	@Order(5)
	public void testDelete() {
		clientRepository.deleteById(1L);
		assertThat(clientRepository.existsById(1L)).isFalse();
	}*/
}

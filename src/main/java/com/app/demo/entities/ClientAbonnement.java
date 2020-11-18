package com.app.demo.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ClientAbonnement implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idClientAbonnement;
	
	@ManyToOne
    @MapsId("clientID")
    @JoinColumn(name = "idclient")
	private Client client;
	
    @ManyToOne
    @MapsId("abonnementID")
    @JoinColumn(name = "idAbonnement")
	private Abonnement abonnement;
    
	private String etatAbonnement;
	private LocalDateTime  dateAbonnement;
	public ClientAbonnement(Long idClientAbonnement, Client client, Abonnement abonnement, String etatAbonnement,
			LocalDateTime dateAbonnement) {
		super();
		this.idClientAbonnement = idClientAbonnement;
		this.client = client;
		this.abonnement = abonnement;
		this.etatAbonnement = etatAbonnement;
		this.dateAbonnement = dateAbonnement;
	}
	public ClientAbonnement() {
		super();
	}
	public Long getIdClientAbonnement() {
		return idClientAbonnement;
	}
	public void setIdClientAbonnement(Long idClientAbonnement) {
		this.idClientAbonnement = idClientAbonnement;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Abonnement getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
	public String getEtatAbonnement() {
		return etatAbonnement;
	}
	public void setEtatAbonnement(String etatAbonnement) {
		this.etatAbonnement = etatAbonnement;
	}
	public LocalDateTime getDateAbonnement() {
		return dateAbonnement;
	}
	public void setDateAbonnement(LocalDateTime dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}
	

}

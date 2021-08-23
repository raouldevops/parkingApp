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
	private Client client;
	
    @ManyToOne
	private Abonnement abonnement;
    
	private String etatAbonnement;
	private java.sql.Date  start_date;
	private java.sql.Date  end_date;
	
	public ClientAbonnement(Long idClientAbonnement, Client client, Abonnement abonnement, String etatAbonnement,
			java.sql.Date start_date, java.sql.Date end_date) {
		super();
		this.idClientAbonnement = idClientAbonnement;
		this.client = client;
		this.abonnement = abonnement;
		this.etatAbonnement = etatAbonnement;
		this.start_date = start_date;
		this.end_date = end_date;
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
	public java.sql.Date getStart_date() {
		return start_date;
	}
	public void setStart_date(java.sql.Date start_date) {
		this.start_date = start_date;
	}
	public java.sql.Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(java.sql.Date end_date) {
		this.end_date = end_date;
	}
	
	

}

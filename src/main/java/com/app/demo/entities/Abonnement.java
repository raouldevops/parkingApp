package com.app.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Abonnement implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAbonnement;
	private String typeAbonnement;
	private double montantAbonnement;
	
	@OneToMany(mappedBy = "abonnement")
    Set<ClientAbonnement> abonnements;
	
	public Abonnement(Long idAbonnement, String typeAbonnement, double montantAbonnement) {
		super();
		this.idAbonnement = idAbonnement;
		this.typeAbonnement = typeAbonnement;
		this.montantAbonnement = montantAbonnement;
	}
	public Abonnement() {
		super();
	}
	public Long getIdAbonnement() {
		return idAbonnement;
	}
	public void setIdAbonnement(Long idAbonnement) {
		this.idAbonnement = idAbonnement;
	}
	public String getTypeAbonnement() {
		return typeAbonnement;
	}
	public void setTypeAbonnement(String typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}
	public double getMontantAbonnement() {
		return montantAbonnement;
	}
	public void setMontantAbonnement(double montantAbonnement) {
		this.montantAbonnement = montantAbonnement;
	}
	
	
	
	
}

package com.app.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Client implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idclient;

	private String nom;
	
	private String immatriculation;
	
	private String marque;
	
	private String modele;

	private String telephone;
	
	private boolean is_deleted;
	
	@OneToMany(mappedBy = "client")
    Set<ClientAbonnement> abonnements;
	
	public Client() {
		super();
	}
	
	public Client(Long idclient, String nom, String immatriculation, String marque, String modele, String telephone,
			boolean is_deleted) {
		super();
		this.idclient = idclient;
		this.nom = nom;
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.telephone = telephone;
		this.is_deleted = is_deleted;
	}
	public Long getIdclient() {
		return idclient;
	}
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public boolean isIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

}

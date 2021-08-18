package com.sip.git.entities;

//import javax.persistence.Entity;

//@Entity
public class user {
	
	private long id;
	private String nom;
	private String prenom;
	/**
	 * 
	 */
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}

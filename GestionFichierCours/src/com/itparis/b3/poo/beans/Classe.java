package com.itparis.b3.poo.beans;

public class Classe {

	private int idClasse;
	private String nomClasse;
	
	
	public Classe(int idClasse, String nomClasse) {
		super();
		this.idClasse = idClasse;
		this.nomClasse = nomClasse;
	}


	public int getIdClasse() {
		return idClasse;
	}


	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}


	public String getNomClasse() {
		return nomClasse;
	}


	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	
	
	
}

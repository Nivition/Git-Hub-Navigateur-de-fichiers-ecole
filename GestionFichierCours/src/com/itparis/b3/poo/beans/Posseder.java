package com.itparis.b3.poo.beans;

public class Posseder {
	
	private int idClasse;
	private int idCours;
	
	public Posseder(int idClasse, int idCours) {
		super();
		this.idClasse = idClasse;
		this.idCours = idCours;
	}

	public int getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}
	
	

}

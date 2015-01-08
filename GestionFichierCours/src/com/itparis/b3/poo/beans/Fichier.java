package com.itparis.b3.poo.beans;

public class Fichier {
	
	private int idFichier;
	private String nomFichier;
	private String dateFichier;
	private int idCours;
	
	public Fichier(int idFichier, String nomFichier, String dateFichier,
			int idCours) {
		super();
		this.idFichier = idFichier;
		this.nomFichier = nomFichier;
		this.dateFichier = dateFichier;
		this.idCours = idCours;
	}

	public int getIdFichier() {
		return idFichier;
	}

	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public String getDateFichier() {
		return dateFichier;
	}

	public void setDateFichier(String dateFichier) {
		this.dateFichier = dateFichier;
	}

	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}
	
	
	

}

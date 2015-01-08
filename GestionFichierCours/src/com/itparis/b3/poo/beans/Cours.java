package com.itparis.b3.poo.beans;

public class Cours {
	
	private int idCours;
	private String nomCours;
	private String dateCours;
	private int idProf;
	private int idMatiere;
	private int idModule;
	
	public Cours(int idCours, String nomCours, String dateCours, int idProf,
			int idMatiere, int idModule) {
		super();
		this.idCours = idCours;
		this.nomCours = nomCours;
		this.dateCours = dateCours;
		this.idProf = idProf;
		this.idMatiere = idMatiere;
		this.idModule = idModule;
	}

	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	public String getNomCours() {
		return nomCours;
	}

	public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}

	public String getDateCours() {
		return dateCours;
	}

	public void setDateCours(String dateCours) {
		this.dateCours = dateCours;
	}

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public int getIdModule() {
		return idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	
	
}

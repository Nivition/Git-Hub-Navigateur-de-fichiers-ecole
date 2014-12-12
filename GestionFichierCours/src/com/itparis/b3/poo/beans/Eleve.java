package com.itparis.b3.poo.beans;

public class Eleve {

	private int idEleve;
	private String prenomEleve;
	private String nomEleve;
	private String mailEleve;
	private int idClasse;
	
	public Eleve(int idEleve, String prenomEleve, String nomEleve,
			String mailEleve, int idClasse) {
		super();
		this.idEleve = idEleve;
		this.prenomEleve = prenomEleve;
		this.nomEleve = nomEleve;
		this.mailEleve = mailEleve;
		this.idClasse = idClasse;
	}

	public int getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
	}

	public String getPrenomEleve() {
		return prenomEleve;
	}

	public void setPrenomEleve(String prenomEleve) {
		this.prenomEleve = prenomEleve;
	}

	public String getNomEleve() {
		return nomEleve;
	}

	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}

	public String getMailEleve() {
		return mailEleve;
	}

	public void setMailEleve(String mailEleve) {
		this.mailEleve = mailEleve;
	}

	public int getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	
	
	
	
	
}

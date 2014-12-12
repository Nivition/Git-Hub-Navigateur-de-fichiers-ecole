package com.itparis.b3.poo.beans;

public class Prof {
	
	private int idProf;
	private String nomProf;
	private String prenomProf;
	private String mailProf;
	

	public Prof(int idProf, String nomProf, String prenomProf, String mailProf) {
		super();
		this.idProf = idProf;
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.mailProf = mailProf;
	}

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public String getNomProf() {
		return nomProf;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public String getPrenomProf() {
		return prenomProf;
	}

	public void setPrenomProf(String prenomProf) {
		this.prenomProf = prenomProf;
	}

	public String getMailProf() {
		return mailProf;
	}

	public void setMailProf(String mailProf) {
		this.mailProf = mailProf;
	}

	
	
	
}

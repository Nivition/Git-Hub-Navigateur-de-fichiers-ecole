package com.itparis.b3.poo.beans;

public class User {

	private int idUser;
	private String nomUser;
	private String passwordUser;
	private String typeUser;
	
	
	public User(int idUser, String nomUser, String passwordUser, String typeUser) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.passwordUser = passwordUser;
		this.typeUser = typeUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
	
	
	
	
}

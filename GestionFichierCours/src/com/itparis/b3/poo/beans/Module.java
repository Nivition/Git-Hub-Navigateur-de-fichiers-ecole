package com.itparis.b3.poo.beans;

public class Module {
	
	private int idModule;
	private String nomModule;
	public Module(int idModule, String nomModule) {
		super();
		this.idModule = idModule;
		this.nomModule = nomModule;
	}
	public int getIdModule() {
		return idModule;
	}
	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}
	public String getNomModule() {
		return nomModule;
	}
	public void setNomModule(String nomModule) {
		this.nomModule = nomModule;
	}
	
	
	

}

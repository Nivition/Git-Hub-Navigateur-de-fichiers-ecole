package com.itparis.b3.poo.dao;

import java.sql.SQLException;

import com.itparis.b3.poo.beans.Eleve;
import com.itparis.b3.poo.commons.DBAction;

public class EleveDAO {
	
	public Eleve getEleveById(int id){
		
		Eleve EleveTemp = new Eleve();
		
		try{
		DBAction.DBConnexion();
		
		String req = "select * from Eleve where id ="+id;
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		EleveTemp.setIdEleve(DBAction.getRes().getInt(id));
		EleveTemp.setNomEleve(DBAction.getRes().getString(2));
		EleveTemp.setPrenomEleve(DBAction.getRes().getString(3));
		EleveTemp.setMailEleve(DBAction.getRes().getString(4));
		EleveTemp.setIdClasse(DBAction.getRes().getInt(5));
		
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		return EleveTemp;
	}

}

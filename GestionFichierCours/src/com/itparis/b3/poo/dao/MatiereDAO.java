package com.itparis.b3.poo.dao;

import java.sql.SQLException;

import com.itparis.b3.poo.beans.Matiere;
import com.itparis.b3.poo.commons.DBAction;

public class MatiereDAO {

	public static int deleteMatiereById(int idMatiere) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Matiere  WHERE idMatiere =" + idMatiere;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static Matiere updateMatiere(int idMatiere, String nomMatiere){
		Matiere matiereTemp = new Matiere(0,null);
		try {

			String req = "UPDATE Matiere SET nomMatiere = \"" + nomMatiere+"\" WHERE IdMatiere = \"" + idMatiere+"\"";
			DBAction.DBConnexion();
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			matiereTemp.setIdMatiere(DBAction.getRes().getInt(1));
			matiereTemp.setNomMatiere(DBAction.getRes().getString(2));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return matiereTemp;
	}
	
	public static Matiere getMatiereById(int id) {
		Matiere matiereTemp = new Matiere(0,null); 
		try {

			DBAction.DBConnexion();
			String req = "SELECT * from Matiere WHERE IdMatiere = " + id;
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			matiereTemp.setIdMatiere(DBAction.getRes().getInt(1));
			matiereTemp.setNomMatiere(DBAction.getRes().getString(2));
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return matiereTemp;
	}
	
	public static Matiere addMatiere(int idMatiere,String nomMatiere) throws SQLException{
		Matiere matiereTemp = new Matiere(idMatiere,nomMatiere);
		try {

			DBAction.DBConnexion();
			String req = "INSERT INTO Matiere VALUES ('" +idMatiere +"','"+nomMatiere+"')";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			matiereTemp.setIdMatiere(DBAction.getRes().getInt(1));
			matiereTemp.setNomMatiere(DBAction.getRes().getString(2));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return matiereTemp;
		
	}
	
	
}

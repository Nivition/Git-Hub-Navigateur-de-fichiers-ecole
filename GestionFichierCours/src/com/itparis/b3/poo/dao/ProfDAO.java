package com.itparis.b3.poo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.Prof;
import com.itparis.b3.poo.commons.DBAction;

public class ProfDAO {

	public static Prof getProfById(int id) {
	Prof profTemp = new Prof(0, null, null,null);
		try {

			DBAction.DBConnexion();
			String req = "SELECT * from Prof WHERE IdProf = " + id;
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			profTemp.setIdProf(DBAction.getRes().getInt(1));
			profTemp.setNomProf(DBAction.getRes().getString(2));
			profTemp.setPrenomProf(DBAction.getRes().getString(3));
			profTemp.setMailProf(DBAction.getRes().getString(4));
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return profTemp;
	}

	public static ArrayList<Prof> getProfByNom(String nom) {
		ArrayList<Prof> listeProfTemp = new ArrayList<Prof>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Prof WHERE NomProf = " + nom;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Prof profTemp = new Prof(0, null, null,null);
				profTemp.setIdProf(DBAction.getRes().getInt(1));
				profTemp.setNomProf(DBAction.getRes().getString(2));
				profTemp.setPrenomProf(DBAction.getRes().getString(3));
				profTemp.setMailProf(DBAction.getRes().getString(4));
				listeProfTemp.add(profTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return listeProfTemp;
	}

	public static ArrayList<Prof> getProfByPrenom(String prenom) {
		ArrayList<Prof> listeProfTemp = new ArrayList<Prof>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Prof WHERE PrenomProf = " + prenom;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Prof profTemp = new Prof(0, null, null,null);
				profTemp.setIdProf(DBAction.getRes().getInt(1));
				profTemp.setNomProf(DBAction.getRes().getString(2));
				profTemp.setPrenomProf(DBAction.getRes().getString(3));
				profTemp.setMailProf(DBAction.getRes().getString(4));
				listeProfTemp.add(profTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return listeProfTemp;
	}

	public static int deleteProfById(int id) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Prof  WHERE idProf =" + id;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static Prof updateProf(int id, String mail){
		Prof profTemp = new Prof(0,null,null,null);
		try {

			String req = "UPDATE Prof SET mailProf = \"" + mail+"\" WHERE IdProf = \"" + id+"\"";
			DBAction.DBConnexion();
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			profTemp.setIdProf(DBAction.getRes().getInt(1));
			profTemp.setNomProf(DBAction.getRes().getString(2));
			profTemp.setPrenomProf(DBAction.getRes().getString(3));
			profTemp.setMailProf(DBAction.getRes().getString(4));
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return profTemp;
	}
	
	public static Prof addProf(int idProf,String nomProf,String prenomProf,String mailProf) throws SQLException{
		Prof profTemp = new Prof(idProf, nomProf, prenomProf,mailProf);
		try {

			DBAction.DBConnexion();
			String req = "INSERT INTO Prof VALUES ('" + idProf +"','"+nomProf+"','"+prenomProf+"','"+mailProf+"')";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			profTemp.setIdProf(DBAction.getRes().getInt(1));
			profTemp.setNomProf(DBAction.getRes().getString(2));
			profTemp.setPrenomProf(DBAction.getRes().getString(3));
			profTemp.setMailProf(DBAction.getRes().getString(4));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return profTemp;
		
	}
	
	
}

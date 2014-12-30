package com.itparis.b3.poo.dao;


import java.sql.SQLException;

import com.itparis.b3.poo.beans.Classe;
import com.itparis.b3.poo.beans.Cours;
import com.itparis.b3.poo.commons.DBAction;


public class CoursDAO {

	
	/**
	 * 
	 * @param num
	 * @return : null Chambre
	 * @throws SQLException
	 */
	
	
	public static Cours getCoursByIdCours(int Id) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE id = \"" + Id+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	public static Cours getCoursByNomCours(String nomCours) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE NomCours = \"" + nomCours+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(5));

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	public static Cours getCoursByDateCours(String dateCours) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE DateCours = \"" + dateCours+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(5));

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	
	public static Cours getCoursByDateIdProf(int idProf) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE IdProf = \"" + idProf+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(5));

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	
	public static Cours getCoursByIdMatiere(int idMatiere) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE IdModule = \"" +idMatiere+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(5));

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	public static Cours getCoursByIdModule(int idModule) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE IdModule = \"" +idModule+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int deleteClasseById(int Id) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE Id =" + Id;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static int deleteClasseByNomCours(String nomCours) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE NomCours =" + nomCours;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static int deleteClasseByDateCours(String DateCours) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE DateCours =" + DateCours;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static int deleteClasseByIdProf(int IdProf) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE IdProf =" + IdProf;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static int deleteClasseByIdMatiere(int IdMatiere) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE IdMatière =" + IdMatiere;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static int deleteClasseByIdModule(int IdModule) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE IdMatière =" + IdModule;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	
	
	
	
	public static Cours updateCoursById(int idCours,String nomCours,String dateCours, int idProf, int idMatiere, int idModule) throws SQLException {
		Cours CoursTemp = new Cours(idCours,nomCours, dateCours, idProf, idMatiere, idModule);
		
		String req = "UPDATE Cours SET NomCLasse = \"" + nomCours+"\", DateCours = \"" + dateCours+"\", IdCLasse = \"" + idProf +"\", idMatiere = \"" + idMatiere+"\", idModule = \"" + idModule+"\" WHERE IdCours = \"" + idCours+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdProf(DBAction.getRes().getInt(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getInt(5));
		CoursTemp.setIdModule(DBAction.getRes().getInt(4));

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return CoursTemp;
	}
	
	
}

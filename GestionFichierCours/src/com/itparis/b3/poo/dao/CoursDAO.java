package com.itparis.b3.poo.dao;


import java.sql.SQLException;

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
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	public static Cours getCoursByNomCours(String nomCours) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE NomCours = \"" + nomCours+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setdNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	public static Cours getCoursByDateCours(String dateCours) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE DateCours = \"" + dateCours+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setdNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	
	public static Cours getCoursByDateIdProf(int idProf) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE IdProf = \"" + idProf+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setdNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	
	public static Cours getCoursByIdModule(int idModule) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE IdModule = \"" +idModule+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setdNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	public static Cours getCoursById(int id) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE Id = \"" +id+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setdNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	public static Cours getCoursByNomCours(String nomCours) throws SQLException {
		Cours CoursTemp = new Cours(0,"","",0,0,0);
		String req = "SELECT * FROM Cours WHERE NomCours = \"" +nomCours+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		CoursTemp.setIdCours(DBAction.getRes().getInt(1));
		CoursTemp.setdNomCours(DBAction.getRes().getString(2));
		CoursTemp.setDateCours(DBAction.getRes().getString(3));
		CoursTemp.setIdCours(DBAction.getRes().getString(4));
		CoursTemp.setIdMatiere(DBAction.getRes().getString(5));
		CoursTemp.setIdModule(DBAction.getRes().getString(5));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	
	
	
	
	
	
	
	
	
	public static int deleteClasseByNomClasse(String nomClasse) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE NomClasse =" + nomClasse;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static int deleteClasseByIdClasse(int id) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE id =" + id;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	
	public static Classe updateClasseById(int id,String nom) throws SQLException {
		Classe ClasseTemp = new Classe(0,"");
		String req = "UPDATE Classe SET NomCLasse = \"" + nom+"\" WHERE IdClasse = \"" + id+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		ClasseTemp.setNo(DBAction.getRes().getInt(1));
		ClasseTemp.setNum(DBAction.getRes().getInt(2));
		ClasseTemp.setPrix(DBAction.getRes().getDouble(3));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
}

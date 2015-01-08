package com.itparis.b3.poo.dao;

import java.sql.*;
import java.sql.SQLException;

import com.itparis.b3.poo.beans.Classe;
import com.itparis.b3.poo.commons.DBAction;

public class ClasseDAO {

	/**
	 * 
	 * @param num
	 * @return : null Chambre
	 * @throws SQLException
	 */
	public static Classe getClasseById(int Id) throws SQLException {
		Classe ClasseTemp = new Classe(0,"");
		String req = "SELECT* FROM Classe where id = \"" + Id+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		ClasseTemp.setIdClasse(DBAction.getRes().getInt(1));
		ClasseTemp.setNomClasse(DBAction.getRes().getString(2));
		
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	
	public static Classe getClasseByNomClasse(String nomClasse) throws SQLException {
		Classe ClasseTemp = new Classe(0,"");
		String req = "SELECT* FROM Classe where NomClasse = \"" + nomClasse+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		ClasseTemp.setIdClasse(DBAction.getRes().getInt(1));
		ClasseTemp.setNomClasse(DBAction.getRes().getString(2));
		
		

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
	/**
	 * 
	 * @param id
	 * @return : 1 si delete ok sinon 0 si id n'existe pas
	 * 			 -1 si probleme de connexion
	 *           -2 si problme de timeout 	
	 */
	
	public static int deleteClasseByIdClasse(int id) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Classe  WHERE id =" + id;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	
	public static Classe updateClasseById(int id,String nom) throws SQLException {
		Classe ClasseTemp = new Classe(0,"");
		String req = "UPDATE Classe SET NomCLasse = \"" + nom+"\" WHERE IdClasse = \"" + id+"\"";
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		ClasseTemp.setIdClasse(DBAction.getRes().getInt(1));
		ClasseTemp.setNomClasse(DBAction.getRes().getString(2));
		

		// Fermeture de la connexion
		DBAction.DBClose();
		// Retourner l'objet ChambreTemps
		return ClasseTemp;
	}
	
	
	
	
	
}

package com.itparis.b3.poo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.Eleve;
import com.itparis.b3.poo.commons.DBAction;

public class EleveDAO {
	

	public static Eleve getEleveById(int Id) throws SQLException {
		
		String req = "SELECT * FROM Eleve WHERE id = \"" + Id+"\"";
		Eleve EleveTemp = new Eleve(0, null, null, null, 0);
		DBAction.DBConnexion();
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
		EleveTemp.setPrenomEleve(DBAction.getRes().getString(2));
		EleveTemp.setNomEleve(DBAction.getRes().getString(3));
		EleveTemp.setMailEleve(DBAction.getRes().getString(4));
		EleveTemp.setIdClasse(DBAction.getRes().getInt(5));
		DBAction.DBClose();
		return EleveTemp;
	}
	
	public static ArrayList<Eleve> getEleveByNomEleve(String nomEleve) throws SQLException {
		
			ArrayList<Eleve> listeEleveTemp = new ArrayList<Eleve>();
			try {
				DBAction.DBConnexion();
				String req = "SELECT * from Eleve WHERE NomEleve = " + nomEleve;
				ResultSet results = DBAction.getStm().executeQuery(req);

				while (results.next()) {
					Eleve EleveTemp = new Eleve(0, null, null, null, 0);
					EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
					EleveTemp.setPrenomEleve(DBAction.getRes().getString(2));
					EleveTemp.setNomEleve(DBAction.getRes().getString(3));
					EleveTemp.setMailEleve(DBAction.getRes().getString(4));
					EleveTemp.setIdClasse(DBAction.getRes().getInt(5));
					listeEleveTemp.add(EleveTemp);

				}
			} catch (SQLException e) {
				System.out.println(e);
			}
			DBAction.DBClose();
			return listeEleveTemp;
		
	}
	
	public static ArrayList<Eleve> getEleveByPrenom(String prenomEleve) throws SQLException {
		ArrayList<Eleve> listeEleveTemp = new ArrayList<Eleve>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Eleve WHERE PrenomEleve = " + prenomEleve;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Eleve EleveTemp = new Eleve(0, null, null, null, 0);
				EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
				EleveTemp.setPrenomEleve(DBAction.getRes().getString(2));
				EleveTemp.setNomEleve(DBAction.getRes().getString(3));
				EleveTemp.setMailEleve(DBAction.getRes().getString(4));
				EleveTemp.setIdClasse(DBAction.getRes().getInt(5));
				listeEleveTemp.add(EleveTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return listeEleveTemp;
	
	}
	
	
	public static ArrayList<Eleve> getEleveByIdClasse(int idClasse) throws SQLException {
		ArrayList<Eleve> listeEleveTemp = new ArrayList<Eleve>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Eleve WHERE IdClasse = " + idClasse;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Eleve EleveTemp = new Eleve(0, null, null, null, 0);
				EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
				EleveTemp.setPrenomEleve(DBAction.getRes().getString(2));
				EleveTemp.setNomEleve(DBAction.getRes().getString(3));
				EleveTemp.setMailEleve(DBAction.getRes().getString(4));
				EleveTemp.setIdClasse(DBAction.getRes().getInt(5));
				listeEleveTemp.add(EleveTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return listeEleveTemp;
	}
	
	
	
	
	
	public static int deleteEleveById(int idEleve) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Eleve  WHERE IdEleve =" + idEleve;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	
	
	
	public static Eleve updateEleveById(int id,int idClasse) throws SQLException {

		Eleve EleveTemp = new Eleve(0,null,null,null,0);
		try {

			String req = "UPDATE Eleve SET idClasse = \"" + idClasse+"\" WHERE IdEleve = \"" + id+"\"";
			DBAction.DBConnexion();
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
			EleveTemp.setPrenomEleve(DBAction.getRes().getString(2));
			EleveTemp.setNomEleve(DBAction.getRes().getString(3));
			EleveTemp.setMailEleve(DBAction.getRes().getString(4));
			EleveTemp.setIdClasse(DBAction.getRes().getInt(5));
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return EleveTemp;
	}
	
	public static Eleve addEleve(int idEleve,String prenomEleve,String nomEleve,String mailEleve,int idClasse) throws SQLException{
		Eleve eleveTemp = new Eleve(idEleve,prenomEleve,nomEleve,mailEleve,idClasse);
		try {

			DBAction.DBConnexion();
			String req = "INSERT INTO Eleve VALUES ('" + idEleve +"','"+prenomEleve+"','"+nomEleve+"','"+mailEleve+"','"+idClasse+"')";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			eleveTemp.setIdEleve(DBAction.getRes().getInt(1));
			eleveTemp.setPrenomEleve(DBAction.getRes().getString(2));
			eleveTemp.setNomEleve(DBAction.getRes().getString(3));
			eleveTemp.setMailEleve(DBAction.getRes().getString(4));
			eleveTemp.setIdClasse(DBAction.getRes().getInt(5));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return eleveTemp;
		
		
	}
	
}

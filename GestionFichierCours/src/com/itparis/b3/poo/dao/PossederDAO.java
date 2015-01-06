package com.itparis.b3.poo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.Posseder;
import com.itparis.b3.poo.commons.DBAction;

public class PossederDAO {
	
	public static ArrayList<Posseder> getPossederByIdClasse(int id) {
		ArrayList<Posseder> listePossederTemp = new ArrayList<Posseder>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Posseder WHERE idClasse = " + id;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Posseder possederTemp = new Posseder(0,0);
				possederTemp.setIdClasse(DBAction.getRes().getInt(1));
				possederTemp.setIdCours(DBAction.getRes().getInt(2));
				listePossederTemp.add(possederTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return listePossederTemp;
	}

	public static ArrayList<Posseder> getPossederByIdCours(int id) {
		ArrayList<Posseder> listePossederTemp = new ArrayList<Posseder>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Posseder WHERE idCours = " + id;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Posseder possederTemp = new Posseder(0,0);
				possederTemp.setIdClasse(DBAction.getRes().getInt(1));
				possederTemp.setIdCours(DBAction.getRes().getInt(2));
				listePossederTemp.add(possederTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return listePossederTemp;
	}
	
	
	public static Posseder addPosseder(int idClasse,int idCours) throws SQLException{
		Posseder possederTemp = new Posseder(idClasse, idCours);
		try {

			DBAction.DBConnexion();
			String req = "INSERT INTO Posseder VALUES ('" +idClasse +"','"+idCours+"')";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			possederTemp.setIdCours(DBAction.getRes().getInt(1));
			possederTemp.setIdClasse(DBAction.getRes().getInt(2));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return possederTemp;
		
	}
	
	
}

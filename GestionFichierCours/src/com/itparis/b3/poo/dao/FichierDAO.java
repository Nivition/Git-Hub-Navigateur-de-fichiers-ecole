package com.itparis.b3.poo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.Fichier;
import com.itparis.b3.poo.commons.DBAction;

public class FichierDAO {

	public static Fichier getFichierById(int id) {
		Fichier fichierTemp = new Fichier(0, "", "", 0);
		try {

			DBAction.DBConnexion();
			String req = "SELECT * from Fichier WHERE IdFichier = " + id;
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			fichierTemp.setIdFichier(DBAction.getRes().getInt(1));
			fichierTemp.setNomFichier(DBAction.getRes().getString(2));
			fichierTemp.setDateFichier(DBAction.getRes().getString(3));
			fichierTemp.setIdCours(DBAction.getRes().getInt(4));
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return fichierTemp;
	}

	public static ArrayList<Fichier> getFichierByNom(String nom) {
		ArrayList<Fichier> listeFichiersTemp = new ArrayList<Fichier>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Fichier WHERE NomFichier = " + nom;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Fichier fichierTemp = new Fichier(0, "", "", 0);
				fichierTemp.setIdFichier(DBAction.getRes().getInt(1));
				fichierTemp.setNomFichier(DBAction.getRes().getString(2));
				fichierTemp.setDateFichier(DBAction.getRes().getString(3));
				fichierTemp.setIdCours(DBAction.getRes().getInt(4));
				listeFichiersTemp.add(fichierTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return listeFichiersTemp;
	}

	public static ArrayList<Fichier> getFichierByDate(String date) {
		ArrayList<Fichier> listeFichiersTemp = new ArrayList<Fichier>();
		try {
			DBAction.DBConnexion();
			String req = "SELECT * from Fichier WHERE DateFichier = " + date;
			ResultSet results = DBAction.getStm().executeQuery(req);

			while (results.next()) {
				Fichier fichierTemp = new Fichier(0, "", "", 0);
				fichierTemp.setIdFichier(DBAction.getRes().getInt(1));
				fichierTemp.setNomFichier(DBAction.getRes().getString(2));
				fichierTemp.setDateFichier(DBAction.getRes().getString(3));
				fichierTemp.setIdCours(DBAction.getRes().getInt(4));
				listeFichiersTemp.add(fichierTemp);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return listeFichiersTemp;
	}

}

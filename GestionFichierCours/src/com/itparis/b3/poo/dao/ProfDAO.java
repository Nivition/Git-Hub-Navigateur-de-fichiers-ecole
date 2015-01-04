package com.itparis.b3.poo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.Prof;
import com.itparis.b3.poo.commons.DBAction;

public class ProfDAO {
	
	public Prof getProfById(int id){
		
		Prof proftemp = new Prof();
		
		try{
		DBAction.DBConnexion();
		
		String req = "select * from Prof where idProf ="+id;
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		proftemp.setIdProf(DBAction.getRes().getInt(1));
		proftemp.setNomProf(DBAction.getRes().getString(2));
		proftemp.setPrenomProf(DBAction.getRes().getString(3));
		proftemp.setMailProf(DBAction.getRes().getString(4));
		
		
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		return proftemp;
	}
	
	
	public Prof getProfByNom(String nom){
		
		Prof proftemp = new Prof();
		
		try{
		DBAction.DBConnexion();
		
		String req = "select * from Prof where nomProf ="+nom;
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		proftemp.setIdProf(DBAction.getRes().getInt(1));
		proftemp.setNomProf(DBAction.getRes().getString(2));
		proftemp.setPrenomProf(DBAction.getRes().getString(3));
		proftemp.setMailProf(DBAction.getRes().getString(4));
		
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		return proftemp;
		
	}
	
	
	public ArrayList<String> getProfByPrenom(String prenom){
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		try{
			DBAction.DBConnexion();
			
			String req = "select * from Prof where prenomProf like %"+prenom+"%";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while(DBAction.getRes().next()){
			list.add(DBAction.getRes().getString(1));
			list.add(DBAction.getRes().getString(2));
			list.add(DBAction.getRes().getString(3));
			list.add(DBAction.getRes().getString(4));
			list2.addAll(list);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		
		return list2;
	}
	
	
	public ArrayList<String> getProfByMail(String mail){
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		try{
			DBAction.DBConnexion();
			
			String req = "select * from Prof where mailProf like %"+mail+"%";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while(DBAction.getRes().next()){
			list.add(DBAction.getRes().getString(1));
			list.add(DBAction.getRes().getString(2));
			list.add(DBAction.getRes().getString(3));
			list.add(DBAction.getRes().getString(4));
			list2.addAll(list);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		
		return list2;
	}
	
	
	public void deleteProfById(int id){
		
		
		try{
			DBAction.DBConnexion();
			
			String req = "delete from Prof where idProf = "+id+"";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		

		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
	}
	
	public void updateProf(Prof p1){
		
		
		try{
			DBAction.DBConnexion();
			
			String req = "update Eleve set nomEleve = "+p1.getNomProf()+","
					+ " prenomEleve = "+p1.getPrenomProf()+", mailEleve = "+p1.getMailProf()+" "
							+ "where idEleve = "+p1.getIdProf()+" ";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		

		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
	}
	

}

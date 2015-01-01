package com.itparis.b3.poo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.Eleve;
import com.itparis.b3.poo.commons.DBAction;

public class EleveDAO {
	
	public Eleve getEleveById(int id){
		
		Eleve EleveTemp = new Eleve();
		
		try{
		DBAction.DBConnexion();
		
		String req = "select * from Eleve where idEleve ="+id;
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
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
	
	
	public Eleve getEleveByNom(String nom){
		
		Eleve EleveTemp = new Eleve();
		
		try{
		DBAction.DBConnexion();
		
		String req = "select * from Eleve where nomEleve ="+nom;
		DBAction.setRes(DBAction.getStm().executeQuery(req));
		EleveTemp.setIdEleve(DBAction.getRes().getInt(1));
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
	
	public ArrayList<String> getEleveByPrenom(String prenom){
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		try{
			DBAction.DBConnexion();
			
			String req = "select * from Eleve where prenomEleve like %"+prenom+"%";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while(DBAction.getRes().next()){
			list.add(DBAction.getRes().getString(1));
			list.add(DBAction.getRes().getString(2));
			list.add(DBAction.getRes().getString(3));
			list.add(DBAction.getRes().getString(4));
			list.add(DBAction.getRes().getString(5));
			list2.addAll(list);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		
		return list2;
	}
	
	
	public ArrayList<String> getEleveByMail(String mail){
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		try{
			DBAction.DBConnexion();
			
			String req = "select * from Eleve where mailEleve like %"+mail+"%";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while(DBAction.getRes().next()){
			list.add(DBAction.getRes().getString(1));
			list.add(DBAction.getRes().getString(2));
			list.add(DBAction.getRes().getString(3));
			list.add(DBAction.getRes().getString(4));
			list.add(DBAction.getRes().getString(5));
			list2.addAll(list);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		
		return list2;
	}
	
	
	public ArrayList<String> getEleveByIdClasse(int idC){
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		try{
			DBAction.DBConnexion();
			
			String req = "select * from Eleve where idClasse = "+idC+"";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			while(DBAction.getRes().next()){
			list.add(DBAction.getRes().getString(1));
			list.add(DBAction.getRes().getString(2));
			list.add(DBAction.getRes().getString(3));
			list.add(DBAction.getRes().getString(4));
			list.add(DBAction.getRes().getString(5));
			list2.addAll(list);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
		
		return list2;
	}
	
	
	public void deleteEleveById(int id){
		
		
		try{
			DBAction.DBConnexion();
			
			String req = "delete from Eleve where idEleve = "+id+"";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		

		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
	}
	
	public void updateEleve(Eleve e1){
		
		
		try{
			DBAction.DBConnexion();
			
			String req = "update Eleve set nomEleve = "+e1.getNomEleve()+","
					+ " prenomEleve = "+e1.getPrenomEleve()+", mailEleve = "+e1.getMailEleve()+","
							+ " idClasse = "+e1.getIdClasse()+" where idEleve = "+e1.getIdEleve()+" ";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		

		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		
	}
	
	


}

package com.itparis.b3.poo.dao;

import java.sql.SQLException;

import com.itparis.b3.poo.beans.Module;
import com.itparis.b3.poo.commons.DBAction;

public class ModuleDAO {
	public static int deleteModuleById(int id) {
		int result = -1;
		DBAction.DBConnexion();

		String req = "DELETE FROM Module WHERE idModule =" + id;
		try {
			result = DBAction.getStm().executeUpdate(req);
			System.out.println("Requete executee");
			
		} catch (SQLException ex) {
			result = - ex.getErrorCode();
		}
		DBAction.DBClose();
		return result;
	}
	
	public static Module updateModule(int id, String nom){
		Module moduleTemp = new Module(0,null);
		try {

			String req = "UPDATE Module SET nomModule = \"" + nom+"\" WHERE idModule = \"" + id+"\"";
			DBAction.DBConnexion();
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			moduleTemp.setIdModule(DBAction.getRes().getInt(1));
			moduleTemp.setNomModule(DBAction.getRes().getString(2));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return moduleTemp;
	}
	
	public static Module getModuleById(int id) {
		Module moduleTemp = new Module(0,null); 
		try {

			DBAction.DBConnexion();
			String req = "SELECT * from Module WHERE IdModule = " + id;
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			moduleTemp.setIdModule(DBAction.getRes().getInt(1));
			moduleTemp.setNomModule(DBAction.getRes().getString(2));
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return moduleTemp;
	}
	

	public static Module addModule(int idModule,String nomModule) throws SQLException{
		Module moduleTemp = new Module(idModule,nomModule);
		try {

			DBAction.DBConnexion();
			String req = "INSERT INTO Module VALUES ('" +idModule +"','"+nomModule+"')";
			DBAction.setRes(DBAction.getStm().executeQuery(req));
			moduleTemp.setIdModule(DBAction.getRes().getInt(1));
			moduleTemp.setNomModule(DBAction.getRes().getString(2));
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		DBAction.DBClose();
		return moduleTemp;
		
	}
	
	
}

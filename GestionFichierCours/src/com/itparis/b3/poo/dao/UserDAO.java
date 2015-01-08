package com.itparis.b3.poo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itparis.b3.poo.beans.User;
import com.itparis.b3.poo.commons.DBAction;

public class UserDAO {

	
	public static User getUserById(int id) {
		User userTemp = new User(0, null, null,null);
			try {

				DBAction.DBConnexion();
				String req = "SELECT * from User WHERE IdUser = " + id;
				DBAction.setRes(DBAction.getStm().executeQuery(req));
				userTemp.setIdUser(DBAction.getRes().getInt(1));
				userTemp.setNomUser(DBAction.getRes().getString(2));
				userTemp.setPasswordUser(DBAction.getRes().getString(3));
				userTemp.setTypeUser(DBAction.getRes().getString(4));
			} catch (SQLException e) {
				System.out.println(e);
			}
			DBAction.DBClose();
			return userTemp;
		}

		public static ArrayList<User> getUserByType(String type) {
			ArrayList<User> listeUserTemp = new ArrayList<User>();
			try {
				DBAction.DBConnexion();
				String req = "SELECT * from User WHERE TypeUser = " + type;
				ResultSet results = DBAction.getStm().executeQuery(req);

				while (results.next()) {
					User userTemp = new User(0, null, null,null);
					userTemp.setIdUser(DBAction.getRes().getInt(1));
					userTemp.setNomUser(DBAction.getRes().getString(2));
					userTemp.setPasswordUser(DBAction.getRes().getString(3));
					userTemp.setTypeUser(DBAction.getRes().getString(4));
					listeUserTemp.add(userTemp);

				}
			} catch (SQLException e) {
				System.out.println(e);
			}

			return listeUserTemp;
		}

		
		public static int deleteUserById(int id) {
			int result = -1;
			DBAction.DBConnexion();

			String req = "DELETE FROM User  WHERE idUser =" + id;
			try {
				result = DBAction.getStm().executeUpdate(req);
				System.out.println("Requete executee");
				
			} catch (SQLException ex) {
				result = - ex.getErrorCode();
			}
			DBAction.DBClose();
			return result;
		}
		
		public static User updateUserType(int id, String type){
			User userTemp = new User(0, null, null,null);
			try {

				String req = "UPDATE User SET typeUser = \"" + type+"\" WHERE IdUser = \"" + id+"\"";
				DBAction.DBConnexion();
				DBAction.setRes(DBAction.getStm().executeQuery(req));
				userTemp.setIdUser(DBAction.getRes().getInt(1));
				userTemp.setNomUser(DBAction.getRes().getString(2));
				userTemp.setPasswordUser(DBAction.getRes().getString(3));
				userTemp.setTypeUser(DBAction.getRes().getString(4));
			} catch (SQLException e) {
				System.out.println(e);
			}
			DBAction.DBClose();
			return userTemp;
		}
		
		public static User updateUserPassword(int id, String pwd){
			User userTemp = new User(0, null, null,null);
			try {

				String req = "UPDATE User SET PasswordUser = \"" + pwd+"\" WHERE IdUser = \"" + id+"\"";
				DBAction.DBConnexion();
				DBAction.setRes(DBAction.getStm().executeQuery(req));
				userTemp.setIdUser(DBAction.getRes().getInt(1));
				userTemp.setNomUser(DBAction.getRes().getString(2));
				userTemp.setPasswordUser(DBAction.getRes().getString(3));
				userTemp.setTypeUser(DBAction.getRes().getString(4));
			} catch (SQLException e) {
				System.out.println(e);
			}
			DBAction.DBClose();
			return userTemp;
		}
		
		public static User addUser(int idUser,String nomUser,String passwordUser,String typeUser) throws SQLException{
			User userTemp = new User(idUser, nomUser, passwordUser,typeUser);
			try {

				DBAction.DBConnexion();
				String req = "INSERT INTO User VALUES ('" + idUser +"','"+nomUser+"','"+passwordUser+"','"+typeUser+"')";
				DBAction.setRes(DBAction.getStm().executeQuery(req));
				userTemp.setIdUser(DBAction.getRes().getInt(1));
				userTemp.setNomUser(DBAction.getRes().getString(2));
				userTemp.setPasswordUser(DBAction.getRes().getString(3));
				userTemp.setTypeUser(DBAction.getRes().getString(4));
				
			} catch (SQLException e) {
				System.out.println(e);
			}
			DBAction.DBClose();
			return userTemp;
			
		}
		
		
}

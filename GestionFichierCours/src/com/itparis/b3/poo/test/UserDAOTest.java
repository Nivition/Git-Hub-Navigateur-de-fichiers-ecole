package com.itparis.b3.poo.test;

import java.sql.SQLException;
import java.util.ArrayList;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.User;
import com.itparis.b3.poo.dao.UserDAO;

public class UserDAOTest extends TestCase {

	private User user;
	private UserDAO userDAO;
	
	protected void setUp() throws Exception {
		user = new User(0,"","","");
		userDAO = new UserDAO();
	}

	public void testGetUserById() throws SQLException {
		try{
			
			User expected = userDAO.getUserById(0);
			assertEquals(user.getIdUser(),expected.getIdUser());
			assertEquals(user.getNomUser(),expected.getNomUser());
			assertEquals(user.getPasswordUser(),expected.getPasswordUser());
			assertEquals(user.getTypeUser(),expected.getTypeUser());
			
		}
		catch (Exception e){
			
		}
	}

	public void testGetUserByType() throws SQLException {
		try{
			ArrayList<User> result = new ArrayList<User>();
			result.add(new User(0,"","",""));
			ArrayList<User> expected = new ArrayList<User>();
			expected = userDAO.getUserByType("");
			for(int i = 0;i<result.size();i++){
				assertEquals(result.get(i).getIdUser(),expected.get(i).getIdUser());
				assertEquals(result.get(i).getNomUser(),expected.get(i).getNomUser());
				assertEquals(result.get(i).getPasswordUser(),expected.get(i).getPasswordUser());
				assertEquals(result.get(i).getTypeUser(),expected.get(i).getTypeUser());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testDeleteUserById() throws SQLException {
		try{
		int result = 1;
		assertEquals(userDAO.deleteUserById(0),result);
	}
	catch(Exception e){
		
	}
	}

	public void testUpdateUserType() throws SQLException {
		try{
		userDAO.updateUserType(0, "test");
		User result = new User(0,"","","test");
		assertEquals(user.getIdUser(),result.getIdUser());
		assertEquals(user.getTypeUser(),result.getTypeUser());
				
	}
	catch(Exception e){
		
	}

	}

	public void testUpdateUserPassword() throws SQLException {
		try{
		userDAO.updateUserPassword(0, "test");
		User result = new User(0,"","test","");
		assertEquals(user.getIdUser(),result.getIdUser());
		assertEquals(user.getPasswordUser(),result.getPasswordUser());
				
	}
	catch(Exception e){
		
	}
	}

	public void testAddUser() throws SQLException {
		try{
			User result = userDAO.addUser(user.getIdUser(),user.getNomUser(),user.getPasswordUser(),user.getTypeUser());
			assertEquals(user.getIdUser(),result.getIdUser());
			assertEquals(user.getNomUser(),result.getNomUser());
			assertEquals(user.getPasswordUser(),result.getPasswordUser());
			assertEquals(user.getTypeUser(),result.getTypeUser());
			}
			catch (Exception e){
				
			}
	}
	

}

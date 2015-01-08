package com.itparis.b3.poo.test;

import java.sql.SQLException;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.Module;
import com.itparis.b3.poo.dao.ModuleDAO;

public class ModuleDAOTest extends TestCase {

	private Module module;
	private ModuleDAO moduleDAO;
	
	
	protected void setUp() throws Exception {
		module = new Module(0,"");
		moduleDAO = new ModuleDAO();
	}

	public void testDeleteModuleById() throws SQLException {
		try{
			int result = 1;
			assertEquals(moduleDAO.deleteModuleById(0),result);
		}
		catch(Exception e){
			
		}
	}

	public void testUpdateModule() throws SQLException {
		try{
			moduleDAO.updateModule(0, "test");
			Module result = new Module(0,"test");
			assertEquals(module.getIdModule(),result.getIdModule());
			assertEquals(module.getNomModule(),result.getNomModule());
					
		}
		catch(Exception e){
			
		}
	}

	public void testGetModuleById() throws SQLException {
		try{
			
			Module expected = moduleDAO.getModuleById(0);
			assertEquals(expected.getIdModule(),module.getIdModule());
			assertEquals(expected.getNomModule(),module.getNomModule());
			
		}
		catch (Exception e){
			
		}
	}

	public void testAddModule() throws SQLException {
		try{
			Module result = moduleDAO.addModule(module.getIdModule(), module.getNomModule());
			assertEquals(module.getIdModule(),result.getIdModule());
			assertEquals(module.getNomModule(),result.getNomModule());
			
			}
			catch (Exception e){
				
			}
	}

}

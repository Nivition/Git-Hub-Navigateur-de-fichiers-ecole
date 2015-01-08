package com.itparis.b3.poo.test;

import java.sql.SQLException;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.Matiere;
import com.itparis.b3.poo.dao.MatiereDAO;

public class MatiereDAOTest extends TestCase {

	private Matiere matiere;
	private MatiereDAO matiereDAO;
	
	protected void setUp() throws Exception {
		matiere = new Matiere(0,"");
		matiereDAO = new MatiereDAO();	}

	public void testDeleteMatiereById() throws SQLException {
		try{
			int result = 1;
			assertEquals(matiereDAO.deleteMatiereById(0),result);
		}
		catch(Exception e){
			
		}
	}

	public void testUpdateMatiere() throws SQLException {
		try{
			matiereDAO.updateMatiere(0, "test");
			Matiere result = new Matiere(0,"test");
			assertEquals(matiere.getIdMatiere(),result.getIdMatiere());
			assertEquals(matiere.getNomMatiere(),result.getNomMatiere());
					
		}
		catch(Exception e){
			
		}
	}

	public void testGetMatiereById() throws SQLException {
		try{
		
		Matiere expected = matiereDAO.getMatiereById(0);
		assertEquals(expected.getIdMatiere(),matiere.getIdMatiere());
		assertEquals(expected.getNomMatiere(),matiere.getNomMatiere());
		
	}
	catch (Exception e){
		
	}
	}

	public void testAddMatiere() throws SQLException {
		try{
			Matiere result = matiereDAO.addMatiere(matiere.getIdMatiere(), matiere.getNomMatiere());
			assertEquals(matiere.getIdMatiere(),result.getIdMatiere());
			assertEquals(matiere.getNomMatiere(),result.getNomMatiere());
			
			}
			catch (Exception e){
				
			}
	}

}

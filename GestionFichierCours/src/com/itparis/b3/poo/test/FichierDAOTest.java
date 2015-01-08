package com.itparis.b3.poo.test;

import java.sql.SQLException;
import java.util.ArrayList;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.Fichier;
import com.itparis.b3.poo.dao.FichierDAO;

public class FichierDAOTest extends TestCase {

	private FichierDAO fichierDAO;
	private Fichier fichierTemp;
	

	
	protected void setUp() throws Exception {
		fichierDAO = new FichierDAO();
		fichierTemp = new Fichier(0, "", "", 0);
	}

	public void testGetFichierById() throws SQLException {
		try{
			
			Fichier result = fichierDAO.getFichierById(0);
			assertEquals(fichierTemp.getIdCours(),result.getIdCours());
			assertEquals(fichierTemp.getNomFichier(),result.getNomFichier());
			assertEquals(fichierTemp.getDateFichier(),result.getDateFichier());
			assertEquals(fichierTemp.getIdCours(), result.getIdCours());
		}
		catch (Exception e){
			
		}
	}

	public void testGetFichierByNom() throws SQLException {
		try{
			ArrayList<Fichier> result = new ArrayList<Fichier>();
			result.add(new Fichier(0,"","",0));
			ArrayList<Fichier> expected = new ArrayList<Fichier>();
			expected = fichierDAO.getFichierByNom("");
			for(int i = 0;i<result.size();i++){
				assertEquals(result.get(i).getIdFichier(),expected.get(i).getIdFichier());
				assertEquals(result.get(i).getNomFichier(),expected.get(i).getNomFichier());
				assertEquals(result.get(i).getDateFichier(),expected.get(i).getDateFichier());
				assertEquals(result.get(i).getIdCours(),expected.get(i).getIdCours());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testGetFichierByDate() throws SQLException {
		try{
			ArrayList<Fichier> result = new ArrayList<Fichier>();
			result.add(new Fichier(0,"","",0));
			ArrayList<Fichier> expected = new ArrayList<Fichier>();
			expected = fichierDAO.getFichierByDate("");
			for(int i = 0;i<result.size();i++){
				assertEquals(result.get(i).getIdFichier(),expected.get(i).getIdFichier());
				assertEquals(result.get(i).getNomFichier(),expected.get(i).getNomFichier());
				assertEquals(result.get(i).getDateFichier(),expected.get(i).getDateFichier());
				assertEquals(result.get(i).getIdCours(),expected.get(i).getIdCours());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testDeleteFichierByIdFichier() throws SQLException {
		try{
			int result = 1;
			assertEquals(fichierDAO.deleteFichierByIdFichier(0),result);
		}
		catch(Exception e){
			
		}
	}

	public void testUpdateFichier() throws SQLException {
		try{
			fichierDAO.updateFichier(0, "test");
			Fichier result = new Fichier(0,"test","",0);
			assertEquals(fichierTemp.getIdCours(),result.getIdCours());
			assertEquals(fichierTemp.getNomFichier(),result.getNomFichier());
			assertEquals(fichierTemp.getDateFichier(),result.getDateFichier());
			assertEquals(fichierTemp.getIdCours(), result.getIdCours());		
					
		}
		catch(Exception e){
			
		}
	}

	public void testAddFichier() throws SQLException {
		try{
		Fichier result = fichierDAO.addFichier(fichierTemp.getIdFichier(), fichierTemp.getNomFichier(), fichierTemp.getDateFichier(), fichierTemp.getIdCours());
		assertEquals(fichierTemp.getIdCours(),result.getIdCours());
		assertEquals(fichierTemp.getNomFichier(),result.getNomFichier());
		assertEquals(fichierTemp.getDateFichier(),result.getDateFichier());
		assertEquals(fichierTemp.getIdCours(), result.getIdCours());
		}
		catch (Exception e){
			
		}
		
	}

	
	
}

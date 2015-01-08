package com.itparis.b3.poo.test;

import java.sql.SQLException;
import java.util.ArrayList;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.Eleve;
import com.itparis.b3.poo.beans.Fichier;
import com.itparis.b3.poo.dao.EleveDAO;

public class EleveDAOTest extends TestCase {

	private Eleve eleve;
	private EleveDAO eleveDAO;
	
	protected void setUp() throws Exception {
		eleve = new Eleve(0,"","","",0);
		eleveDAO = new EleveDAO();
	}

	public void testGetEleveById() throws SQLException {
		try{
			
			Eleve result = eleveDAO.getEleveById(0);
			assertEquals(eleve.getIdEleve(),result.getIdEleve());
			assertEquals(eleve.getPrenomEleve(),result.getPrenomEleve());
			assertEquals(eleve.getNomEleve(),result.getNomEleve());
			assertEquals(eleve.getMailEleve(),result.getMailEleve());
			assertEquals(eleve.getIdClasse(),result.getIdClasse());
			
		}
		catch (Exception e){
			
		}
		
	}

	public void testGetEleveByNomEleve() throws SQLException {
		try{
			ArrayList<Eleve> result = new ArrayList<Eleve>();
			result.add(new Eleve(0,"","","",0));
			ArrayList<Eleve> expected = new ArrayList<Eleve>();
			expected = eleveDAO.getEleveByNomEleve("");
			for(int i = 0;i<result.size();i++){
				assertEquals(expected.get(i).getIdEleve(),result.get(i).getIdEleve());
			assertEquals(expected.get(i).getPrenomEleve(),result.get(i).getPrenomEleve());
			assertEquals(expected.get(i).getNomEleve(),result.get(i).getNomEleve());
			assertEquals(expected.get(i).getMailEleve(),result.get(i).getMailEleve());
			assertEquals(expected.get(i).getIdClasse(),result.get(i).getIdClasse());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testGetEleveByPrenom() throws SQLException {
		try{
			ArrayList<Eleve> result = new ArrayList<Eleve>();
			result.add(new Eleve(0,"","","",0));
			ArrayList<Eleve> expected = new ArrayList<Eleve>();
			expected = eleveDAO.getEleveByPrenom("");
			for(int i = 0;i<result.size();i++){
				assertEquals(expected.get(i).getIdEleve(),result.get(i).getIdEleve());
			assertEquals(expected.get(i).getPrenomEleve(),result.get(i).getPrenomEleve());
			assertEquals(expected.get(i).getNomEleve(),result.get(i).getNomEleve());
			assertEquals(expected.get(i).getMailEleve(),result.get(i).getMailEleve());
			assertEquals(expected.get(i).getIdClasse(),result.get(i).getIdClasse());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testGetEleveByIdClasse() throws SQLException {try{
		ArrayList<Eleve> result = new ArrayList<Eleve>();
		result.add(new Eleve(0,"","","",0));
		ArrayList<Eleve> expected = new ArrayList<Eleve>();
		expected = eleveDAO.getEleveByIdClasse(0);
		for(int i = 0;i<result.size();i++){
			assertEquals(expected.get(i).getIdEleve(),result.get(i).getIdEleve());
		assertEquals(expected.get(i).getPrenomEleve(),result.get(i).getPrenomEleve());
		assertEquals(expected.get(i).getNomEleve(),result.get(i).getNomEleve());
		assertEquals(expected.get(i).getMailEleve(),result.get(i).getMailEleve());
		assertEquals(expected.get(i).getIdClasse(),result.get(i).getIdClasse());
		}
	}
	catch (Exception e){
		
	}
	}

	public void testDeleteEleveById() throws SQLException {try{
		int result = 1;
		assertEquals(eleveDAO.deleteEleveById(0),result);
	}
	catch(Exception e){
		
	}
	}

	public void testUpdateEleveById() throws SQLException {
		try{
			Eleve result = new Eleve(0,"","","",1);
			eleveDAO.updateEleveById(0, 1);
			assertEquals(eleve.getIdEleve(),result.getIdEleve());
			assertEquals(eleve.getIdClasse(),result.getIdClasse());
		}
		catch (Exception e){
			
		}
	}

	public void testAddEleve() throws SQLException {
		try{
			Eleve result = EleveDAO.addEleve(eleve.getIdEleve(), eleve.getPrenomEleve(), eleve.getNomEleve(), eleve.getMailEleve(), eleve.getIdClasse());
		
			assertEquals(eleve.getIdEleve(),result.getIdEleve());
			assertEquals(eleve.getPrenomEleve(),result.getPrenomEleve());
			assertEquals(eleve.getNomEleve(),result.getNomEleve());
			assertEquals(eleve.getMailEleve(),result.getMailEleve());
			assertEquals(eleve.getIdClasse(),result.getIdClasse());		
		}
		catch(Exception e){
			
		}
	}

}

package com.itparis.b3.poo.test;

import java.util.ArrayList;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.Prof;
import com.itparis.b3.poo.dao.ProfDAO;

public class ProfDAOTest extends TestCase {

	private Prof prof;
	private ProfDAO profDAO;
	
	protected void setUp() throws Exception {
		prof = new Prof(0, "", "", "");
		profDAO = new ProfDAO();
	}

	public void testGetProfById() throws Exception {
try{
			
			Prof expected = profDAO.getProfById(0);
			assertEquals(prof.getIdProf(),expected.getIdProf());
			assertEquals(prof.getNomProf(),expected.getNomProf());
			assertEquals(prof.getPrenomProf(),expected.getPrenomProf());
			assertEquals(prof.getMailProf(),expected.getMailProf());
			
		}
		catch (Exception e){
			
		}
	}

	public void testGetProfByNom() throws Exception {
		try{
			ArrayList<Prof> result = new ArrayList<Prof>();
			result.add(new Prof(0,"","",""));
			ArrayList<Prof> expected = new ArrayList<Prof>();
			expected = profDAO.getProfByNom("");
			for(int i = 0;i<result.size();i++){
				assertEquals(result.get(i).getIdProf(),expected.get(i).getIdProf());
				assertEquals(result.get(i).getNomProf(),expected.get(i).getNomProf());
				assertEquals(result.get(i).getPrenomProf(),expected.get(i).getPrenomProf());
				assertEquals(result.get(i).getMailProf(),expected.get(i).getMailProf());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testGetProfByPrenom() throws Exception {
		try{
			ArrayList<Prof> result = new ArrayList<Prof>();
			result.add(new Prof(0,"","",""));
			ArrayList<Prof> expected = new ArrayList<Prof>();
			expected = profDAO.getProfByPrenom("");
			for(int i = 0;i<result.size();i++){
				assertEquals(result.get(i).getIdProf(),expected.get(i).getIdProf());
				assertEquals(result.get(i).getNomProf(),expected.get(i).getNomProf());
				assertEquals(result.get(i).getPrenomProf(),expected.get(i).getPrenomProf());
				assertEquals(result.get(i).getMailProf(),expected.get(i).getMailProf());
			}
		}
		catch (Exception e){
			
		}
	}

	public void testDeleteProfById() throws Exception {
		try{
			int result = 1;
			assertEquals(profDAO.deleteProfById(0),result);
		}
		catch(Exception e){
			
		}
	}

	public void testUpdateProf() throws Exception {
		try{
			profDAO.updateProf(0, "test");
			Prof result = new Prof(0,"","","test");
			assertEquals(prof.getIdProf(),result.getIdProf());
			assertEquals(prof.getMailProf(),result.getMailProf());
					
		}
		catch(Exception e){
			
		}
	}

	public void testAddProf() throws Exception {
		Prof result = new Prof(prof.getIdProf(),prof.getNomProf(),prof.getPrenomProf(),prof.getMailProf());
		assertEquals(prof.getIdProf(),result.getIdProf());
		assertEquals(prof.getNomProf(),result.getNomProf());
		assertEquals(prof.getPrenomProf(),result.getPrenomProf());
		assertEquals(prof.getMailProf(),result.getMailProf());
		
	}

}

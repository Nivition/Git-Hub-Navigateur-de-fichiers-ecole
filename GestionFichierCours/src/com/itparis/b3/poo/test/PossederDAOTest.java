package com.itparis.b3.poo.test;

import java.sql.SQLException;
import java.util.ArrayList;

import junit.framework.TestCase;

import com.itparis.b3.poo.beans.Posseder;
import com.itparis.b3.poo.dao.PossederDAO;

public class PossederDAOTest extends TestCase {

	private Posseder posseder;
	private PossederDAO possederDAO;
	
	protected void setUp() throws Exception {
		posseder = new Posseder(0,0);
		possederDAO = new PossederDAO();
	}

	public void testGetPossederByIdClasse() throws SQLException {
		try{
		ArrayList<Posseder> result = new ArrayList<Posseder>();
		result.add(new Posseder(0,0));
		ArrayList<Posseder> expected = new ArrayList<Posseder>();
		expected = possederDAO.getPossederByIdClasse(0);
		for(int i = 0;i<result.size();i++){
			assertEquals(result.get(i).getIdClasse(),expected.get(i).getIdClasse());
			assertEquals(result.get(i).getIdCours(),expected.get(i).getIdCours());
		}
		}
		catch (Exception e){
			
		}
	}

	public void testGetPossederByIdCours() throws SQLException {
		try{
			ArrayList<Posseder> result = new ArrayList<Posseder>();
			result.add(new Posseder(0,0));
			ArrayList<Posseder> expected = new ArrayList<Posseder>();
			expected = possederDAO.getPossederByIdCours(0);
			for(int i = 0;i<result.size();i++){
				assertEquals(result.get(i).getIdClasse(),expected.get(i).getIdClasse());
				assertEquals(result.get(i).getIdCours(),expected.get(i).getIdCours());
			}
			}
			catch (Exception e){
				
			}
	}

	public void testAddPosseder() throws SQLException {
		try{
			Posseder result = possederDAO.addPosseder(posseder.getIdCours(), posseder.getIdClasse());
			assertEquals(posseder.getIdCours(),result.getIdCours());
			assertEquals(posseder.getIdClasse(),result.getIdClasse());
			
			}
			catch (Exception e){
				
			}
		
	}

}

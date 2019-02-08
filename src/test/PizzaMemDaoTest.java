package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;

public class PizzaMemDaoTest {
	IPizzaDao pizzaDao;
	
	@Before
	public void setUp(){
		pizzaDao = new PizzaMemDao();
	}

	@Test
	public void test() {
		
		fail("Not yet implemented");
	}

}

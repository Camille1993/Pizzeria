package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public abstract class MenuService {
	
	
	public abstract void  executeUC(IPizzaDao pizzaDao, Scanner scanner);
	
}
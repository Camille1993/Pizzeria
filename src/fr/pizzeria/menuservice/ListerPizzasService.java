package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		System.out.println("Liste des pizzas");

		//méthode pour afficher pizza

		Pizza[] tableauPizza = pizzaDao.findAllPizzas();

		for (int i =0; i<tableauPizza.length; i++) {
			System.out.println(tableauPizza[i]);
		}

	}

}
	



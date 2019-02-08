package fr.pizzeria.menuservice;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		System.out.println("Liste des pizzas");

		//méthode pour afficher pizza

		List<Pizza> listePizza = pizzaDao.findAllPizzas();

		System.out.println(listePizza);
	}

}






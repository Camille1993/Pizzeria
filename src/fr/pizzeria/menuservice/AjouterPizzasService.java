package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

public class AjouterPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		System.out.println("Ajouter une nouvelle pizza");

		System.out.println("Veuillez saisir le code : ");
		String code = scanner.nextLine();

		System.out.println("Veuillez saisir le nom (sans espace) : ");
		String nom = scanner.nextLine();

		System.out.println("Veuillez saisir le prix : ");
		double prix = scanner.nextDouble();

		//m�thode pour ajouter nouvelle pizza

		Pizza newPizza =new Pizza(code, nom, prix);	
		pizzaDao.saveNewPizza(newPizza);

	}

}

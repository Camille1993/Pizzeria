package fr.pizzeria;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza.Pizza;

public class ModifierPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Mise � jour d'une pizza");

		//m�thode pour modifier une pizza

		System.out.println("Veuillez saisir le code de la pizza � modifier : ");
		String codeModif = scanner.nextLine();

		System.out.println("Veuillez �crire le nouveau code : ");
		String code = scanner.nextLine();

		System.out.println("Veuillez �crire le nouveau nom : ");
		String nom = scanner.nextLine();

		System.out.println("Veuillez �crire le nouveau prix : ");
		double prix = scanner.nextDouble();

		Pizza pizza = new Pizza(code, nom, prix);
		pizzaDao.updatePizza(codeModif, pizza);
	}

}
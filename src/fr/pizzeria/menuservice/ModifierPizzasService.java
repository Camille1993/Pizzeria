package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.Pizza.Pizza;

class ModifierPizzasService extends MenuService{

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException {
		System.out.println("Mise à jour d'une pizza");

		//méthode pour modifier une pizza

		System.out.println("Veuillez saisir le code de la pizza à modifier : ");
		String codeModif = scanner.nextLine();

		System.out.println("Veuillez écrire le nouveau code : ");
		String code = scanner.nextLine();

		System.out.println("Veuillez écrire le nouveau nom : ");
		String nom = scanner.nextLine();

		System.out.println("Veuillez écrire le nouveau prix : ");
		double prix = scanner.nextDouble();

		Pizza pizza = new Pizza(code, nom, prix);
		pizzaDao.updatePizza(codeModif, pizza);
		
	}
	

}

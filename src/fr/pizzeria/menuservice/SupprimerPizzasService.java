package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public class SupprimerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		System.out.println("suppression d'une pizza");
		System.out.println("Veuillez saisir le code de la pizza à supprimer");

		String codeSuppr = scanner.nextLine();

		pizzaDao.deletePizza(codeSuppr);

	}

}

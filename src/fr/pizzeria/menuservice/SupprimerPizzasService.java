package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

 class SupprimerPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException {
		System.out.println("suppression d'une pizza");
		System.out.println("Veuillez saisir le code de la pizza à supprimer");

		String codeSuppr = scanner.nextLine();

		pizzaDao.deletePizza(codeSuppr);
		

	}

}

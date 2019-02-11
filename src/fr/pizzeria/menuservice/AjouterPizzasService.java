package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

class AjouterPizzasService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException{
		System.out.println("Ajouter une nouvelle pizza");
		
		System.out.println("Veuillez saisir la catégorie de la pizza : ");
		String choixCategorie = scanner.nextLine();

		System.out.println("Veuillez saisir le code : ");
		String code = scanner.nextLine();

		System.out.println("Veuillez saisir le nom (sans espace) : ");
		String nom = scanner.nextLine();

		System.out.println("Veuillez saisir le prix : ");
		double prix = scanner.nextDouble();



		if(choixCategorie == "viande") {
			CategoriePizza categorie = CategoriePizza.VIANDE;
		}else if (choixCategorie == "Poisson") {
			CategoriePizza categorie = CategoriePizza.POISSON;
		}else if (choixCategorie == "Végétarienne"){
			CategoriePizza categorie = CategoriePizza.VEGETARIENNE;
		}

		//méthode pour ajouter nouvelle pizza

		Pizza newPizza =new Pizza(code, nom, prix, choixCategorie);	
		pizzaDao.saveNewPizza(newPizza);


	}

}

package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

class ModifierPizzasService extends MenuService{

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException {
		System.out.println("Mise à jour d'une pizza");

		//méthode pour modifier une pizza
		System.out.println("Veuillez écrire la nouvelle catégorie : ");
		String choixCategorie = scanner.nextLine();
		
		System.out.println("Veuillez saisir le code de la pizza à modifier : ");
		String codeModif = scanner.nextLine();

		System.out.println("Veuillez écrire le nouveau code : ");
		String code = scanner.nextLine();

		System.out.println("Veuillez écrire le nouveau nom : ");
		String nom = scanner.nextLine();

		System.out.println("Veuillez écrire le nouveau prix : ");
		double prix = scanner.nextDouble();

		
		
			if(choixCategorie == "Viande") {
				CategoriePizza categorie = CategoriePizza.VIANDE;
			}else if (choixCategorie == "Poisson") {
				CategoriePizza categorie = CategoriePizza.POISSON;
			}else if (choixCategorie == "Végétarienne"){
				CategoriePizza categorie = CategoriePizza.VEGETARIENNE;
			}

		Pizza pizza = new Pizza(code, nom, prix, choixCategorie);
		pizzaDao.updatePizza(codeModif, pizza);

	}



}

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
		//ajout d'un menu pour choisir la catégorie de pizza
		System.out.println("Veuillez choisir une option entre : "
				+ "\n 1 Viande,"
				+ "\n 2 Poisson,"
				+ "\n3 Végétarienne : ");
		int choixCategorie = scanner.nextInt();

		System.out.println("Veuillez saisir le code : ");
		String code = scanner.next();

		System.out.println("Veuillez saisir le nom (sans espace) : ");
		String nom = scanner.next();

		System.out.println("Veuillez saisir le prix : ");
		double prix = scanner.nextDouble();
		
		String categoriePizza = null;
		
		if(choixCategorie == 1) {
			CategoriePizza categorie = CategoriePizza.VIANDE;
			categoriePizza = "Viande";
		}else if (choixCategorie == 2) {
			CategoriePizza categorie = CategoriePizza.POISSON;
			categoriePizza = "Poisson";
		}else if (choixCategorie == 3){
			CategoriePizza categorie = CategoriePizza.VEGETARIENNE;
			categoriePizza = "Végétarienne";
		}


		//méthode pour ajouter nouvelle pizza

		Pizza newPizza =new Pizza(code, nom, prix, categoriePizza);	
		pizzaDao.saveNewPizza(newPizza);


	}

}

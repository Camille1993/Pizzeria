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

		//Demande pour les nouvelles données
		
		
		System.out.println("Veuillez saisir le code de la pizza à modifier : ");
		String codeModif = scanner.next();
	//ajout d'un menu pour choisir la catégorie de pizza	
		System.out.println("Veuillez choisir une option entre : "
				+ "\n 1 Viande,"
				+ "\n 2 Poisson,"
				+ "\n3 Végétarienne : ");
		int choixCategorie = scanner.nextInt();

		System.out.println("Veuillez écrire le nouveau code : ");
		String code = scanner.next();

		System.out.println("Veuillez écrire le nouveau nom : ");
		String nom = scanner.next();

		System.out.println("Veuillez écrire le nouveau prix : ");
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
	
			
		Pizza pizza = new Pizza(code, nom, prix, categoriePizza);
		pizzaDao.updatePizza(codeModif, pizza);

	}

	


}

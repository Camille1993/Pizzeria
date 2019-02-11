package fr.pizzeria.menuservice;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

class ModifierPizzasService extends MenuService{

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException {
		System.out.println("Mise � jour d'une pizza");

		//m�thode pour modifier une pizza
		System.out.println("Veuillez �crire la nouvelle cat�gorie : ");
		String choixCategorie = scanner.nextLine();
		
		System.out.println("Veuillez saisir le code de la pizza � modifier : ");
		String codeModif = scanner.nextLine();

		System.out.println("Veuillez �crire le nouveau code : ");
		String code = scanner.nextLine();

		System.out.println("Veuillez �crire le nouveau nom : ");
		String nom = scanner.nextLine();

		System.out.println("Veuillez �crire le nouveau prix : ");
		double prix = scanner.nextDouble();

		
		
			if(choixCategorie == "Viande") {
				CategoriePizza categorie = CategoriePizza.VIANDE;
			}else if (choixCategorie == "Poisson") {
				CategoriePizza categorie = CategoriePizza.POISSON;
			}else if (choixCategorie == "V�g�tarienne"){
				CategoriePizza categorie = CategoriePizza.VEGETARIENNE;
			}

		Pizza pizza = new Pizza(code, nom, prix, choixCategorie);
		pizzaDao.updatePizza(codeModif, pizza);

	}



}

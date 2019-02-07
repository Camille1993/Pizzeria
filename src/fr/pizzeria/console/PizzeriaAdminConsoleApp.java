package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza.Pizza;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner choiceMenu = new Scanner(System.in);

		//tableau pizza	
		IPizzaDao pizzaDao = new PizzaMemDao();
		pizzaDao.saveNewPizza(new Pizza (0, "PEP", "Pépéroni", 12.50));
		pizzaDao.saveNewPizza(new Pizza (1, "MAR", "Margherita", 14.00));
		pizzaDao.saveNewPizza(new Pizza (2, "REIN", "La reine", 11.50));
		pizzaDao.saveNewPizza(new Pizza (3, "FRO", "La 4 fromages", 12.00));
		pizzaDao.saveNewPizza(new Pizza (4, "CAR", "La carnivore", 12.50));
		pizzaDao.saveNewPizza(new Pizza (5, "SAV", "La savoyarde", 13.00));
		pizzaDao.saveNewPizza(new Pizza (6, "ORI", "L'orientale", 13.50));
		pizzaDao.saveNewPizza(new Pizza (7, "IND", "L'indienne", 14.00));
		//Méthode pour créer tableau pizza
		

		int choice =0;
		String code;
		String nom;
		double prix;

		//afficher le menu		
		while (true) {
			System.out.println("*******Bienvenue sur le service administration******");
			System.out.println("1.Lister les pizzas");
			System.out.println("2.Ajouter une nouvelle pizza");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choice = choiceMenu.nextInt();
			choiceMenu.nextLine();

			//options

			if (choice == 1) {
				System.out.println("Liste des pizzas");

				//méthode pour afficher pizza

				Pizza[] tableauPizza = pizzaDao.findAllPizzas();

				for (int i =0; i<tableauPizza.length; i++) {
					System.out.println(tableauPizza[i]);
				}

			}else if (choice == 2) {

				//declarer une nouvelle pizza				
				System.out.println("Ajouter une nouvelle pizza");

				System.out.println("Veuillez saisir le code : ");
				code = choiceMenu.nextLine();

				System.out.println("Veuillez saisir le nom (sans espace) : ");
				nom = choiceMenu.nextLine();

				System.out.println("Veuillez saisir le prix : ");
				prix = choiceMenu.nextDouble();

				//méthode pour ajouter nouvelle pizza

				Pizza newPizza =new Pizza(code, nom, prix);	
				pizzaDao.saveNewPizza(newPizza);

			}else if (choice == 3) {											
				System.out.println("Mise à jour d'une pizza");

				//méthode pour modifier une pizza

				System.out.println("Veuillez saisir le code de la pizza à modifier : ");
				String codeModif = choiceMenu.nextLine();
				pizzaDao.findPizzaByCode(codeModif);

				System.out.println("Veuillez écrire le nouveau code : ");
				code = choiceMenu.nextLine();

				System.out.println("Veuillez écrire le nouveau nom : ");
				nom = choiceMenu.nextLine();

				System.out.println("Veuillez écrire le nouveau prix : ");
				prix = choiceMenu.nextDouble();

				Pizza newPizza = new Pizza(code, nom, prix);
				pizzaDao.updatePizza(code, newPizza);


			} else if (choice == 4) {
				//supprimer une pizza

				System.out.println("suppression d'une pizza");
				System.out.println("Veuillez saisir le code de la pizza à supprimer");

				String codeSuppr = choiceMenu.nextLine();

				pizzaDao.deletePizza(codeSuppr);


			}
			else {
				//quitter l'application						
				System.out.println("Au revoir :(");
				break;
			}

		}

	}

}

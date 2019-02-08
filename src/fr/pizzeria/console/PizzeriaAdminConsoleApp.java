package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza.Pizza;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.menuservice.MenuService;
import fr.pizzeria.menuservice.MenuServiceFactory;


public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner choiceMenu = new Scanner(System.in);

		//tableau pizza	
		IPizzaDao pizzaDao = new PizzaMemDao();

		pizzaDao.saveNewPizza(new Pizza ("PEP", "Pépéroni", 12.50));
		pizzaDao.saveNewPizza(new Pizza ("MAR", "Margherita", 14.00));
		pizzaDao.saveNewPizza(new Pizza ("REIN", "La reine", 11.50));
		pizzaDao.saveNewPizza(new Pizza ("FRO", "La 4 fromages", 12.00));
		pizzaDao.saveNewPizza(new Pizza ("CAR", "La carnivore", 12.50));
		pizzaDao.saveNewPizza(new Pizza ("SAV", "La savoyarde", 13.00));
		pizzaDao.saveNewPizza(new Pizza ("ORI", "L'orientale", 13.50));
		pizzaDao.saveNewPizza(new Pizza ("IND", "L'indienne", 14.00));

		int choice =0;

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

			if (choice > 0 && choice < 5) {
				//Lister pizza
				MenuService service = MenuServiceFactory.getService(choice);
				service.executeUC(pizzaDao, choiceMenu);

			}
			else {
				//quitter l'application						
				System.out.println("Au revoir et à bientôt");
				break;
			}

		}

	}

}

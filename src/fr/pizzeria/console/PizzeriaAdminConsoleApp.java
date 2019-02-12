package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.menuservice.MenuService;
import fr.pizzeria.menuservice.MenuServiceFactory;
import fr.pizzeria.model.Pizza;


public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		Scanner choiceMenu = new Scanner(System.in);

		//Liste des pizza	
		IPizzaDao pizzaDao = new PizzaMemDao();

		try {
			pizzaDao.saveNewPizza(new Pizza ("PEP", "Pépéroni", 12.50, "Viande"));
			pizzaDao.saveNewPizza(new Pizza ("MAR", "Margherita", 14.00, "Végétarienne"));
			pizzaDao.saveNewPizza(new Pizza ("REIN", "La reine", 11.50, "Viande"));
			pizzaDao.saveNewPizza(new Pizza ("FRO", "4 fromages", 12.00, "Végétarienne"));
			pizzaDao.saveNewPizza(new Pizza ("CAR", "Carnivore", 12.50, "Viande"));
			pizzaDao.saveNewPizza(new Pizza ("SAV", "Savoyarde", 13.00, "Viande"));
			pizzaDao.saveNewPizza(new Pizza ("ORI", "Orientale", 13.50, "Viande"));
			pizzaDao.saveNewPizza(new Pizza ("IND", "Indienne", 14.00, "Viande"));
			pizzaDao.saveNewPizza(new Pizza ("SAU", "Saumon", 13.50, "Poisson"));

		} catch (SavePizzaException spe) {
			spe.printStackTrace();
		}

		int choice =0;

		//afficher le menu		
		while (true) {
			System.out.println("\n" + "*******Bienvenue sur le service administration******" + "\n");
			System.out.println("1.Lister les pizzas");
			System.out.println("2.Ajouter une nouvelle pizza");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choice = choiceMenu.nextInt();
			choiceMenu.nextLine();


			if (choice > 0 && choice < 5) {
				//choisir option et executer le programme selon l'option choisi
				MenuService service = MenuServiceFactory.getService(choice);

				try {
					service.executeUC(pizzaDao, choiceMenu);
				} catch (StockageException se) {
					System.out.println(se.getMessage());
					se.printStackTrace();
				}

			}
			else {
				//quitter l'application						
				System.out.println("Au revoir et à bientôt");
				break;
			}

		}

	}

}

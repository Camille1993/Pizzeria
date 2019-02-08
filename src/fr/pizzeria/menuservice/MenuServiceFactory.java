package fr.pizzeria.menuservice;

public class MenuServiceFactory {

	public static MenuService getService(int choice) {

		if (choice == 1) {
			return new ListerPizzasService();

		}else if (choice == 2){
			return new AjouterPizzasService();	

		}else if (choice == 3) {
			return new ModifierPizzasService();

		}else if (choice == 4) {
			return new SupprimerPizzasService();

		}
		return null;
	}
}

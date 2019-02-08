package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private List<Pizza> listePizza = new ArrayList<Pizza>();

	@Override
	public List findAllPizzas() {
		return listePizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		//Ajouter la nouvelle pizza
		listePizza.add(pizza);	
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {

		for (Pizza p : listePizza) {

			if (p.code.equals(codePizza)) {
				p.code = pizza.code;
				p.libelle = pizza.libelle;
				p.prix= pizza.prix;
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		Iterator iterator = listePizza.iterator();
		while(iterator.hasNext()) {
			Pizza p = (Pizza) iterator.next();
			if (p.code.equals(codePizza)) {
				iterator.remove();	
			}

		}
	}


	@Override
	public Pizza findPizzaByCode(String codePizza) {
		/*

		Pizza[] newTableauPizza = new Pizza[tableauPizza.length];
		int iTemp = 0;
		for (int i =0; i<tableauPizza.length; i++) {
			if(codeFindPizza.equals(tableauPizza[i].code)) {
				newTableauPizza[iTemp] = tableauPizza[i];
				iTemp++;
				System.out.println(tableauPizza[i]);
			}
		}
		tableauPizza =newTableauPizza;
		 */
		return null;
	}
	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}



}
package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private List<Pizza> listePizza = new ArrayList<Pizza>();

	@Override
	public List findAllPizzas() {
		return listePizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) throws SavePizzaException {

		//Tester avec si la pizza existe
		if (pizzaExists(pizza.code)){
			throw new SavePizzaException("");
		}
		//Ajouter la nouvelle pizza
		listePizza.add(pizza);

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) throws UpdatePizzaException {

		for (Pizza p : listePizza) {

			if (p.code.equals(codePizza)) {
				p.code = pizza.code;
				p.libelle = pizza.libelle;
				p.prix= pizza.prix;
				return;
			}
		}
		throw new UpdatePizzaException("");
	}

	@Override
	public void deletePizza(String codePizza) throws DeletePizzaException {
		Iterator iterator = listePizza.iterator();
		while(iterator.hasNext()) {
			Pizza p = (Pizza) iterator.next();
			if (p.code.equals(codePizza)) {
				iterator.remove();	
				return;
			}

		}
		throw new DeletePizzaException("");
	}


	@Override
	public Pizza findPizzaByCode(String codePizza) {
		
		for (Pizza p : listePizza) {

			if (p.code.equals(codePizza)) {
				System.out.println(p);
			}
		}
		return null;
	}


	@Override
	public boolean pizzaExists(String codePizza) {
		for (Pizza p : listePizza) {

			if (p.code.equals(codePizza)) {
				return true;
			}
		}

		return false;
	}



}
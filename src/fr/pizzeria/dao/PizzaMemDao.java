package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private Pizza[] tableauPizza = new Pizza[0];
	
	@Override
	public Pizza[] findAllPizzas() {
		return tableauPizza;
	}
	
	@Override
	public void saveNewPizza(Pizza pizza) {
		// Creer un tableau plus grand de 1		
		int newLength = tableauPizza.length + 1;
		Pizza[] newTableauPizza = new Pizza[newLength];
		
		// Copier les anciennes valeurs
		for(int i = 0; i< tableauPizza.length; i++){
			newTableauPizza[i] = tableauPizza[i];	
		}
		//Ajouter la nouvelle pizza
		newTableauPizza[tableauPizza.length] = pizza;
		
		//remplacer la liste precedente
		tableauPizza = newTableauPizza;
		
	}
	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		
		for (int i =0; i<tableauPizza.length; i++) {
			
			if (codePizza.equals(tableauPizza[i].code)) {
				
				tableauPizza[i] = pizza;
			}
		}
	}
	
	@Override
	public void deletePizza(String codePizza) {
		
		Pizza[] newTableauPizza = new Pizza[tableauPizza.length-1];
		int iTemp = 0;

		for (int i = 0; i< tableauPizza.length; i++) {
			if (!codePizza.equals(tableauPizza[i].code)) {
				newTableauPizza[iTemp] = tableauPizza[i];
				iTemp++;
			}
		}
		
		tableauPizza = newTableauPizza ;

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
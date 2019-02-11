package fr.pizzeria.model;

public enum CategoriePizza {
	VIANDE("Viande"),
	POISSON ("Poisson"),
	VEGETARIENNE("V�g�tarienne"); 

	private String categorie;

	private CategoriePizza(String categorie) {
		this.categorie = categorie;

	}
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;

	}

}

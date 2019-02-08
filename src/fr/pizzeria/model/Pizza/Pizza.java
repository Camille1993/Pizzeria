package fr.pizzeria.model.Pizza;

public class Pizza {
	public static int nbPizza;

	public int id;
	public String code;
	public String libelle;
	public double prix;

	//constructeur pizza sans id
	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	};

	// constructeur pizza avec id
	public Pizza(int id, String code, String libelle, double prix) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	// permet de retourne le texte de manière : code --> nom (prix€)

	@Override
	public String toString() {
		return code + "-->" + libelle + "("+ prix + "€" + ")" +"\n" ;
	}
}

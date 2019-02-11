package fr.pizzeria.model;


public class Pizza {

	public int id;
	public String code;
	public String libelle;
	public double prix;

	public String categorie;

	//constructeur pizza sans id
	public Pizza(String code, String libelle, double prix,String categorie) {


		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
	};

	// constructeur pizza avec id
	public Pizza(int id, String code, String libelle, double prix, String categorie) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
	}

	// permet de retourne le texte de manière : catégorie de pizza : code --> nom (prix€)

	@Override
	public String toString() {
		return "Pizza " + categorie + " : " +code + "-->" + libelle + "("+ prix + "€" + ")" +"\n" ;
	}
}

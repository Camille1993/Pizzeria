package fr.pizzeria.model.Pizza;

public class Pizza {
	public int id;
	public String code;
	public String libelle;
	public double prix;

	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	};
	public Pizza(int id, String code, String libelle, double prix) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return code + "-->" + libelle + "("+ prix + "€" + ")" ;
	}
}

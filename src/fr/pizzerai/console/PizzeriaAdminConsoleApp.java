package fr.pizzerai.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//tableau pizza		
		Pizza pep = new Pizza (0, "PEP", "Pépéroni", 12.50);
		Pizza mar = new Pizza (1, "MAR", "Margherita", 14.00);
		Pizza rein = new Pizza (2, "REIN", "La reine", 11.50);
		Pizza fro = new Pizza (3, "FRO", "La 4 fromages", 12.00);
		Pizza car = new Pizza (4, "CAR", "La carnivore", 12.50);
		Pizza sav = new Pizza (5, "SAV", "La savoyarde", 13.00);
		Pizza ori = new Pizza (6, "ORI", "L'orientale", 13.50);
		Pizza ind = new Pizza (7, "IND", "L'indienne", 14.00);

		Pizza[] tableauPizza = {pep, mar, rein, fro, car, sav, ori, ind};
		Scanner choiceMenu = new Scanner(System.in);
		

		int choice =0;
		String code;
		String nom;
		double prix;
		
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
			if (choice == 1) {
				System.out.println("Liste des pizzas");
				//liste pizza suite option 1
				for (int i =0; i<tableauPizza.length; i++) {
					System.out.println(tableauPizza[i]);
				}
			}else if (choice == 2) {
				//declarer une nouvelle pizza				
				System.out.println("Ajouter une nouvelle pizza");
				
				System.out.println("Veuillez saisir le code : ");
				code = choiceMenu.nextLine();
				
				System.out.println("Veuillez saisir le nom (sans espace) : ");
				nom = choiceMenu.nextLine();
				
				System.out.println("Veuillez saisir le prix : ");
				prix = choiceMenu.nextDouble();

				// Creer un tableau plus grand de 1		
				int newLength = tableauPizza.length + 1;
				Pizza[] newTableauPizza = new Pizza[newLength];
				
				// Copier les anciennes valeurs
					
				for(int i = 0; i< tableauPizza.length; i++){
					newTableauPizza[i] = tableauPizza[i];	
				}
				//Ajouter la nouvelle pizza
				
				int id = newLength - 1;
				newTableauPizza[tableauPizza.length] = new Pizza(id, code, nom, prix);
				
				//remplacer la liste precedente
				tableauPizza = newTableauPizza;
				
			}else if (choice == 3) {
				//modifier une pizza
				String codeModif;
								
				
				System.out.println("Mise à jour d'une pizza");
				
				System.out.println("Veuillez saisir le code de la pizza à modifier : ");
				codeModif = choiceMenu.nextLine();
					
				
				System.out.println("Veuillez écrire le nouveau code : ");
				code = choiceMenu.nextLine();

				System.out.println("Veuillez écrire le nouveau nom : ");
				nom = choiceMenu.nextLine();

				System.out.println("Veuillez écrire le nouveau prix : ");
				prix = choiceMenu.nextDouble();

				for (int i =0; i<tableauPizza.length; i++) {
					if (codeModif.equals(tableauPizza[i].code)) {
						tableauPizza[i].code = code;
						tableauPizza[i].libelle = nom;
						tableauPizza[i].prix = prix;
					}
				}
				
			} else if (choice == 4) {
				//supprimer une pizza
				/* 				
				System.out.println("Suppression d'une pizza");
				System.out.println("Veuillez saisir le code de la pizza à supprimer : ");
				
				String codeSuppr = choiceMenu.nextLine();
				
				Pizza[] newTableauPizza = new Pizza[tableauPizza.length-1];
					int iTemp =0;
					for (int i =0; i< tableauPizza.length; i++);
						if (!tableauPizza[i].code.equals(codeSuppr)) {
							newTableauPizza[iTemp] = tableauPizza[i];
							iTemp ++;
						}
						tableauPizza = newTableauPizza;
			*/	
				
			}
			else {
				//quitter l'application						
				System.out.println("Au revoir :(");
				break;
			}

		}

	}

}

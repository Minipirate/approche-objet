/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

/**
 * @author Ness'ti
 *
 */
public class TestTheatre {

	public static void main(String[] args) {

		/*
		 * Instanciation d'un nouveau théâtre et gestion des clients inscrits et de la recette totale
		 */
		Theatre theatre1 = new Theatre("theatreDeLiancourt", 200, 190, 1900);

		theatre1.inscrire(1, 10);
		theatre1.inscrire(2, 20);
		theatre1.inscrire(4, 60);
		theatre1.inscrire(4, 10);

		System.out.println("Au " + theatre1.getClass().getSimpleName() + " on dénombre actuellement "
				+ theatre1.getClientsInscrits() + " clients inscrits "
				+ "et la recette totale présente un montant qui s'élève à " + theatre1.getRecetteTotale() + " €");
	}
}

/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * @author Ness'ti
 *
 */
public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("Vendredi", "Nino", 1300, "salarié");

		System.out.println("Voici le montant du salaire de Nino Vendredi : " + salarie1.getSalaire() + " €");

		System.out.println("Voici les données concernant Nino Vendredi : " + salarie1.afficherDonnees());

		
		
		Pigiste pigiste1 = new Pigiste("Picasso", "Pablo", 2, 400, "pigiste");

		System.out.println("\nVoici le montant du salaire de Pablo Picasso : " + pigiste1.getSalaire() + " €");

		System.out.println("Voici les données concernant Pablo Picasso : " + pigiste1.afficherDonnees());

	}

}

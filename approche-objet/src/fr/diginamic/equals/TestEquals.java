/**
 * 
 */
package fr.diginamic.equals;

import TP10Array.Ville;

/**
 * @author Ness'ti
 *
 */
public class TestEquals {

	public static void main(String[] args) {


		Ville v1 = new Ville("Foix", 9700);
		Ville v2 = new Ville("Foix", 9700);

		boolean egalite = v1.equals(v2);
		System.out.println(egalite);
		
		
		Ville v3 = new Ville("Foix", 9700);
		Ville v4 = new Ville("Foix", 9700);

		boolean egalite2 = v3 == v2;
		System.out.println(egalite);

	}
}

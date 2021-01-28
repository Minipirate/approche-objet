/**
 * 
 */
package banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * @author Ness'ti
 *
 */

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte("500255888", 200);
		System.out.println(compte1.toString());

		CompteTaux compteTaux1 = new CompteTaux("500855200", 300, 1.0);
		System.out.println(compteTaux1.toString());

//tableau de comptes		
		Compte[] comptes = new Compte[2];

		comptes[0] = compte1;
		comptes[1] = compteTaux1;

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
	}
}

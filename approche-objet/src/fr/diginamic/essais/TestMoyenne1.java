/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne1;

/**
 * @author Ness'ti
 *
 */
public class TestMoyenne1 {

	public static void main(String[] args) {

		double[] tableauChiffre = { 10.30, 0, 10.50 };

		CalculMoyenne1 tabMoyenne3 = new CalculMoyenne1();

		tabMoyenne3.setTabMoyenne(tableauChiffre);

		tabMoyenne3.calcul();
	}
}

/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * @author Ness'ti
 *
 */
public class TestForme extends AffichageForme {

	public static void main(String[] args) {

		AffichageForme forme1 = new AffichageForme();

		Rectangle rectangle1 = new Rectangle(8, 5);
		Cercle cercle1 = new Cercle(12.50);
		Carre carre1 = new Carre(3, 3);

		forme1.afficher(rectangle1);
		forme1.afficher(cercle1);
		forme1.afficher(carre1);
	}
}

/**
 * 
 */
package essais;

import entites.Cercle;
import utils.CercleFactory;

/**
 * @author Ness'ti
 *
 */
public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(10);
		Cercle cercle2 = new Cercle(20);

		Cercle cercle3 = CercleFactory.creationCercle(30);

		System.out.println("Le périmètre du cercle 1 est le suivant : " + cercle1.perimetre());
		System.out.println("Le périmètre du cercle 2 est le suivant : " + cercle2.perimetre());

		System.out.println(" ");

		System.out.println("La surface du cercle 1 est la suivante : " + cercle1.surface());
		System.out.println("La surface du cercle 2 est la suivante : " + cercle2.surface());

		System.out.println(" ");

		System.out.println("Le périmètre du cercle 3 est le suivant : " + cercle3.perimetre());
		System.out.println("La surface du cercle 3 est la suivante : " + cercle3.surface());
	}
}

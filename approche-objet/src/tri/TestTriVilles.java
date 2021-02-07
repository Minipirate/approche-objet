/**
 * 
 */
package tri;

import java.util.ArrayList;

import java.util.Collections;

/**
 * @author Ness'ti
 *
 */
public class TestTriVilles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343_000));
		liste.add(new Ville("Carcassonne", 47_800));
		liste.add(new Ville("Narbonne", 53_400));
		liste.add(new Ville("Lyon", 484_000));
		liste.add(new Ville("Foix", 9_700));
		liste.add(new Ville("Pau", 77_200));
		liste.add(new Ville("Marseille", 850_700));
		liste.add(new Ville("Tarbes", 40_600));

		// Tri compareTo
		Collections.sort(liste);
		System.out.println(liste);

		// Tri sur comparatorHabitants
		Collections.sort(liste, new ComparatorHabitant());

		for (Ville v : liste) {
			System.out.println(v);
		}

		// Tri sur comparatorNom
		Collections.sort(liste, new ComparatorNom());

		for (Ville v : liste) {
			System.out.println(v);
		}
	}
}

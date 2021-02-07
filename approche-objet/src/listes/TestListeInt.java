/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ness'ti
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> liste1 = new ArrayList<Integer>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);

		System.out.println(liste1);
		System.out.println("La taille de la liste est : " + liste1.size());
		System.out.println("Le plus grand �l�ment de la liste est : " + Collections.max(liste1));
		liste1.remove(Collections.min(liste1));
		System.out.println("Voici le r�sultat suite � la suppression du plus petit �l�ment : " + liste1);

		for (int i = 0; i < liste1.size(); i++) {
			liste1.get(i);
			if (liste1.get(i) < 0) {
				liste1.set(i, -liste1.get(i));
			}
		}
		System.out.println("Voici le r�sultat suite � la modification vers un �l�ment positif : " + liste1);
	}
}

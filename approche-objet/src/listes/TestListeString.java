/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ness'ti
 *
 */
public class TestListeString {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Nice");
		liste1.add("Carcassonne");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");

		int index = 0;
		int largestString = liste1.get(0).length();

		// Ville qui a le plus grand nombre de lettres
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).length() > largestString) {
				largestString = liste1.get(i).length();
				index = i;
			}
		}
		// caractères max dans la liste1
		int caracMax = 0;
		for (int i = 0; i < liste1.size(); i++) {
			String s = liste1.get(i);
			if (s.length() > caracMax) {
				caracMax = s.length();
			}
		}

		// majuscules
		liste1.replaceAll(String::toUpperCase);

		for (int i = 0; i < liste1.size(); i++) {
			String s = liste1.get(i);
		}

		// supprimer les villes comportant "n" en premier caractère
		for (int i = 0; i < liste1.size(); i++) {
			int index1;
			while ((index1 = liste1.indexOf("n")) >= 1) {
				liste1.remove(index1);
			}
		}

		System.out.println("La ville qui a le plus grand nombre de lettres est " + liste1.get(index) + " avec "
				+ caracMax + " lettres");

		System.out.println(liste1);
	}
}

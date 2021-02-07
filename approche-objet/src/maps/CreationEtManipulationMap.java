/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Ness'ti
 *
 */
public class CreationEtManipulationMap {

	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Affichage de l'ensemble des clefs contenues dans la map
		Iterator<Integer> iterCles = mapVilles.keySet().iterator();
		while (iterCles.hasNext()) {
			Integer cleCourante = iterCles.next();
			System.out.println(cleCourante);
			System.out.println(" ");
		}

		// Affichage de l'ensemble des valeurs contenues dans la map
		Iterator<String> iterValues = mapVilles.values().iterator();
		while (iterValues.hasNext()) {
			String valeurCourante = iterValues.next();
			System.out.println(valeurCourante);
		}

		System.out.println("La taille de mapVilles est :" +mapVilles.size());
	}
}

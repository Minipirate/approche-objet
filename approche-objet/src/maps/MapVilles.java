/**
 * 
 */
package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import TP10Array.Ville;

/**
 * @author Ness'ti
 *
 */
public class MapVilles {

	public static void main(String[] args) {

		Ville Nice = new Ville("Nice", 343_000);
		Ville Carcassonne = new Ville("Carcassonne", 47_800);
		Ville Narbonne = new Ville("Narbonne", 53_400);
		Ville Lyon = new Ville("Lyon", 484_000);
		Ville Foix = new Ville("Foix", 9_700);
		Ville Pau = new Ville("Pau", 77_200);
		Ville Marseille = new Ville("Marseille", 850_700);
		Ville Tarbes = new Ville("Tarbes", 40_600);

		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put(Nice.getNom(), Nice);
		mapVilles.put(Carcassonne.getNom(), Carcassonne);
		mapVilles.put(Narbonne.getNom(), Narbonne);
		mapVilles.put(Lyon.getNom(), Lyon);
		mapVilles.put(Foix.getNom(), Foix);
		mapVilles.put(Pau.getNom(), Pau);
		mapVilles.put(Marseille.getNom(), Marseille);
		mapVilles.put(Tarbes.getNom(), Tarbes);

		// RE et supprimer la ville qui a le moins d'habitants (donc value la plus petite)
		int min = Integer.MAX_VALUE; //(ou mapVilles.values().iterator().next().getNombreHabitants)
		String cleRemove = null;

		Iterator<String> iterCles = mapVilles.keySet().iterator();
		while (iterCles.hasNext()) {
			String cle = iterCles.next();
			Ville ville = mapVilles.get(cle);

			if (ville.getNombreHabitants() < min) {
				min = ville.getNombreHabitants();
				cleRemove = cle;
			}

		}
		mapVilles.remove(cleRemove);
		System.out.println(mapVilles);
	}

}
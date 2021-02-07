/**
 * 
 */
package tri;

import java.util.Comparator;

import maps.MapVilles;

/**
 * @author Ness'ti
 *
 */
public class ComparatorHabitant implements Comparator<Ville> {

	// Méthode compare() pour faire un tri sur le nombre d'habitants
	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getNombreHabitants() > ville2.getNombreHabitants()) {
			return 1;
		}
		if (ville1.getNombreHabitants() < ville2.getNombreHabitants()) {
			return -1;
		}
		return 0;
	}
}

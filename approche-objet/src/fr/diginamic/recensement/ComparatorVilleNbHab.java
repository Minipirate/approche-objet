/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * @author Ness'ti
 *
 */
public class ComparatorVilleNbHab implements Comparator<Ville>{

	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getPopulationTotale() > ville2.getPopulationTotale()) {
			return -1;
		}
		else if (ville1.getPopulationTotale() < ville2.getPopulationTotale()) {
			return 1;
		}
		return 0;
	}
}

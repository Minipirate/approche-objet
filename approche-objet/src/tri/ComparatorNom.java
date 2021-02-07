/**
 * 
 */
package tri;

import java.util.Comparator;

/**
 * @author Ness'ti
 *
 */
public class ComparatorNom implements Comparator<Ville> {

	// Méthode compare() pour faire un tri par le nom
	@Override
	public int compare(Ville ville1, Ville ville2) {
		return ville1.getNom().compareTo(ville2.getNom());
	}
}

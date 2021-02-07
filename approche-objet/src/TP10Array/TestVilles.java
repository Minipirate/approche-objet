/**
 * 
 */
package TP10Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ness'ti
 *
 */
public class TestVilles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343_000));
		liste.add(new Ville("Carcassonne", 47_800));
		liste.add(new Ville("Narbonne", 53_400));
		liste.add(new Ville("Lyon", 484_000));
		liste.add(new Ville("Foix", 9_700));
		liste.add(new Ville("Pau", 77_200));
		liste.add(new Ville("Marseille", 850_700));
		liste.add(new Ville("Tarbes", 40_600));

		// RE de la ville la plus peuplée
		int max = liste.get(0).getNombreHabitants();
		Ville villeLaPlusPeuplee = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			Ville v = liste.get(i);
			if (v.getNombreHabitants() > max) {
				max = v.getNombreHabitants();
				villeLaPlusPeuplee = v;
			}
		}
		System.out.println(villeLaPlusPeuplee);

		// Supp la ville la moins peuplée
		int min = liste.get(0).getNombreHabitants();
		Ville villeLaMoinsPeuplee = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			Ville v = liste.get(i);
			if (v.getNombreHabitants() < min) {
				min = v.getNombreHabitants();
				villeLaMoinsPeuplee = v;
			}
		}
		liste.remove(villeLaMoinsPeuplee);
		System.out.println(liste);

		// Noms des villes de + de 100_000 habitants en MAJ
		for (int i = 0; i < liste.size(); i++) {
			Ville v = liste.get(i);
			if (v.getNombreHabitants() > 100_000) {
				String nomMaj = v.getNom().toUpperCase();
				v.setNom(nomMaj);
			}
		}
		System.out.println(liste);
	}

}

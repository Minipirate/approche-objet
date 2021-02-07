/**
 * 
 */
package tri;

/**
 * @author Ness'ti
 *
 */
public class Ville implements Comparable<Ville> {
	private String nom;
	private int nombreHabitants;

	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

	@Override
	public int compareTo(Ville autre) {

		if (this.nombreHabitants > autre.getNombreHabitants()) {
			return 1;
		}
		if (this.nombreHabitants < autre.getNombreHabitants()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return " nom=" + nom + ", nombreHabitants=" + nombreHabitants + "\n";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}
}

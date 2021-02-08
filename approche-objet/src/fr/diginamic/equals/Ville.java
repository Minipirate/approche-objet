/**
 * 
 */
package fr.diginamic.equals;

/**
 * @author Ness'ti
 *
 */

public class Ville {
	private String nom;
	private int nombreHabitants;

	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

	/*
	 * Redéfinition de la méthode equals
	 */

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj; // caster
		boolean egalite = this.nom.equals(other.getNom()) && this.nombreHabitants == other.getNombreHabitants(); // test
																													// d'égalité
		return egalite;
	}

	
	
	public int compareTo(Ville autre) {
		if (this.nombreHabitants > autre.getNombreHabitants()) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nombreHabitants=" + nombreHabitants + "]";
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

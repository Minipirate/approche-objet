/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Ness'ti
 *
 */
public abstract class Intervenant {
	public String nom;
	public String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract int getSalaire();

	public abstract String afficherDonnees();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}

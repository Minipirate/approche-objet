/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Ness'ti
 *
 */
public class Rectangle extends Forme {

	// Redéfinition des méthodes qui proviennent de la classe abstraite Forme

	public int longueur;
	public int largeur;

	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public void calculerSurface() {
		System.out.println(longueur * largeur);
	}

	public void calculerPerimetre() {
		System.out.println(2 * (longueur + largeur));
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
}
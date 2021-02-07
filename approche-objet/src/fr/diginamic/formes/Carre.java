/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Ness'ti
 *
 */
public class Carre extends Rectangle {

	public int longueur;
	public int largeur;

	public Carre(int longueur, int largeur) {
		super(longueur, largeur);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public void calculerSurface() {
		System.out.println(longueur * longueur);
	}

	public void calculerPerimetre() {
		System.out.println(4 * longueur);
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

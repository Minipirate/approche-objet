/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Ness'ti
 *
 */
public class Cercle extends Forme {

	// Redéfinition des méthodes qui proviennent de la classe abstraite Forme

	public double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public void calculerSurface() {
		System.out.println(Math.PI * rayon * rayon);
	}

	public void calculerPerimetre() {
		System.out.println(2 * Math.PI * rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}

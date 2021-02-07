package TP9;
/**
 * 
 */

/**
 * @author Ness'ti
 *
 */
public class Cercle implements ObjetGeometrique {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

	public double getR() {
		return rayon;
	}

	public void setR(double rayon) {
		this.rayon = rayon;
	}
}

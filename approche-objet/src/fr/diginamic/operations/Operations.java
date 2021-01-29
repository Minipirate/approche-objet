/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author Ness'ti
 *
 */
public class Operations {

	private double a;
	private double b;
	private char operateur;

	public Operations(double a, double b, char operateur) {
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}

	public double calcul() {
		if (operateur == '+') {
			return a + b;
		} else if (operateur == '-') {
			return a - b;
		} else if (operateur == '*') {
			return a * b;
		} else if (operateur == '/') {
			return a / b;
		} else {
			return a + b;
		}

	}
}

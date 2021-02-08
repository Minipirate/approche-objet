/**
 * 
 */
package fr.diginamic.chaines;

/**
 * @author Ness'ti
 *
 */
public class TestStringBuilder {

	public static void main(String[] args) {

		/*
		 * Chrono avec StringBuilder
		 */

		String string1 = "";

		long debut = System.currentTimeMillis();

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < 100000; i++) {
			builder.append(i);
		}
		string1 = builder.toString();

		// Code à chronométrer
		long fin = System.currentTimeMillis();
		long duree = fin - debut;

		System.out.println("Temps écoulé en millisecondes :" + duree);
	}
}
/*
 * Version Chrono avec String et concaténation +
 */

/*
 * String string2 = "";
 * 
 * long debut = System.currentTimeMillis();
 * 
 * for (int i = 0; i < 100000; i++) {
 * 
 * string2 += i;
 * 
 * }
 * 
 * // Code à chronométrer long fin = System.currentTimeMillis(); long duree =
 * fin - debut;
 * 
 * System.out.println("Temps écoulé en millisecondes :" + duree);
 * 
 * }
 */

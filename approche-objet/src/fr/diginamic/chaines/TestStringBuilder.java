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

		// Code � chronom�trer
		long fin = System.currentTimeMillis();
		long duree = fin - debut;

		System.out.println("Temps �coul� en millisecondes :" + duree);
	}
}
/*
 * Version Chrono avec String et concat�nation +
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
 * // Code � chronom�trer long fin = System.currentTimeMillis(); long duree =
 * fin - debut;
 * 
 * System.out.println("Temps �coul� en millisecondes :" + duree);
 * 
 * }
 */

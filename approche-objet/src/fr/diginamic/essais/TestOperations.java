/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * @author Ness'ti
 *
 */
public class TestOperations {

	public static void main(String[] args) {

		Operations operation1 = new Operations(2, 4, '+');
		Operations operation2 = new Operations(8, 1, '-');
		Operations operation3 = new Operations(2, 9, '*');
		Operations operation4 = new Operations(7, 5, '/');

		double result1 = operation1.calcul();
		double result2 = operation2.calcul();
		double result3 = operation3.calcul();
		double result4 = operation4.calcul();

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}

/**
 * 
 */
package listes;

import java.util.ArrayList;

/**
 * @author Ness'ti
 *
 */
public class CreationListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
	           list.add(i);
	        }
		System.out.println("La taille de list est : " +list.size());
	}
}

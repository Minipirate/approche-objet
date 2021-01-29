/**
 * 
 */
package utils;

import entites.Cercle;

/**
 * @author Ness'ti
 *
 */
public class CercleFactory {

	public static Cercle creationCercle (double rayon){
		return new Cercle(rayon) ;
	}
}

/**
 * 
 */
package fr.diginamic.testexceptions;


/**
 * @author Ness'ti
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ville ville1 = new Ville("Lyon", 484_000);
		ReflectionUtils r = new ReflectionUtils();
		
		try {
			r.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

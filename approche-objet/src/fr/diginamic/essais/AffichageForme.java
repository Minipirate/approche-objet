/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * @author Ness'ti
 *
 */
public class AffichageForme {

	public static void main(String[] args) {

	}

	// M�thode afficher() qui prend en param une variable de type Forme et affiche
	// p�rim�tre + surface de la forme

	public void afficher(Forme form) {
		if (form instanceof Rectangle) {
			form.calculerPerimetre();
			form.calculerSurface();
		}
		if (form instanceof Carre) {
			form.calculerPerimetre();
			form.calculerSurface();
		}
		if (form instanceof Cercle) {
			form.calculerPerimetre();
			form.calculerSurface();
		}
	}
}

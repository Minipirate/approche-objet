/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author Ness'ti
 *
 */

public class CalculMoyenne1 {
	double[] tabMoyenne;

	public CalculMoyenne1() {
		this.tabMoyenne = tabMoyenne;
	}

	public void ajout(double nbr) {
		for (int i = 0; i <= tabMoyenne.length - 1; i++) {
			if (tabMoyenne[i] == 0) {
				tabMoyenne[i] = nbr;
			}
		}
	}

	public void calcul() {
		double somme = 0;
		for (int i = 0; i < tabMoyenne.length; i++) {
			somme += tabMoyenne[i];
		}
		double moyenne = somme / tabMoyenne.length;
		System.out.println(moyenne);
	}

	public double[] getTabMoyenne() {
		return tabMoyenne;
	}

	public void setTabMoyenne(double[] tabMoyenne) {
		this.tabMoyenne = tabMoyenne;
	}

}

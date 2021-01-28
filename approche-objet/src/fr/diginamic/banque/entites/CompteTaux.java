/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Ness'ti
 *
 */
public class CompteTaux extends Compte {

	private double tauxRemuneration;

//constructeur 
	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

// Red�finition de la m�thode toString
	@Override
	public String toString() {
		String infosClasseMere = super.toString();
		return infosClasseMere + " ->Taux R�mun�ration :" + tauxRemuneration;
	}
}
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

// Redéfinition de la méthode toString
	@Override
	public String toString() {
		String infosClasseMere = super.toString();
		return infosClasseMere + " ->Taux Rémunération :" + tauxRemuneration;
	}
}
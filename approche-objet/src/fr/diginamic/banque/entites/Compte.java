package fr.diginamic.banque.entites;

/**
 * @author Ness'ti
 *
 */
public class Compte {

	private String numeroCompte;
	private double soldeCompte;

	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte = " + numeroCompte + ", soldeCompte = " + soldeCompte + "]";
	}
}
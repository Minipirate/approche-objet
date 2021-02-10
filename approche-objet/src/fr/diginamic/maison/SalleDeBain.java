/**
 * 
 */
package fr.diginamic.maison;

/**
 * @author Ness'ti
 *
 */
public class SalleDeBain extends Piece {

	/*
	 * Constructeur classe SalleDeBain
	 */
	public SalleDeBain(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	/*
	 * Méthode afficherTypePiece
	 */

	@Override
	public String afficherTypePiece() {
		return "SalleDeBain";
	}

	/*
	 * @getter Superficie
	 */

	public double getSuperficie() {
		return superficie;
	}

	/*
	 * @setter Superficie
	 */

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/*
	 * @getter NumeroEtage
	 */

	public int getNumeroEtage() {
		return numeroEtage;
	}

	/*
	 * @setter NumeroEtage
	 */

	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}

}

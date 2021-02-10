/**
 * 
 */
package fr.diginamic.maison;

/**
 * @author Ness'ti
 *
 */
public abstract class Piece {

	protected double superficie;
	protected int numeroEtage;

	/**
	 * constructeur Piece
	 * 
	 * @param superficie
	 * @param numeroEtage
	 */
	public Piece(double superficie, int numeroEtage) {
		super();
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	/*
	 * Méthode afficherTypePiece
	 */

	public String afficherTypePiece() {
		return null;
	}

	/*
	 * @getter superficie
	 */

	public double getSuperficie() {
		return superficie;
	}

	/*
	 * @setter superficie
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

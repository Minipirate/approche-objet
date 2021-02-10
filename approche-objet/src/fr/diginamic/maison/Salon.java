/**
 * 
 */
package fr.diginamic.maison;

/**
 * @author Ness'ti
 *
 */
public class Salon extends Piece {

	/*
	 * Constructeur classe Salon
	 */

	public Salon(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	/*
	 * Méthode afficherTypePiece
	 */

	@Override
	public String afficherTypePiece() {
		return "Salon";
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
	 * @getter NumeroEtage
	 */

	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}

}

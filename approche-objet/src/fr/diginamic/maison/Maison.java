/**
 * 
 */
package fr.diginamic.maison;

/**
 * 
 * @author Ness'ti
 *
 */
public class Maison {

	/**
	 * tableau contenant les Pieces de la maison
	 */
	Piece[] tabPieces;

	/*
	 * Constructeur Maison
	 */
	public Maison() {
		super();
		this.tabPieces = new Piece[0]; // Création d'une maison vide
	}

	/*
	 * M�thode pour ajouter une pi�ce de la maison
	 */
	public void ajouterPiece(Piece piece) {

		if (piece.getNumeroEtage() >= 0 && piece.getSuperficie() > 0 && piece != null) { // Okay pour test du param null
			Piece[] tabAccueilPieces = new Piece[tabPieces.length + 1];
			for (int i = 0; i < tabPieces.length; i++) {

				tabAccueilPieces[i] = tabPieces[i]; // Ici la pièce courante du tabPieces est dupliquée dans le nouveau
													// (tabAccueilPieces)
			}
			tabAccueilPieces[tabAccueilPieces.length - 1] = piece;
			tabPieces = tabAccueilPieces;
		}
	}

	/*
	 * M�thode pour obtenir la superficie totale de la maison
	 */

	public double superficieTotale() {

		double superficieMaison = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			tabPieces[i].getSuperficie();
			superficieMaison += tabPieces[i].getSuperficie();
		}
		return superficieMaison;
	}

	/*
	 * M�thode pour obtenir la superficie d'un �tage donn�
	 */
	public double superficieEtage(int etage) {

		double superficieEtageMaison = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getNumeroEtage() == etage) {
				superficieEtageMaison += tabPieces[i].getSuperficie();
			}
		}
		return superficieEtageMaison;
	}

	/*
	 * Méthode pour obtenir la superficie globale d'un type de pièce
	 */

	public double superficieGlobaleTypePiece(String typePiece) {

		double superficieTypePiece = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].afficherTypePiece() == typePiece) {
				superficieTypePiece = tabPieces[i].getSuperficie();
			}
		}
		return superficieTypePiece;
	}

	/*
	 * Méthode pour obtenir le nombre de pièces d'un type donné
	 */

	public int nombrePiecesType(String typePiece) {
		int nombrePieces = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].afficherTypePiece() == typePiece) {
				nombrePieces += 1;
			}
		}
		return nombrePieces;
	}

	/**
	 * @getter tabPieces
	 */
	public Piece[] getTabPieces() {
		return tabPieces;
	}

	/**
	 * @setter tabPieces
	 */
	public void setTabPieces(Piece[] tabPieces) {
		this.tabPieces = tabPieces;
	}
}

/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

/**
 * @author Ness'ti
 *
 */
public class TestMaison {

	
	public static void main(String[] args) {
		
		Maison maison1 = new Maison();
		

		Chambre chambre1 = new Chambre(18, 1);
		Chambre chambre2 = new Chambre(20, 1);
		Salon salon1 = new Salon(30, 0);
		Cuisine cuisine1 = new Cuisine(15, 0);
		SalleDeBain salleDeBain1 = new SalleDeBain(5, 1);
		SalleDeBain salleDeBain2 = new SalleDeBain(8, 1);
		Wc wc1 = new Wc(2, 0);
		
		maison1.ajouterPiece(chambre1);
		maison1.ajouterPiece(chambre2);
		maison1.ajouterPiece(salon1);
		maison1.ajouterPiece(cuisine1);
		maison1.ajouterPiece(salleDeBain1);
		maison1.ajouterPiece(salleDeBain2);
		maison1.ajouterPiece(wc1);
		
		
		System.out.println("\nLa superficie totale de la maison1 est de : " + maison1.superficieTotale());
		System.out.println("\nLa superficie du rez-de-chaussée de la maison1 est de : " + maison1.superficieEtage(0)); 
		System.out.println("\nLa superficie de l'étage 1 de la maison1 est de : " + maison1.superficieEtage(1)); 
		
		
		System.out.println("\nLa superficie globale du type Chambre est de : " + maison1.superficieGlobaleTypePiece("Chambre"));
		System.out.println("La superficie globale du type Salon est de : " + maison1.superficieGlobaleTypePiece("Salon"));
		System.out.println("La superficie globale du type Cuisine est de : " + maison1.superficieGlobaleTypePiece("Cuisine"));
		System.out.println("La superficie globale du type SalleDeBain est de : " + maison1.superficieGlobaleTypePiece("SalleDeBain"));
		System.out.println("La superficie globale du type Wc est de : " + maison1.superficieGlobaleTypePiece("Wc"));
		
		
		System.out.println("\nLe nombre de Chambre de la maison1 est de : " + maison1.nombrePiecesType("Chambre"));
		System.out.println("Le nombre de Salon de la maison1 est de : " + maison1.nombrePiecesType("Salon"));
		System.out.println("Le nombre de Cuisine de la maison1 est de : " + maison1.nombrePiecesType("Cuisine"));
		System.out.println("Le nombre de Salle de Bain de la maison1 est de : " + maison1.nombrePiecesType("SalleDeBain"));
		System.out.println("Le nombre de Wc de la maison1 est de : " + maison1.nombrePiecesType("Wc"));
	}
}


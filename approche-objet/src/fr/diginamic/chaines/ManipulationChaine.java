/**
 * 
 */
package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

/**
 * @author Ness'ti
 *
 */
public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";
		
		// Méthode charAt(int index) pour afficher le 1er carac de la chaîne
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		// Méthode length() pour afficher la longueur de la chaîne de carac
		System.out.println("\nLa longueur de la chaîne de caractère est " + chaine.length());
		
		// Méthode indexOf(char c) pour afficher l'index du 1er ";" contenu dans la chaîne 
		System.out.println("\nL'index du premier point virgule contenu dans la chaîne de caractères est l'index " +chaine.indexOf(";"));
		
		// Combinaison de la Méthode substring(int start, int end) et indexOf afin d'extraire le nom de famille de la personne
		int extract = chaine.indexOf(";");
		System.out.println("\nLe nom de famille de la personne est " + chaine.substring(0,extract));
		
		// Affichage du nom de famille en MAJ avec la méthode toUpperCase()
		System.out.println("\nVoici le nom de famille de la personne en majuscule : " +chaine.substring(0,6).toUpperCase());
		
		// Affichage du nom de famille en minuscules avec la méthode toLowerCase()
		System.out.println("\nVoici le nom de famille de la personne en minuscule : " +chaine.substring(0,6).toLowerCase());
		
		// Affichage du tableau suite au découpage de la chaîne en morceaux 
		String[] tabChaine = chaine.split(";");
		System.out.println("\nVoici la chaîne sans séparateur : " +tabChaine[0] + tabChaine[1]+ tabChaine[2]);	
		
		// Instance de Salarie
		String replaceEspace = tabChaine[2].replace(" ", "");
		double salaire1 = Double.parseDouble(replaceEspace);
		Salarie Salarie1 = new Salarie(tabChaine[0], tabChaine[1], salaire1);
		System.out.println("\nVoici l'instance de Salarie : " +Salarie1.toString());
	}
}

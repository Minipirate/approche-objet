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
		
		// M�thode charAt(int index) pour afficher le 1er carac de la cha�ne
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caract�re: " + premierCaractere);

		// M�thode length() pour afficher la longueur de la cha�ne de carac
		System.out.println("\nLa longueur de la cha�ne de caract�re est " + chaine.length());
		
		// M�thode indexOf(char c) pour afficher l'index du 1er ";" contenu dans la cha�ne 
		System.out.println("\nL'index du premier point virgule contenu dans la cha�ne de caract�res est l'index " +chaine.indexOf(";"));
		
		// Combinaison de la M�thode substring(int start, int end) et indexOf afin d'extraire le nom de famille de la personne
		int extract = chaine.indexOf(";");
		System.out.println("\nLe nom de famille de la personne est " + chaine.substring(0,extract));
		
		// Affichage du nom de famille en MAJ avec la m�thode toUpperCase()
		System.out.println("\nVoici le nom de famille de la personne en majuscule : " +chaine.substring(0,6).toUpperCase());
		
		// Affichage du nom de famille en minuscules avec la m�thode toLowerCase()
		System.out.println("\nVoici le nom de famille de la personne en minuscule : " +chaine.substring(0,6).toLowerCase());
		
		// Affichage du tableau suite au d�coupage de la cha�ne en morceaux 
		String[] tabChaine = chaine.split(";");
		System.out.println("\nVoici la cha�ne sans s�parateur : " +tabChaine[0] + tabChaine[1]+ tabChaine[2]);	
		
		// Instance de Salarie
		String replaceEspace = tabChaine[2].replace(" ", "");
		double salaire1 = Double.parseDouble(replaceEspace);
		Salarie Salarie1 = new Salarie(tabChaine[0], tabChaine[1], salaire1);
		System.out.println("\nVoici l'instance de Salarie : " +Salarie1.toString());
	}
}

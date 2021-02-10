/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * @author Ness'ti
 *
 */
public class TestEnumeration {

	public static void main(String[] args) {

		System.out.println("Voici les 4 saisons : ");

		for (Saison saison : Saison.values()) {
			System.out.println(saison);
		}

		System.out.println("\nVoici la saison été : ");

		String nom = "ETE";
		Saison ete = Saison.valueOf(nom);
		System.out.println(ete);

		System.out.println("\nVoici la saison hiver : ");

		String libelle = "Hiver";
		Saison hiver = Saison.getByLibelle(libelle);
		System.out.println(hiver);

	}
}

/**
 * 
 */
package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author Ness'ti
 *
 */
public class Application {

	public static void main(String[] args) throws IOException {

		Path pathOrigine = Paths.get("C:/workspaceJava/recensement.csv");
		List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);

		ArrayList<Ville> listeVilles = new ArrayList<>();

		List<Ville> listeOccitanie = new ArrayList<>();

		for (int i = 1; i < lines.size(); i++) {

			String line = lines.get(i);
			String[] morceauxVilles = line.split(";");

			Collections.addAll(listeVilles, new Ville(morceauxVilles[0], morceauxVilles[1], morceauxVilles[2],
					morceauxVilles[5], morceauxVilles[6], Integer.parseInt(morceauxVilles[9].replaceAll(" ", ""))));
		}

		/*
		 * Recherche et affichage des informations relatives � la ville de Montpellier
		 */
		for (int i = 1; i < listeVilles.size(); i++) {
			if (listeVilles.get(i).getNomCommune().equals("Montpellier")) {
				System.out.println(
						"Voici les informations concernant la ville de Montpellier : " + listeVilles.get(i).toString());
			}
		}

		/*
		 * Affichage de la population du D�partement de l'H�rault
		 */
		int compteurPop = 0;
		for (int i = 1; i < listeVilles.size(); i++) {

			if (listeVilles.get(i).getCodeDepartement().equals("34")) {
				compteurPop += listeVilles.get(i).getPopulationTotale();
			}
		}
		System.out.println("\nVoici la population totale de l'H�rault : " + compteurPop);

		/*
		 * Affichage de la plus petite ville du d�partement de l'H�rault
		 */
		int min = Integer.MAX_VALUE;
		Ville ville1 = null;

		for (int i = 1; i < listeVilles.size(); i++) {
			if (listeVilles.get(i).getCodeDepartement().equals("34")) {
				if (listeVilles.get(i).getPopulationTotale() < min) {
					ville1 = listeVilles.get(i);
					min = listeVilles.get(i).getPopulationTotale();
				}
			}
		}
		System.out.println("\nVoici la plus petite ville de l'H�rault : " + ville1.getNomCommune());

		/*
		 * Affichage des 10 plus grandes villes de l'Herault
		 */
		ArrayList<Ville> listePlusGrandesVillesHerault = new ArrayList<>();

		System.out.println("\nVoici la liste des dix plus grandes villes de l'Herault : ");

		int nbGrandesVilles = 10;

		for (int i = 1; i < listeVilles.size(); i++) {
			Ville ville = listeVilles.get(i);
			if (listeVilles.get(i).getCodeDepartement().equals("34")) {
				listePlusGrandesVillesHerault.add(ville);
			}
		}
		Collections.sort(listePlusGrandesVillesHerault, new ComparatorVilleNbHab());

		for (int i = 0; i < nbGrandesVilles; i++) {
			System.out.println(listePlusGrandesVillesHerault.get(i).getNomCommune());
		}

		/*
		 * Affichage des 10 plus petites villes de l'Herault
		 */
		ArrayList<Ville> listePlusPetitesVillesHerault = new ArrayList<>();

		System.out.println("\nVoici la liste des dix plus petites villes de l'Herault : ");

		int nbPetitesVilles = 10;

		for (int i = 1; i < listeVilles.size(); i++) {
			Ville ville = listeVilles.get(i);
			if (listeVilles.get(i).getCodeDepartement().equals("34")) {
				listePlusPetitesVillesHerault.add(ville);
			}
		}
		Collections.sort(listePlusPetitesVillesHerault, new ComparatorVilleNbHabSmall());
		for (int i = 0; i < nbPetitesVilles; i++) {
			System.out.println(listePlusPetitesVillesHerault.get(i).getNomCommune());
		}

		/*
		 * Affichage de la population de la r�gion Occitanie
		 */

		System.out.println("\nVoici la population de toute la r�gion Occitanie : ");

		int compteurPopRegion = 0;

		for (int i = 1; i < listeVilles.size(); i++) {
			if (listeVilles.get(i).getCodeRegion().equals("76")) {
				compteurPopRegion += listeVilles.get(i).getPopulationTotale();
			}
		}
		System.out.println(compteurPopRegion);

		/*
		 * Affichage des 10 villes les plus importantes de la r�gion Occitanie
		 */
		ArrayList<Ville> listeVillesImportantesOccitanie = new ArrayList<>();

		System.out.println("\nVoici la liste des dix villes les plus importantes de la r�gion Occitanie : ");

		int nbVillesOccitanie = 10;

		for (int i = 1; i < listeVilles.size(); i++) {
			Ville ville = listeVilles.get(i);
			if (listeVilles.get(i).getCodeRegion().equals("76")) {
				listeVillesImportantesOccitanie.add(ville);
			}
		}
		Collections.sort(listeVillesImportantesOccitanie, new ComparatorOccitanie());
		for (int i = 0; i < nbVillesOccitanie; i++) {
			System.out.println(listeVillesImportantesOccitanie.get(i).getNomCommune());
		}

		/*
		 * Affichage du d�partement le plus peupl� de la r�gion Occitanie
		 */

		// Integralit� des villes de l'Occitanie

		for (Ville regionO : listeVilles) {

			if (regionO.getCodeRegion().equals("76")) {

				listeOccitanie.add(regionO);
			}
		}

		/*
		 * Affichage du d�partement le plus peupl� de la r�gion Occitanie
		 */

		System.out.println("\nVoici le d�partement le plus peupl� de la r�gion Occitanie : ");

		HashMap<String, Departement> mapDepartement = new HashMap<String, Departement>();

		List<Departement> listeDepartements = new ArrayList<>();

		for (int i = 0; i < listeOccitanie.size(); i++) {
			String codeDep = listeOccitanie.get(i).getCodeDepartement();
			int popDep = listeOccitanie.get(i).getPopulationTotale();

			if (!mapDepartement.containsKey(codeDep)) {

				mapDepartement.put(codeDep, new Departement(codeDep, popDep));// Ajout des codes � la HashMap et pop

				listeDepartements.add(mapDepartement.get(codeDep)); // Transfert dans la liste des d�partements
			} else {
				mapDepartement.get(codeDep)
						.setPopulationTotale(mapDepartement.get(codeDep).getPopulationTotale() + popDep);
			}
		}
		Collections.sort(listeDepartements); // ordre d�croissant
		System.out.println(listeDepartements.get(0));

		/*
		 * Affichage des dix r�gions les plus peupl�es de France
		 */

		System.out.println("\nVoici les dix r�gions les plus peupl�es de France : ");

		HashMap<String, Region> mapRegion = new HashMap<String, Region>();

		List<Region> listeRegions = new ArrayList<>();

		for (int i = 0; i < listeVilles.size(); i++) {
			String codeRegion = listeVilles.get(i).getCodeRegion();
			int popRegion = listeVilles.get(i).getPopulationTotale();

			if (!mapRegion.containsKey(codeRegion)) {

				mapRegion.put(codeRegion, new Region(codeRegion, popRegion));

				listeRegions.add(mapRegion.get(codeRegion));
			} else {
				mapRegion.get(codeRegion).setPopulationTotale(mapRegion.get(codeRegion).getPopulationTotale() + popRegion);
			}
		}
		Collections.sort(listeRegions);
		int nombreRegionsPop = 10;
		for (int i = 0; i < nombreRegionsPop; i++) {
			System.out.print(listeRegions.get(i).getCodeRegion() + " ");
		}

		/*
		 * Affichage des dix d�partements les plus peupl�s de France
		 */
		System.out.println(" ");
		System.out.println("\nVoici les dix d�partements les plus peupl�s de France : ");

		Collections.sort(listeDepartements);
		int nombreDepartementsPop = 10;
		for (int i = 0; i < nombreDepartementsPop; i++) {
			System.out.print(listeDepartements.get(i).getCodeDepartement() + " ");
		}

		/*
		 * Affichage des dix villes les plus peupl�es de France
		 */
		System.out.println(" ");
		System.out.println("\nVoici les dix villes les plus peupl�es de France : ");
		int nbVillesPopFrance = 10;

		for (int i = 1; i < listeVilles.size(); i++) {
			Ville ville = listeVilles.get(i);
		}
		Collections.sort(listeVilles, new ComparatorVilleNbHab());
		for (int i = 0; i < nbVillesPopFrance; i++) {
			System.out.print(listeVilles.get(i).getNomCommune() + " ");
		}
	}
}

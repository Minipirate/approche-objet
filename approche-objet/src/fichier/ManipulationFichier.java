/**
 * 
 */
package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ness'ti
 *
 */
public class ManipulationFichier {

	public static void main(String[] args) throws IOException {

		Path pathOrigine = Paths.get("C:/workspaceJava/recensement.csv");
		List<String> lignes = Files.readAllLines(pathOrigine);

		ArrayList<String> selection = new ArrayList<>();

		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);
			String[] morceauxLignes = ligne.split(";");

			int nbPopulation = Integer.parseInt(morceauxLignes[9].replaceAll(" ", "")); // on remplace les espaces ici
																						// par des carac vides
			if (nbPopulation > 25000) {
				String ligneSortie = morceauxLignes[6]+";"+morceauxLignes[0]+";"+nbPopulation;
						
				selection.add(ligneSortie);
			}
		}
		Path pathDestination = Paths.get("C:/workspaceJava/recensementCopie.csv");
		Files.write(pathDestination, selection);
	}
}

/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

/**
 * @author Ness'ti
 *
 */
public class TestTheatrePro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TheatrePro theatrePro1 = new TheatrePro("theatredeLiancourt"); 
		
		Spectacle spectacle1 = new Spectacle("Spectacle de danse", "danse", 10, 80, 70);
		Spectacle spectacle2 = new Spectacle("Spectacle d'improvisation", "improvisation", 10, 80, 50);
		Spectacle spectacle3 = new Spectacle("Spectacle comédie", "comédie", 11, 80, 40);
		Spectacle spectacle4 = new Spectacle("Concert soirée disco", "concert", 20, 80, 60);
		
		
		theatrePro1.ajouterNewSpectacle(spectacle1);
		theatrePro1.ajouterNewSpectacle(spectacle2);
		theatrePro1.ajouterNewSpectacle(spectacle3);
		theatrePro1.ajouterNewSpectacle(spectacle4);
		
		
		theatrePro1.inscrire(3,"Spectacle de danse");
		theatrePro1.inscrire(8,"Spectacle d'improvisation");
		theatrePro1.inscrire(2,"Spectacle comédie");
		theatrePro1.inscrire(1,"Concert soirée disco");
		
		
		System.out.println("La recette globale est de " + theatrePro1.getRecetteTotale() + " €");

	}
}

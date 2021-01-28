package essais;

import entites.AdressePostale;
import entites.CompteBancaire;
import entites.Personne;

/**
 * @author Ness'ti
 *
 */
public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(5, "rue B", 34000, "Montpellier");
		Personne pers1 = new Personne ("Yoda", "Boo", adr1);
		
		pers1.afficherIdentite();
		pers1.modifierNom("Koooo");
		pers1.afficherIdentite();
		
		pers1.modifierPrenom("Bastien");
		pers1.afficherIdentite();
		
		AdressePostale nvAdresse = new AdressePostale(8, "rue C", 34000, "Montpellier");
		pers1.setAdresse(nvAdresse);
		
		System.out.println(pers1.getAdresse());
		
		/*
		 * adr1.numeroDeRue = 1; adr1.libelleDeLaRue = "rue de Yoda"; adr1.codePostal =
		 * 34000; adr1.ville = "Montpellier";
		 * 
		 * Personne pers3 = new Personne(); pers3.nomPersonne = "Forever";
		 * pers3.prenomPersonne = "Batman"; pers3.adressePostale = adr1;
		 * 
		 * CompteBancaire cb = new CompteBancaire(); cb.numero = 55555165; cb.solde =
		 * 50.0; cb.personne = pers3;
		 */

	}
}

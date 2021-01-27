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

		Personne pers1 = new Personne("Nanou", "MiniPirate");
		AdressePostale adr = new AdressePostale(1, "rue de Yoda", 34000, "Montpellier");
		
		System.out.println(pers1.nomPersonne + " " + pers1.prenomPersonne);
		
		/*adr1.numeroDeRue = 1;
		adr1.libelleDeLaRue = "rue de Yoda";
		adr1.codePostal = 34000;
		adr1.ville = "Montpellier";

		Personne pers3 = new Personne();
		pers3.nomPersonne = "Forever";
		pers3.prenomPersonne = "Batman";
		pers3.adressePostale = adr1;

		CompteBancaire cb = new CompteBancaire();
		cb.numero = 55555165;
		cb.solde = 50.0;
		cb.personne = pers3;*/

	}
}

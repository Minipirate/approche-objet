package essais;

import entites.AdressePostale;

/**
 * @author Ness'ti
 *
 */
public class TestAdressePostale {

	public static void main(String[] args) {
	
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroDeRue = 1;
		adr1.libelleDeLaRue = "rue de Yoda";
		adr1.codePostal = 34000;
		adr1.ville = "Montpellier";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroDeRue = 2;
		adr2.libelleDeLaRue = "rue de Batman";
		adr2.codePostal = 34000;
		adr2.ville = "Montpellier";
		
		System.out.println(adr1.codePostal);
	}
}

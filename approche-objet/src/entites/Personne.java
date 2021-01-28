/**
 * 
 */
package entites;

/**
 * @author Ness'ti
 *
 */
public class Personne {
	public String nomPersonne;
	public String prenomPersonne;
	public AdressePostale adressePostale;	

	public void afficherIdentite() {
		System.out.println(nomPersonne.toUpperCase() + " " + prenomPersonne);
	}
	
	public void modifierNom(String nm) {
		nomPersonne = nm;
	}
	
	public void modifierPrenom(String pr) {
		prenomPersonne = pr;
	}
	
	public void setAdresse(AdressePostale ap) {
		adressePostale = ap;
	}
	
	public String getNom() {
		return nomPersonne;
	}
	
	public String getPrenom() {
		return prenomPersonne;
	}
	
	public AdressePostale getAdresse() {
		return adressePostale;
	}
	
	
	/*public Personne (String nomPersonne, String prenomPersonne){
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
	}*/
	
	public Personne (String nomPersonne, String prenomPersonne, AdressePostale adressePostale) {
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.adressePostale = adressePostale; 

	}
}



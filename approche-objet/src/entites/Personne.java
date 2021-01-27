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

	
	public Personne (String nomPersonne, String prenomPersonne){
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
	}
	
	public Personne (String nomPersonne, String prenomPersonne, AdressePostale adressePostale) {
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.adressePostale = adressePostale; 
	}
}

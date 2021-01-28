/**
 * 
 */
package entites;


/**
 * @author Ness'ti
 *
 */
public class AdressePostale  {
	public int numeroDeRue;
	public String libelleeDeLaRue;
	public int codePostal;
	public String ville;

	public AdressePostale(int numeroDeRue, String libelleDeLaRue, int codePostal, String ville) {
		this.numeroDeRue = numeroDeRue;
		this.libelleeDeLaRue = libelleDeLaRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroDeRue=" + numeroDeRue + ", libelleeDeLaRue=" + libelleeDeLaRue + ", codePostal="
				+ codePostal + ", ville=" + ville + "]";
	}
}

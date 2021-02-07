/**
 * 
 */
package fr.diginamic.entites;

/**
 * @author Ness'ti
 *
 */
public class Theatre {

	public String nomTheatre;
	public int capaciteMax;
	public int clientsInscrits;
	public int recetteTotale;

	public Theatre(String nomTheatre, int capaciteMax, int clientsInscrits, int recetteTotale) {
		this.nomTheatre = nomTheatre;
		this.capaciteMax = capaciteMax;
		this.clientsInscrits = clientsInscrits;
		this.recetteTotale = recetteTotale;
	}

	public void inscrire(int nvxClients, int prixPlace) {
		if (nvxClients + clientsInscrits <= capaciteMax) {
			clientsInscrits += nvxClients;
			recetteTotale += prixPlace * nvxClients;

		} else if (nvxClients +clientsInscrits >= capaciteMax) {
			System.out.println("La capacité maximale du théâtre est atteinte !");
		}
	}

	public String getNomTheatre() {
		return nomTheatre;
	}

	public void setNomTheatre(String nomTheatre) {
		this.nomTheatre = nomTheatre;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getClientsInscrits() {
		return clientsInscrits;
	}

	public void setClientsInscrits(int clientsInscrits) {
		this.clientsInscrits = clientsInscrits;
	}

	public int getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(int recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
}
/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Ness'ti
 *
 */
public class Pigiste extends Intervenant {

	int nombreJoursTravailles;
	int montantJournalierRemuneration;
	String statut;

	public Pigiste(String nom, String prenom, int nombreJoursTravailles, int montantJournalierRemuneration,
			String statut) {
		super(nom, prenom);
		this.nombreJoursTravailles = nombreJoursTravailles;
		this.montantJournalierRemuneration = montantJournalierRemuneration;
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Pigiste [nombreJoursTravailles=" + nombreJoursTravailles + ", montantJournalierRemuneration="
				+ montantJournalierRemuneration + ", statut=" + statut + "]";
	}

	@Override
	public String afficherDonnees() {
		return "Nom -> " + nom + ("/ ") + "Prénom -> " + (" ") + prenom + ("/ ") + "Nombre de jours travaillés -> "
				+ (" ") + nombreJoursTravailles + (" ") + "Montant journalier rémunération -> " + (" ")
				+ montantJournalierRemuneration + ("/ ") + "Statut -> " + statut;
	}

	@Override
	public int getSalaire() {
		return nombreJoursTravailles * montantJournalierRemuneration;
	}

	public int getNombreJoursTravailles() {
		return nombreJoursTravailles;
	}

	public void setNombreJoursTravailles(int nombreJoursTravailles) {
		this.nombreJoursTravailles = nombreJoursTravailles;
	}

	public int getMontantJournalierRemuneration() {
		return montantJournalierRemuneration;
	}

	public void setMontantJournalierRemuneration(int montantJournalierRemuneration) {
		this.montantJournalierRemuneration = montantJournalierRemuneration;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}

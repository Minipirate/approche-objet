/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Ness'ti
 *
 */
public class Salarie extends Intervenant {

	int montantSalaireMensuel;
	String statut;

	public Salarie(String nom, String prenom, int montantSalaireMensuel, String statut) {
		super(nom, prenom);
		this.montantSalaireMensuel = montantSalaireMensuel;
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Salarie [montantSalaireMensuel=" + montantSalaireMensuel + ", statut=" + statut + "]";
	}

	@Override
	public int getSalaire() {
		return montantSalaireMensuel;
	}

	@Override
	public String afficherDonnees() {
		return "Nom -> " + nom + ("/ ") + "Prénom -> " + (" ") + prenom + ("/ ") + "Montant salaire mensuel -> " + (" ")
				+ montantSalaireMensuel + ("/ ") + "Statut -> " + statut;
	}

	public int getMontantSalaireMensuel() {
		return montantSalaireMensuel;
	}

	public void setMontantSalaireMensuel(int montantSalaireMensuel) {
		this.montantSalaireMensuel = montantSalaireMensuel;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}

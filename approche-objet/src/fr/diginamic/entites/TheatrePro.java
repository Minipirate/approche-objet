/**
 * 
 */
package fr.diginamic.entites;

/**
 * @author Ness'ti
 *
 */
public class TheatrePro {

	public String nom;
	public double recetteTotale;
	

	Spectacle[] tabSpectacles;

	/*
	 * Constructeur classe TheatrePro
	 */

	public TheatrePro(String nom) {
		super();
		this.nom = nom;
		this.tabSpectacles = new Spectacle[0];
	}

	/*
	 * Méthode qui permet d'ajouter un nouveau spectacle au théâtre
	 */

	public void ajouterNewSpectacle(Spectacle spectacle) {

		if (spectacle.getNomSpectacle() != null && spectacle.getTypeSpectacle() != null) {
			Spectacle[] tabAccueilSpectacle = new Spectacle[tabSpectacles.length + 1];
			for (int i = 0; i < tabSpectacles.length; i++) {
				tabAccueilSpectacle[i] = tabSpectacles[i]; // Duplication spectacle dans le tabAccueilSpectacle
			}
			tabAccueilSpectacle[tabAccueilSpectacle.length - 1] = spectacle;
			tabSpectacles = tabAccueilSpectacle;
		}
	}

	/*
	 * Méthode getSpectacle qui retourne le spectacle correspondant
	 */
	public void getSpectacle(String nomSpectacle) {
		for (int i = 0; i < tabSpectacles.length; i++) {
			if (nomSpectacle == tabSpectacles[i].getNomSpectacle()) {
				System.out.println(tabSpectacles[i].getNomSpectacle() + " est un spectacle de type "
						+ tabSpectacles[i].typeSpectacle + " au tarif unitaire de "
						+ tabSpectacles[i].getTarifUnitaire() + " € et d'une capacité maximale de "
						+ tabSpectacles[i].getCapaciteMaxSpectacle() + " place(s) et il reste "
						+ (tabSpectacles[i].getCapaciteMaxSpectacle() - tabSpectacles[i].getNombreInscrits()
								+ " place(s) disponible(s)"));
			}
		}
	}

	/*
	 * Méthode inscrire qui ajoute le nombre de clients passés en paramètre au
	 * spectacle
	 */

	public void inscrire(int newInscrits, String nomSpectacle) {

		if (newInscrits > 0 && nomSpectacle != "") {
			for (int i = 0; i < tabSpectacles.length; i++) {
				if (nomSpectacle == tabSpectacles[i].getNomSpectacle()) {
					if (tabSpectacles[i].capaciteMaxSpectacle > (newInscrits + tabSpectacles[i].nombreInscrits)) {
						tabSpectacles[i].nombreInscrits += newInscrits;
					} else {
						System.out.println("Plus de place disponible !");
					}
				}
			}
		}
	}

	
	/*
	 * Méthode getRecetteTotale qui retourne la recette globale de l'établissement
	 */

	public double getRecetteTotale() {
		for (int i = 0; i < tabSpectacles.length; i++) {
			recetteTotale += tabSpectacles[i].nombreInscrits * tabSpectacles[i].tarifUnitaire;
		}
		return recetteTotale;
	}
	
	
	
	/*
	 * Méthode getNbTotalClients qui retourne le nombre total de clients inscrits aux divers spectacles
	 */
	
	public void getNbTotalClients() {
		int nombreTotalClients = 0;
		for (int i =0; i < tabSpectacles.length; i++) {
			nombreTotalClients += tabSpectacles[i].nombreInscrits;
		}
	}
	
	
	/*
	 * @getter Nom
	 */
	public String getNom() {
		return nom;
	}
	
	/*
	 * @setter Nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/*
	 * @getter TabSpectacles
	 */
	public Spectacle[] getTabSpectacles() {
		return tabSpectacles;
	}

	/*
	 * @setter TabSpectacles
	 */
	public void setTabSpectacles(Spectacle[] tabSpectacles) {
		this.tabSpectacles = tabSpectacles;
	}
}

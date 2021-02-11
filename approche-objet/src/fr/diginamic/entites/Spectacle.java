/**
 * 
 */
package fr.diginamic.entites;

/**
 * @author Ness'ti
 *
 */
public class Spectacle {

	public String nomSpectacle;
	public String typeSpectacle;
	public int tarifUnitaire;
	public int capaciteMaxSpectacle;
	public int nombreInscrits;

	/*
	 * Constructeur classe Spectacle
	 */

	public Spectacle(String nomSpectacle, String typeSpectacle, int tarifUnitaire, int capaciteMaxSpectacle,
			int nombreInscrits) {
		super();
		this.nomSpectacle = nomSpectacle;
		this.typeSpectacle = typeSpectacle;
		this.tarifUnitaire = tarifUnitaire;
		this.capaciteMaxSpectacle = capaciteMaxSpectacle;
		this.nombreInscrits = nombreInscrits;

	}

	@Override
	public String toString() {
		return "Spectacle [nomSpectacle=" + nomSpectacle + ", typeSpectacle=" + typeSpectacle + ", tarifUnitaire="
				+ tarifUnitaire + ", capaciteMaxSpectacle=" + capaciteMaxSpectacle + ", nombreInscrits="
				+ nombreInscrits + "]";
	}

	/*
	 * @getter NomSpectacle
	 */
	public String getNomSpectacle() {
		return nomSpectacle;
	}

	/*
	 * @setter NomSpectacle
	 */
	public void setNomSpectacle(String nomSpectacle) {
		this.nomSpectacle = nomSpectacle;
	}

	/*
	 * @getter TypeSpectacle
	 */
	public String getTypeSpectacle() {
		return typeSpectacle;
	}

	/*
	 * @setter TypeSpectacle
	 */
	public void setTypeSpectacle(String typeSpectacle) {
		this.typeSpectacle = typeSpectacle;
	}

	/*
	 * @getter TarifUnitaire
	 */
	public int getTarifUnitaire() {
		return tarifUnitaire;
	}

	/*
	 * @setter TarifUnitaire
	 */
	public void setTarifUnitaire(int tarifUnitaire) {
		this.tarifUnitaire = tarifUnitaire;
	}

	/*
	 * @getter CapaciteMaxSpectacle
	 */
	public int getCapaciteMaxSpectacle() {
		return capaciteMaxSpectacle;
	}

	/*
	 * @setter CapaciteMaxSpectacle
	 */
	public void setCapaciteMaxSpectacle(int capaciteMaxSpectacle) {
		this.capaciteMaxSpectacle = capaciteMaxSpectacle;
	}

	/*
	 * @getter NombreInscrits
	 */
	public int getNombreInscrits() {
		return nombreInscrits;
	}

	/*
	 * @setter NombreInscrits
	 */
	public void setNombreInscrits(int nombreInscrits) {
		this.nombreInscrits = nombreInscrits;
	}
}

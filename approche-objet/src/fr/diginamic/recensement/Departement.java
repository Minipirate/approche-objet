/**
 * 
 */
package fr.diginamic.recensement;


/**
 * @author Ness'ti
 *
 */
public class Departement implements Comparable <Departement> {
	private String codeDepartement;
	private int populationTotale;

	public Departement(String codeDepartement, int populationTotale) {
		super();
		this.codeDepartement = codeDepartement;
		this.populationTotale = populationTotale;
	}

	@Override
	public int compareTo(Departement dep) {

		if (this.populationTotale > dep.populationTotale) {
			return -1;
		} else if (this.populationTotale < dep.populationTotale) {
			return 1;
		} else
			return 0;
	}
	
	
	@Override
	public String toString() {
		return "codeDepartement=" + codeDepartement + ", populationTotale=" + populationTotale;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
}

/**
 * 
 */
package fr.diginamic.recensement;


/**
 * @author Ness'ti
 *
 */
public class Region implements Comparable<Region> {
	private String codeRegion;
	private int populationTotale;

	public Region(String codeRegion, int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.populationTotale = populationTotale;
	}

	@Override
	public int compareTo(Region reg) {
		if (this.populationTotale > reg.populationTotale) {
			return -1;
		} else if (this.populationTotale < reg.populationTotale) {
			return 1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "codeRegion=" + codeRegion + ", populationTotale=" + populationTotale;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

}

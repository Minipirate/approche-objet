package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1),

	ETE("Eté", 2),

	AUTOMNE("Automne", 3),

	HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	/**
	 * Constructeur classe Saison
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/*
	 * Méthode pour récupérer libelle saison
	 */
	public static Saison getByLibelle(String libelle) {
		for (Saison saison : values()) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}

	/**
	 * @getter libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @setter Libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @getter Ordre
	 */
	public int getOrdre() {
		return ordre;
	}

	/**
	 * @setter Ordre
	 */
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
}
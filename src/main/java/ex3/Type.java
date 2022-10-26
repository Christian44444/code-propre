package ex3;
/**
 * Enumération des types d'animaux
 * @author cmich
 *
 */
public enum Type {
	MAMMIFERE("Mammifère"),
	POISSON("Poisson"),
	SERPENT("Serpent");
		
	/**
	 * Nom du type d'animal
	 */
	private String nom;

	private Type(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return le nom du type d'animal
	 */
	public String getNom() {
		return nom;
	}

}

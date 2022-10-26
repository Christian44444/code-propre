package ex3;

/**
 * Enumération des comportements alimentaires
 * @author cmich
 *
 */
public enum Comportement {
	HERBIVORE("Herbivore"),
	CARNIVORE("Carnivore");
	
	private String nom;

	private Comportement(String nom) {
		this.nom = nom;
	}
	/**
	 * @return le nom du comportement alimentaire
	 */
	public String getNom() {
		return nom;
	}
	
	
}

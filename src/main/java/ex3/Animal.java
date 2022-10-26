package ex3;

/**
 * 
 * @author cmich
 *
 */
public class Animal {
	private String nom;
	private Type type;
	private Comportement comportement;
	/**
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, Type type, Comportement comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}
	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	
	
}

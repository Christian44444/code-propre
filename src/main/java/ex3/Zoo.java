package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe zoo permet de constituer un zoo
 * @author cmich
 *
 */
public class Zoo {

	/**
	 * nom nom du zoo
	 */
	private String nom;
	/**
	 * animaux Liste des animaux du zoo
	 */
	private static List<Animal> animaux = new ArrayList<>();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * permet d'ajouter un animal dans le zoo
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/**
	 * affiche la liste des animaux du zoo
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<animaux.size(); i++) {
			System.out.println(animaux.get(i));
		}
	}
	
	
	/**
	 * donne le nombre des animaux présents dans le zoo
	 * @return
	 */
	public int taille() {
		return animaux.size();
	}

	
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

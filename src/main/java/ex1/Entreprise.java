package ex1;

import java.util.Date;

/**
 * Classe d'identification de l'entreprise 
 * @author cmich
 *
 */
public class Entreprise {
	/** siret SIRET  */
	private int siret;
	/** nom dénomination de l'entreprise */
	private String nom;
	/** adresse de l'entreprise */
	private Adresse adresse;
	private Date dateCreation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	
	
	public Entreprise(int siret, String nom, Adresse adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}



	/**
	 * Affiche le SIRET 
	 */
	public void afficherStatut(){
		System.out.println("Entreprise " + nom + " SIRET " + siret);
	}



	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}



	/**
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
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
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}



	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}



	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	
// Avant
//	public int Siret;
//	public String Nom;
//	public String adresse;
//	public Date date_Creation;
//	
//	public static final int capitalMax = 3000000;
	
//	public void Afficher_statut(){
//		
//	}
	
}

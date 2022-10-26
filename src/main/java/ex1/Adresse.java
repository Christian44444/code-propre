package ex1;

/** Classe adresse 
 * @author cmich
 *
 */
public class Adresse {
	/** Ligne 1 */
	private String adr1;
	/** Ligne 2 Optionnelle */
	private String adr2;
	/** Code postal  */
	private String codePostal;
	/** Nom de la ville  */
	private String nomVilleString;
	
	
	public Adresse(String adr1, String adr2, String codePostal, String nomVilleString) {
		super();
		this.adr1 = adr1;
		this.adr2 = adr2;
		this.codePostal = codePostal;
		this.nomVilleString = nomVilleString;
	}


	/**
	 * @return the adr1
	 */
	public String getAdr1() {
		return adr1;
	}


	/**
	 * @param adr1 the adr1 to set
	 */
	public void setAdr1(String adr1) {
		this.adr1 = adr1;
	}


	/**
	 * @return the adr2
	 */
	public String getAdr2() {
		return adr2;
	}


	/**
	 * @param adr2 the adr2 to set
	 */
	public void setAdr2(String adr2) {
		this.adr2 = adr2;
	}


	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}


	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	/**
	 * @return the nomVilleString
	 */
	public String getNomVilleString() {
		return nomVilleString;
	}


	/**
	 * @param nomVilleString the nomVilleString to set
	 */
	public void setNomVilleString(String nomVilleString) {
		this.nomVilleString = nomVilleString;
	}
	
	

}

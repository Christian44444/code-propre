package ex2;

/**
 * Classe générique des types de comptes
 * @author cmich
 *
 */
public abstract class Compte {
	/** solde : solde du compte */
	protected void name() {
		
	} double solde;

	public Compte(double solde) {
		super();
		this.solde = solde;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
}

package ex2;

/**
 * Classe mère des types comptes
 * @author cmich
 *
 */
public class LivretA extends Compte {
	/** tauxRemuneration : taux de rémunération */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	/** Retire un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}
	}
	
	/**
	 * Ajoute la rémunération au solde en fonction du taux
	 */
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}

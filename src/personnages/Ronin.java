package personnages;

public class Ronin extends Humain{
	private int honneur;
	
	public Ronin(String nom, String boissonPr�f�r�e, int argent) {
		super(nom, boissonPr�f�r�e, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int montant = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + montant + " sous.");
		beneficiaire.recevoir(montant);
		perdreArgent(montant);
	}

}

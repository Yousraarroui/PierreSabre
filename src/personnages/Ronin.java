package personnages;

public class Ronin extends Humain{
	private int honneur;
	
	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int montant = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + montant + " sous.");
		beneficiaire.recevoir(montant);
		perdreArgent(montant);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if (force >= adversaire.getReputation()) {
			int argentAdversaire = adversaire.getArgent();
			int argentRonin = getArgent();
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchant!");
			parler("Je t'ai eu petit yakuza!");
			argentRonin = argentRonin +  adversaire.perdre();
			gagnerArgent(argentAdversaire);
			honneur++;
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}
	}

}

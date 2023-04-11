package histoire;

import personnages.Ronin;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai(String nom, String boissonPreferee, int argent, String seigneur) {
		super(nom, boissonPreferee, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoissonPreferee() + ". ");
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ boisson + ".");
	}
}

package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonPr�f�r�e, int argent, String clan) {
		super(nom, boissonPr�f�r�e, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		int argentCommercant = victime.getArgent();
		int argentYakuza = getArgent();
		argentYakuza += victime.seFaireExtorquer();
		reputation ++;
		parler("J'ai piqu� les " +  argentCommercant + " sous de " + victime.getNom() + ", ce qui me fait " + argentYakuza + " sous dans ma poche. Hi ! Hi !");
	}
	
	
	public int getReputation() {
		return reputation;
	}

	public int perdre() {
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai d�shonor� le clan de " + clan + ".");
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation--;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + " ? J'a l'ai d�pouill� de ses " + gain + " sous.");
	}
}

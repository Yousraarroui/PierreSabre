package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoissonPreferee() + ". ");
		parler(getNom() + " : Mon clan est celui de " + clan + ".");
	}
	
	public void extorquer(Commercant victime) {
		int argentCommercant = victime.getArgent();
		int argentYakuza = getArgent();
		argentYakuza += victime.seFaireExtorquer();
		reputation ++;
		parler("J'ai piqué les " +  argentCommercant + " sous de " + victime.getNom() + ", ce qui me fait " + argentYakuza + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int getReputation() {
		return reputation;
	}

	public int perdre() {
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation--;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + " ? J'a l'ai dépouillé de ses " + gain + " sous.");
	}
}

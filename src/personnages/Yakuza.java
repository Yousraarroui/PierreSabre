package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonPréférée, int argent, String clan) {
		super(nom, boissonPréférée, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		int argentCommercant = victime.getArgent();
		int argentYakuza = getArgent();
		argentYakuza += victime.seFaireExtorquer();
		reputation ++;
		parler("J'ai piqué les " +  argentCommercant + " sous de " + victime.getNom() + ", ce qui me fait " + argentYakuza + " sous dans ma poche. Hi ! Hi !");
	}


}

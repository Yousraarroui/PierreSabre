package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boissonPreferee, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		int argentExtorquer = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		perdreArgent(argentExtorquer);
		return argentExtorquer;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
}

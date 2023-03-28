package personnages;

public class Humain {
	private String nom;
	private String boissonPr�f�r�e;
	private int argent;
	
	public Humain(String nom, String boissonPr�f�r�e, int argent) {
		this.nom = nom;
		this.boissonPr�f�r�e = boissonPr�f�r�e;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPr�f�r�e + ". ");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPr�f�r�e + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. " + " Je vais pourvoir m'offrir " + bien + " � " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix + " sous." );
		}
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
		}
	
	protected void parler(String texte) {
		// Elle est priv�e car elle est utilis�e uniquement pour
		// factoris�e du code d'autre m�thode de la m�me classe 
		// o� elle est elle-m�me d�finie
		System.out.println(nom + " : " + texte);
	}
}

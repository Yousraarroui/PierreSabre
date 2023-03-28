package personnages;

public class Humain {
	private String nom;
	private String boissonPréférée;
	private int argent;
	
	public Humain(String nom, String boissonPréférée, int argent) {
		this.nom = nom;
		this.boissonPréférée = boissonPréférée;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPréférée + ". ");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPréférée + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. " + " Je vais pourvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous." );
		}
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
		}
	
	protected void parler(String texte) {
		// Elle est privée car elle est utilisée uniquement pour
		// factorisée du code d'autre méthode de la même classe 
		// où elle est elle-même définie
		System.out.println(nom + " : " + texte);
	}
}

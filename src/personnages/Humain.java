package personnages;

import java.util.ArrayList;
import java.util.List;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int argent;
	private Humain[] connaissances;
	private int nbConnaissances ;
	
	
	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
		this.connaissances = new Humain[30];
		this.nbConnaissances = 0;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoissonPreferee() {
		return boissonPreferee;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPreferee + ". ");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPreferee + " ! GLOUPS !");
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
	
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		argent-=perte;
		}
	
	protected void parler(String texte) {
		// Elle est privée car elle est utilisée uniquement pour
		// factorisée du code d'autre méthode de la même classe 
		// où elle est elle-même définie
		System.out.println(nom + " : " + texte);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissances < connaissances.length) {
			connaissances[nbConnaissances] = humain;
			nbConnaissances++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		this.memoriser(humain);
	}
	
	public void listerConnaissance() {
		System.out.println("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissances ; i++) {
			System.out.println(connaissances[i].nom);
		}
	}
}

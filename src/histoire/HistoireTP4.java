package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		
		
		Humain prof = new Humain("Prof","kombucha",54);
		//prof.direBonjour();
		//prof.acheter("une boisson", 12);
		//prof.boire();
		//prof.acheter("un jeu", 2);
		//prof.acheter("un kimono", 50);
		
		
		Commercant marco = new Commercant("Marco","th�",15);
		//marco.direBonjour();
		//marco.seFaireExtorquer();
		//marco.recevoir(15);
		//marco.boire();
		
		//Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30,"Warsong");
		//yaku.direBonjour();
		//yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par l� ?");
		//yaku.parler(marco.getNom() + ", si tu tiens � la vie donne ta bourse !");
		//yaku.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
		
	}
}

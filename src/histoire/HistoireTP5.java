package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "the", 20);
		Commercant chonin = new Commercant("Chonin", "the", 40);
		Commercant kumi = new Commercant("Kumi", "the", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		//marco.faireConnaissanceAvec(roro);
		//marco.faireConnaissanceAvec(yaku);
		//marco.faireConnaissanceAvec(chonin);
		//marco.faireConnaissanceAvec(kumi);
		//marco.listerConnaissance();
		//roro.listerConnaissance();
		//yaku.listerConnaissance();
		
		//yaku.direBonjour();
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", 80, "saké");
		//akimoto.direBonjour();
		akimoto.boire("the");
	}

}

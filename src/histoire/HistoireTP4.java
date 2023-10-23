package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		
		/*
		 * prof.direBonjour(); prof.acheter("une boisson", 12); prof.boire();
		 * prof.acheter("un jeu", 2); prof.acheter("un kimono", 50);
		 */
		
		Commercant marco = new Commercant("Marco",15);
		
		/*
		 * marco.direBonjour(); marco.seFaireExtorquer(); marco.recevoir(15);
		 * marco.boire();
		 */
		
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",45, "Warsong");
		/*
		 * yakuza.direBonjour(); yakuza.extorquer(marco);
		 */
		
		Ronin ronin = new Ronin("Roro","Schochu",54);
		
		/*
		 * ronin.direBonjour(); ronin.donner(marco);
		 */
		
		ronin.provoquer(yakuza);
		
	}

}

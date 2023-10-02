package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);

	}

}

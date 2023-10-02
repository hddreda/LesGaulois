package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	
    @Override 
    public String toString() { 
	  return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]"; }
	 
    public void boirePotion(int force) {
		this.effetPotion = force;
		this.parler("Merci Druide, je sens que ma force est " + this.effetPotion + " fois décuplée.");
	}
    
    
    public static void main(String[] args) {
		Gaulois g = new Gaulois("Astérix", 8);
		Romain r = new Romain("César", 6);
		
		assert g.prendreParole().equals("Le gaulois " + g.getNom() + " : ");
		
		String text = "test";
		g.parler(text);
		
		g.frapper(r);
    }
    
	
}


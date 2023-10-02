package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);

		assert minus.prendreParole().equals("Le romain " + minus.getNom() + " : ");

		String text = "test";
		minus.parler(text);

		minus.recevoirCoup(8 / 3);
	}
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}

	public int getForce() {
		return force;
	}

}

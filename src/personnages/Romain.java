package personnages;


public class Romain {
	private String nom;
	private int force;
	
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];
	
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);

		assert minus.prendreParole().equals("Le romain " + minus.getNom() + " : ");

		String text = "test";
		minus.parler(text);

		minus.recevoirCoup(8 / 3);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
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

	//

//	public void recevoirCoup(int forceCoup) {
//		assert this.force >= 0;
//		int tmp = this.force;
//		
//		this.force -= forceCoup;
//		
//		if (this.force > 0) { parler("Aie"); }
//		else { parler("J'abandonne..."); }
//		
//		assert this.force < tmp;
//	}

	//
	
	private void forcerAsEquiper(Equipement equipement) {
		System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement);
		this.equipements[this.nbEquipement] = equipement;
		this.nbEquipement++;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (this.nbEquipement) {
		case 2:
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
			break;

		case 1:
			if (equipement == this.equipements[0])
				System.out.println("Le soldat " + this.getNom() + " possède déjà un " + equipement);
			else
				this.forcerAsEquiper(equipement);
			break;

		default:
			this.forcerAsEquiper(equipement);
			break;
		}
	}

	
}

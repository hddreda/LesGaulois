package personnages;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);

		// Gaulois gaulois = village.trouverHabitant(30);
		// Le villageois demandé n'existe pas. Le numéro maximum est 29 pour un village de 30 gaulois.
		
		Chef chef = new Chef("Abraracourcix", 6, village);
		village.setChef(chef);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// Le message affiché correspond au retour de la méthode toString de la classe Gaulois.
	}
	
	//	
	
	private String nom;
	private Chef chef;
	
	private int nbVillageois;
	private Gaulois[] villageois;
	
	//	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	//
	
	public String getNom() { return nom; }
	
	//
	
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//
	
	public void ajouterHabitant(Gaulois gaulois) {
		if(this.nbVillageois < this.villageois.length) {
			this.villageois[this.nbVillageois] =  gaulois;
			this.nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
//		if(numVillageois >= 0 && numVillageois < this.nbVillageois)
		return this.villageois[numVillageois];
	}
	
	// 
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef.getNom() + "vivent les légendaires gaulois :");
		for(int i = 0; i < this.nbVillageois; ++i) {
			Gaulois g = this.villageois[i];
			System.out.println(" - " + g.getNom());
		}
	}
}

package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	private int force = 2 * honneur;
	
	//
	
	public Ronin(String nom, String boisson, int argent) {
		this(nom, boisson, argent, 1);
	}
	
	public Ronin(String nom, String boisson, int argent, int force) {
		super(nom, boisson, argent);
		this.force = force;
	}

	//	

	public int getHonneur() { return this.honneur; }
	
	//	
	
	public void donner(Commercant beneficiaire) {
		int don = this.getArgent() / 10;
		this.parler(beneficiaire.getNom() + ", prends ces " + don + " sous.");
		this.perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	
	//
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if(this.force >= adversaire.getReputation()) {
			this.honneur++;
			int argent = adversaire.getArgent();
			this.gagnerArgent(argent);
			this.parler("Je t’ai eu petit yakusa !");
			adversaire.perdre();
		}
		else {
			int argent = this.getArgent();
			
			adversaire.gagner(argent);
			
			this.honneur--;
			this.perdreArgent(argent);
			
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}
}

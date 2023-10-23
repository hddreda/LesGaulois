package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		this(nom, boisson, argent, clan, 0);
	}
	
	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public String getClan() { return this.clan; }
	
	public int getReputation() { return this.reputation; }
	
	//
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		this.gagnerArgent(argentExtorque);
		this.parler("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	
	
}

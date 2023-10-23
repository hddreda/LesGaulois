package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}


	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	protected void parler(String texte) {
//		System.out.println("Humain " + this.getNom() + " parle : � " + texte + " �");
		System.out.println("(" + this.getNom() + ") - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.boisson + ".");
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int perdre) {
		this.argent -= perdre;
	}
	
	public void acheter(String bien, int prix) {
		if(this.getArgent() >= prix) {
			this.parler("J'ai " + this.getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			this.perdreArgent(prix);}
		else
			this.parler("Je n'ai que " + this.getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
	
	}
	
	
	
	
	
}
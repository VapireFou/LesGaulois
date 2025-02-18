package gaulois;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int force, Chaudron chaudron) {
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole( ) {
		return "Le Druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
			String nomGaulois = gaulois.getNom();
			
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté" + quantite + "doses de potion magique. Elle a une force de" + forcePotion + ".");
		
	}
}

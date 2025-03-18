package gaulois;

import java.util.Iterator;

public class Village {
	

	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;
	
	public Village(String nom, int villageois, Gaulois chef) {

		this.nom = nom;
		this.nbVillageois = 0;
		this.villageois = new Gaulois[villageois];
		this.chef = chef;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageoirs(Gaulois gaulois){
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
		gaulois.setVillage(this);
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans le village " +'"'+ village.getNom() +'"' + "du chef " + village.getChef() + " vivent les légendaires gaulois : ");
		for (int i = 1; i <= nbVillageois; i++) {
			Gaulois gaulois = trouverVillageois(i);
			System.out.println("- " + gaulois.getNom() );
			
		}
	}
	
	
	public Gaulois[] getVillageois() {
		return villageois;
	}


	public Gaulois trouverVillageois(int numeroVilageois) {
		if (numeroVilageois - 1  >= nbVillageois) {
			System.out.println("Il n'y a pas autant d'habitant dans notre village !");
			return null;
		}
		return villageois[numeroVilageois-1];
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des Irréductible",30,abraracourcix);
		village.ajouterVillageoirs(abraracourcix);
		
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterVillageoirs(asterix);
		
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterVillageoirs(obelix);
		
		Gaulois doublePolemix = new Gaulois("Doublepolémix",4);
		
		abraracourcix.sePresenter();
		
		
		
	}
}


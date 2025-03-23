package gaulois;

import objets.Equipement;

public class Gaulois {
	private String nom;
	//private int force;	
	private int effetPotion = 1;
	private Village village; 
	private int force; 
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}


	public String getNom() {
		return nom;
	}
	
	
	public Village getVillage() {
		return village;
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole( ) {
		return "Le gaulois " + nom + " : ";
	}

	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		if (effetPotion > 1) {
//			romain.recevoirCoup((force*effetPotion) / 3);
//			effetPotion -= 1; 
//		} else {
//			romain.recevoirCoup(force / 3);
//
//		}
//		
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
		romain.getNom());
		Equipement[] listeTrophee = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; listeTrophee != null && i < listeTrophee.length; i++,
		nbTrophees++) {
		this.trophees[nbTrophees] = listeTrophee[i];
		}
		
		}

	
	@Override
	public String toString() {
		return  nom ;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
	}


	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		if (this.getVillage() == null) {
			System.out.println("Le Gaulois " + this.getNom() + ": Bonjour, je m'appelle " + this.getNom() + "." + "Je voyage de villages en villages. ");
		}
			
		 else {
			 Village village = this.getVillage();
			 Gaulois chef = village.getChef();
			 if (this.getNom() == chef.getNom()) {
				System.out.println("Le Gaulois " + this.getNom() + ": Bonjour, je m'appelle " + this.getNom() + "." + "Je suis le chef du village " + '"' + village.getNom());
			} else {
				System.out.println("Le Gaulois " + this.getNom() + ": Bonjour, je m'appelle " + this.getNom() + ". " + "J'habite dans le village " + village.getNom());
			}
		 }

		
	}

}


		
	




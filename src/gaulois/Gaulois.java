package gaulois;

public class Gaulois {
	private String nom;
	private int force;	
	private int effetPotion = 1;
	private Village village; 
	
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


	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole( ) {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de" + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	@Override
	public String toString() {
		return  nom ;
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
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


		
	




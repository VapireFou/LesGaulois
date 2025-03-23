package objets;

public enum Equipement {
	CASQUE("casque",5),BOUCLIER("bouclier",5);
	
	private String nom;
	private int durabilite;
	
	private Equipement(String nom, int durabilite) {
		this.nom = nom;
		this.durabilite = durabilite;
	}
	
	private void toString(Equipement equipement ) {
	System.out.println(equipement.nom);

	}
}

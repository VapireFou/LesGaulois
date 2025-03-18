package gaulois;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup >= 0;
		int forcedebut = force;
				
		force = force - forceCoup;
		if (force  < 1) {
			parler("J'abandonne !");
		}
		else {
			parler("Aie !");
		
		}
		assert this.isInvariantVerified();
		assert forcedebut < force;
		
	}

	private Boolean isInvariantVerified() {
		return this.force >= 0;
	}
	
	
	private String prendreParole( ) {
		return "Le romain " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
		
		minus.isInvariantVerified();
		
	}
}

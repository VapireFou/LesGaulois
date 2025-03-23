package gaulois;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement = 0;
	private Equipement[] equipement = new Equipement[2];
	private String texte;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.isInvariantVerified();
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		
		case 0 :
 			this.equipement[0] = equipement;
			this.nbEquipement += 1;
			System.out.println("Le soldat " + this.nom + " s'équipe avec un " + equipement);
			break;
			
		case 1 :
			if (equipement == this.equipement[0]) {
				System.out.println("Le soldat " + this.nom + " possède déjà un " + equipement);
				
			} else {
				this.equipement[1] = equipement;
				this.nbEquipement += 1;
				System.out.println("Le soldat " + this.nom + " s'équipe avec un " + equipement);
				
			}
			break;
		
		case 2 :
			System.out.println("Le soldat " + this.nom + " est déjà bien protégé !");
			break;
		
		}
		
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

//	public void recevoirCoup(int forceCoup) {
//		assert forceCoup >= 0;
//		int forcedebut = force;
//				
//		force = force - forceCoup;
//		if (force  < 1) {
//			parler("J'abandonne !");
//		}
//		else {
//			parler("Aie !");
//		
//		}
//		assert this.isInvariantVerified();
//		assert forcedebut < force;
//		
//	}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
			forceCoup = calculResistanceEquipement(forceCoup);
			force -= forceCoup;
			
		switch (force) {
			case 0:
				parler("Aïe");
				break;
			default:
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
				break;
			}
		return equipementEjecte;
		}
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
				int resistanceEquipement = 0;
			if (nbEquipement != 0) {
				texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
						for (int i = 0; i < nbEquipement;i++) {
							if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
								resistanceEquipement += 8;
							} else {
								System.out.println("Equipement casque");
								resistanceEquipement += 5;
							}
							
						}
				texte += resistanceEquipement + "!";
			}
			parler(texte);
			forceCoup -= resistanceEquipement;
			return forceCoup;
			}
	
			private Equipement[] ejecterEquipement() {
				Equipement[] equipementEjecte = new Equipement[nbEquipement];
				System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
						int nbEquipementEjecte = 0;
				for (int i = 0; i < nbEquipement; i++) {
					if (!(equipement[i] == null)) {
						equipementEjecte[nbEquipementEjecte] = equipement[i];
						nbEquipementEjecte++;
						equipement[i] = null;
					}
				}
				return equipementEjecte;
			}

	private Boolean isInvariantVerified() {
		return this.force >= 0;
	}
	
	
	private String prendreParole( ) {
		return "Le romain " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		
		minus.isInvariantVerified();
		
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}
}

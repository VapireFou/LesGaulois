package test_fonctionnel;

import gaulois.Gaulois;
import gaulois.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt" + asterix.getNom() + "et " + obelix.getNom() + "tombe nez à nez sue le romain" + minus.getNom() + ".");
		
		for(int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			
		}
		
		
	}
}

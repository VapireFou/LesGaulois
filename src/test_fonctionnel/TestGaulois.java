package test_fonctionnel;

import gaulois.Chaudron;
import gaulois.Druide;
import gaulois.Gaulois;
import gaulois.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		
		Chaudron chaudron = new Chaudron(0, 0);
		Druide panoramix = new Druide("Panoramix", 2, chaudron);
		
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		
		for(int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
			
		}
		
		
	}
} 

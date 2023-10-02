package testsFonctionnels;
import java.util.*;
import cartes.*;
import jeu.*;


public class TestTp1 {
	public static void main(String[] args) {
		System.out.println("yo");
		Sabot sabot = new Sabot(110);
		sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT), new Parade(Type.ACCIDENT, 3), new Botte(1, Type.ACCIDENT));
		sabot.ajouterCarte(new Botte(1, Type.ACCIDENT));
		for (Iterator<Carte> it = sabot.iterator(); it.hasNext();) {
			System.out.println(sabot.piocher());			
		}
		
		sabot.ajouterCarte(new Attaque(3, Type.ACCIDENT));
		Iterator<Carte> it = sabot.iterator();
		System.out.println(it.next());
		it.remove();

		Parade test1 = new Parade(Type.ACCIDENT, 3);
		Parade test2 = new Parade(Type.ACCIDENT, 3);
		Attaque test3 = new Attaque(3, Type.ACCIDENT);
		Borne test4 = new Borne(10,25);
		Borne test5 = new Borne(10, 50);
		Borne test6 = new Borne(10, 50);

		System.out.println(test1.equals(test4));
		System.out.println(test4.equals(test5));
		System.out.println(test5.equals(test6));
		System.out.println(test1.equals(test2));
		System.out.println(test3.equals(test1));

	}
}

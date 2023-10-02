package jeu;
import java.util.*;

import cartes.Carte;


public class Sabot implements Iterable <Carte> {
	
	private Carte[] cartes;
	private int nbCartes=0;
	private int nbOp=0;
	private int capacite;


	public Sabot(int capacite) {
		this.capacite=capacite;
		this.cartes = new Carte[capacite];
	}
	public boolean isEmpty() {
		return nbCartes==0;
	}		
	
	public void ajouterCarte(Carte carte){
		int cpt = 0;
		if (nbCartes >= cartes.length){
			throw new IndexOutOfBoundsException();
		}
		else {
/*			for (Iterator<Carte> it = iterator(); it.hasNext();) {
				if (((Carte) it).equals(carte)) {
					cpt+=1;
				}
			}
			if (cpt>=carte.getNombre()) {
				throw new IndexOutOfBoundsException();
			}
		
*/						
			cartes[nbCartes]=carte;
			nbCartes++;
		}
	}
		

	public void ajouterFamilleCarte(Carte carte) {
		for (int i=0;i<carte.getNombre();i++) {
			ajouterCarte(carte);
		}
	}
	
	
	public void ajouterFamilleCarte (Carte... carte) {
		for (int i=0;i<carte.length;i++) {
			ajouterFamilleCarte(carte[i]);
		}
	}

	
	private class Iterateur implements Iterator <Carte>{
		private int indIter=0;
		private boolean nextEffectue = false;
		private int nbOpRef=nbOp;
		
		private void verifConcu() {
			if (nbOp!=nbOpRef) {
				throw new ConcurrentModificationException(); 
			}
		}

		public boolean hasNext() {
			return indIter<nbCartes;
		}


		public Carte next() {
			verifConcu();
			if (hasNext()) {
				Carte cartePointe=cartes[indIter];
				indIter++;
				nextEffectue = true;
				return cartePointe;
			}else {
				throw new NoSuchElementException();
			}
		
		}
		
		public void remove() {
			verifConcu();
			if (nbCartes<=0 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i=indIter-1;i<nbCartes-1;i++) {
				cartes[i]=cartes[i+1];
			}
			nextEffectue = false;
			indIter--;
			nbCartes--;
		}

	}

	
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	
	
	public Carte piocher() {
		Iterator<Carte> iterateur=iterator();
		System.out.print("je pioche ");
		Carte pioche=iterateur.next();
		iterateur.remove();
		return pioche;
	}
}

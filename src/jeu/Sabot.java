package jeu;
import java.util.Iterator;

import cartes.Carte;

public class Sabot<E extends Carte> implements Iterator<E> {
	
	private int capacite=110;
	private E[] cartes;
	private int nbCartes=0;
	
	public Sabot(E[] cartes) {
		this.cartes = cartes;
	}
		
	private void ajouterCarte(E carte){ 
	// ajouter carte au tableau cartes
		
	}

	private void ajouterFamilleCarte(E cartes) {
		
	}
	
	private void ajouterFamilleCarte(E[] cartes) {
		
	}

	
	public boolean isEmpty() {
		if ()) {
			return true;
		}
		return false;	
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public E next() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}



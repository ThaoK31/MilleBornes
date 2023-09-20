package cartes;

public abstract class Probleme extends Carte {
	private Type type; 
	
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}

	public Type getType() {
		return type;
	}
	

}

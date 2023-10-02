package cartes;

import java.util.Objects;

public abstract class Probleme extends Carte {
	private Type type; 
	
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Probleme other = (Probleme) obj;
		return type == other.type;
	}
	

}

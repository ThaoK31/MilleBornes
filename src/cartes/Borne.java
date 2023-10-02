package cartes;


public class Borne extends Carte {
	private int km;
	
	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}

	public int getKm() {
		return km;
	}

	@Override
	public String toString() {
		return "Borne [km=" + km + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borne other = (Borne) obj;
		return km == other.km;
	}


}

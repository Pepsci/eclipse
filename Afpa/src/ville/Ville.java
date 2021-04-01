package ville;

public class Ville {
	private String nom = "Paris";
	private int departement;
	
	
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ville(String nom, int departement) {
		super();
		this.setNom(nom);
		this.setDepartement(departement);
	}

	@Override
	public String toString() {
		return "La ville de " + getNom() + " est dans le département du " + getDepartement() +"";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}
	
	

	
	
	
	
	
}

package metiers;

abstract class Personne {
	
	private String nom;

	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	abstract void affiche();
}

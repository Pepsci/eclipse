package serie_exercice_1;

public class Enseignant {

	private String nom;
	private String prenom;
	private String email;
	private Specialite specialites;
	

	public Enseignant(String nom, String prenom, String email, Specialite specialites) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.specialites = specialites;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Specialite getSpecialites() {
		return specialites;
	}

	public void setSpecialites(Specialite specialites) {
		this.specialites = specialites;
	}
	
	@Override
	public String toString() {
		return "L'enseignant " + nom +" "+ prenom + " donne des cours de " + specialites ;
	
	}	
}

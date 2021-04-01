package POO;

public class Personne {
	
	//les attributs / propriété
	private String nom;    //possibilité de donner valeur par défaut  nom = "";
	private String prenom;
	private String email;
	
	
	// constructeur sans parametre (SuperClass)
	
	public Personne() {
		super();
	}

	// constructeur avec parametre (field)
	public Personne(String nom, String prenom, String email) {
		super();
		this.setNom(nom);
		this.prenom = prenom;
		this.email = email;
		
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

	@Override
	public String toString() {
		return "Personne [nom=" + getNom() + ", prenom=" + prenom + ", email=" + email + "]";
	}

	public Personne(String nom, String prenom) {
		super();
		this.setNom(nom);
		this.prenom = prenom;
	}

	//get  = getter = les accesseurs
	public String getNom() {
		return nom;
	}
	
	//set = setter = les mutateurs
	public void setNom(String nouveau_nom) {
		this.nom = nouveau_nom;
	}

	
	


	
	
	
	
	
	
	
	
	
	/*//constructeur avec parametres
	
	public Personne(String nom, String prenom, String email, int age) {
		super();
		this.nom = nom;
		this.setPrenom(prenom);
		this.email = email;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return " nom "+nom+" prenom "+getPrenom()+ " email "+ email;
	}

		//get  = getter = les accesseurs
	public String getPrenom() {
		return prenom;
	}
		//set = setter = les mutateurs
	public void setPrenom(String prenom_test) {
		this.prenom = prenom_test; 
	}
*/
	
}

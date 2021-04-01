package DAO;

public class Client {
	private int id=1;
	private String nom;
	private String prenom;
	
	public Client(String nom, String prenom) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
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
}

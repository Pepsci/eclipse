package metiers;

public class Menuisier extends Personne {
	
	
	public Menuisier(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void affiche() {
		System.out.println(this.getClass().getSimpleName()+" "+ this.getNom());
	}
	
}

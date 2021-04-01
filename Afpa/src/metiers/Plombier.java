package metiers;

public class Plombier extends Personne {
	
	
	public Plombier(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public void affiche() {
		System.out.println(this.getClass().getSimpleName()+" "+ this.getNom());
	}
}

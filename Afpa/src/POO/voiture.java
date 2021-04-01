package POO;

public class voiture {
	public static String marque;

	public voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "voiture [marques=" + marque + "]";
	}

	public voiture(String marques) {
		super();
		this.marque = marques;
	}
	
	public void afficher() {
		System.out.println("j'affiche la marque"+ marque);
	}

	public void setmarque(String string) {
		// TODO Auto-generated method stub
		
	}
}

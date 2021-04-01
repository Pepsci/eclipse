package ville;


public class main {

	public static void main(String[] args) {

		Ville ville1 = new Ville();
		Ville paris = new Ville("Paris",75);
		Ville avignon = new Ville("Avignon",84);
		Ville marseille = new Ville("Marseille",13);
		Ville caen = new Ville("Caen",14);
		
		System.out.println(ville1);
		System.out.println(ville1.getNom());
		ville1.setNom("Lyon");
		System.out.println(paris.getNom());
		System.out.println(paris.getDepartement());
		
		System.out.println(avignon);
		System.out.println(marseille);
		System.out.println(caen);
		paris.setNom("Lyon");
		paris.setDepartement(69);
		System.out.println(paris);
		System.out.println(ville1);
		
		
		
	}
}

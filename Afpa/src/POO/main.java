package POO;

public class main {

	public static void main(String[] args) {
		
		//instancier mon objet
		
		Personne p1 = new Personne();
		Personne p2 = new Personne("Filippi","Joss","azd@azd.azd");
		Personne p3 = new Personne("Fildddi","Joss","azd@azd.azd");
		Personne p4 = new Personne("Fiazdli","Jazdoss","azd@azd.azd");
		Personne p5 = new Personne("Fixxazsxli","Joazdss","azd@azd.azd");
		Personne p6 = new Personne("Fixxazsxli","Joazdss");
		
		System.out.println(p1);
		System.out.println(p2.getNom());
		p2.setPrenom("Josse");
		System.out.println(p2.getPrenom());
		p2.setEmail("jossfilippi@gmail.com");
		
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);


	}

}

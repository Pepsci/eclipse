package polymorphisme;

public class Main {

	public static void main(String[] args) {
		
		Polo p = new Polo();
		
		Porche pr = new Porche();
		
		System.out.println(p);
		System.out.println(pr);
		System.out.println("----------------------------");
		
		Voiture polo2 = new Polo();
		Voiture porche2 = new Porche();
		
		System.out.println(polo2);
		System.out.println(porche2);
	}

}

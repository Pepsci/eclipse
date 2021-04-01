package correction_exo_vehicule;

public class Main {

	public static void main(String[] args) {
		
		Voiture c3 = new Voiture();
		
		//Moto BMW = new Moto("BMW", 50, 30, 0, 0);
		Moto bmw = new Moto();
		
		bmw.setRoues(2);
		bmw.setContenanceMax(50);
		bmw.setContenu(30);
		bmw.setTypeCarburant("Diesel");
		
		
		System.out.println(bmw);
		
		Pompe pompe1 = new Pompe("essence", 5000, 2000);
		Pompe pompe2 = new Pompe("diessel", 10000, 7000);

		
	}

}

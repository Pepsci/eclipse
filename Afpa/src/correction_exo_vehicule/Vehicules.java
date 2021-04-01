package correction_exo_vehicule;

public class Vehicules {
	
	private String typeCarburant;
	private int contenanceMax;
	private int contenu;
	private int vitesseMax;
	private int roues;
	
	public int getRoues() {
		return roues;
	}
	public void setRoues(int roues) {
		this.roues = roues;
	}
	public String getTypeCarburant() {
		return typeCarburant;
	}
	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}
	public int getContenanceMax() {
		return contenanceMax;
	}
	public void setContenanceMax(int contenanceMax) {
		this.contenanceMax = contenanceMax;
	}
	public int getContenu() {
		return contenu;
	}
	public void setContenu(int contenu) {
		this.contenu = contenu;
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
	@Override
	public String toString() {
		return "Vehicules [typeCarburant=" + typeCarburant + ", contenanceMax=" + contenanceMax + ", contenu=" + contenu
				+ ", vitesseMax=" + vitesseMax + ", roues=" + roues + "]";
	}

	public void faireLePlein(Pompe pompe) {
		System.out.println("jarrive a la pompe");
		
		if(this.typeCarburant != pompe.getTypeCarburant()) {
			System.out.println("je vais changer de pompe");
	}
		
		int besoin = this.getContenanceMax() - this.getContenu();
		System.out.println("j'ai besoin de "+besoin);
		
		if(besoin > pompe.getContenu()) {
			besoin = pompe.getContenu();
		}
		System.out.println("faire le plain en ajoutant en ajoutant au contenu ce dont j'ai besoin pour remplir");
		this.contenanceMax += besoin;
		
		int nouveaConenuPompe = pompe.getContenu() - besoin;
		pompe.setContenu(nouveaConenuPompe);
	}
}






















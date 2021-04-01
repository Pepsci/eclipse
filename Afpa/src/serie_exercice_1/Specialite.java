package serie_exercice_1;

public class Specialite {

	
	private int Id;
	private String specialite;
	
	
	public Specialite(int id, String specialite) {
		super();
		Id = id;
		this.specialite = specialite;
	}


	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	@Override
	public String toString() {
		return "La specialite " + specialite + "est enseignée par ";
	}
	
	
	
	
	
	
}

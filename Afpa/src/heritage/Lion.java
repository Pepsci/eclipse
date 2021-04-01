package heritage;

public class Lion extends Animal{
	
	public String identifier() {
		
		return super.identifier() + "Je suis le Lion";
	}
	
	public String crier() {
		return "Rugi";
	}
	
}

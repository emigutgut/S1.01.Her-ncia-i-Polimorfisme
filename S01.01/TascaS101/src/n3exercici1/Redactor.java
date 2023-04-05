package n3exercici1;

public class Redactor {
	
	private String nom;
	private final String dni;
	private static final double SOU = 1500;
	
	public Redactor(String nomRedactor, String dniRedactor) {
		
		nom = nomRedactor;
		dni = dniRedactor;
		
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getDni() {
		return dni;
	}
	
	public double getSou() {
		return SOU;
	}
	
	public void setNom(String nouNom) {
		nom = nouNom;
	}
	
}

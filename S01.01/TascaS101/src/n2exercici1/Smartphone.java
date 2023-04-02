package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{
	
	public void fotografiar() {
		System.out.println("Se està fent una foto.");
	}
	
	public void alarma() {
		System.out.println("Està sonant la alarma.");
	}
}

package n2exercici1;

public class Telefon {
	
	private String marca;
	private String model;
	
	public Telefon() {
		marca = "";
		model = "";
	}
	
	public void trucar(String telefon) {
		System.out.println("Se esta trucant al número " + telefon);
	}
}

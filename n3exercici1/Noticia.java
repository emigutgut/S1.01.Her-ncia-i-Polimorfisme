package n3exercici1;

public class Noticia {
	
	String titular;
	String text = "";
	int puntuacio;
	int preu;
	Redactor redactor;
	
	public String getTitular() {
		return this.titular;
	}
	
	public Redactor getRedactor() {
		return this.redactor;
	}
	
	int calcularPuntuacioNoticia(){
		return puntuacio;
	}
	
	int calcularPreuNoticia() {
		return preu;
	}
	
	public String getNomRedactor() {
		return redactor.getNom();
	}
	
}

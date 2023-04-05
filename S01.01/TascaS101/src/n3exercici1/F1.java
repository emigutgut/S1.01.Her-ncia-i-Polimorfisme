package n3exercici1;

public class F1 extends Noticia {

	private String escuderia;
	
	public F1(String titular, Redactor redactor, String escuderia) {
		this.titular = titular;
		this.redactor = redactor;
		this.escuderia = escuderia;
	}
	
	@Override
	int calcularPreuNoticia() {
		
		preu = 100;
		
		if(escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
			preu += 50;
		}
		
		return preu;
		
	}
	
	@Override
	int calcularPuntuacioNoticia() {
		
		puntuacio = 4;
		
		if(escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
			puntuacio += 2;
		}
		
		return puntuacio;
		
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public Redactor getRedactor() {
		return this.redactor;
	}
	
	public String getNomRedactor() {
		return redactor.getNom();
	}

}

package n3exercici1;

public class Tenis extends Noticia {

	private String competicio;
	private String tenista;
	
	public Tenis(String titular, Redactor redactor, String competicio, String tenista) {
		this.titular = titular;
		this.redactor = redactor;
		this.competicio = competicio;
		this.tenista = tenista;
	}
	
	@Override
	int calcularPreuNoticia() {
		
		preu = 150;
		
		if(tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic")) {
			
			preu += 100;
			
		}
		
		return preu;
		
	}
	
	@Override
	int calcularPuntuacioNoticia() {
		
		puntuacio = 4;
		
		if(tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic")) {
			puntuacio += 3;
		}
		
		return puntuacio;
		
	}
	
}

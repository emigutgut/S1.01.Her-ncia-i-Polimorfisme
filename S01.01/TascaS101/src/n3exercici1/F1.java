package n3exercici1;

public class F1 extends Noticia {

	private String escuderia;
	
	public F1(String titular, Redactor redactor, String escuderia) {
		this.titular = titular;
		this.redactor = redactor;
		this.escuderia = escuderia;
	}
	
	int calcularPreuNoticia() {
		
		preu = 100;
		
		if(escuderia == "Ferrari" || escuderia == "Mercedes") {
			preu += 50;
		}
		
		return preu;
		
	}
	
int calcularPuntuacioNoticia() {
		
		puntuacio = 4;
		
		if(escuderia == "Ferrari" || escuderia == "Mercedes") {
			puntuacio += 2;
		}
		
		return puntuacio;
		
	}

}

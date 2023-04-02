package n3exercici1;

public class Motociclisme extends Noticia {

	private String equip;
	
	public Motociclisme(String titular, Redactor redactor, String equip) {
		this.titular = titular;
		this.text = text;
		this.redactor = redactor;
		this.equip = equip;
	}
	
	int calcularPreuNoticia() {
		
		preu = 100;
		
		if(equip == "Honda" || equip == "Yamaha") {
			preu += 50;
		}
		
		return preu;
		
	}
	
int calcularPuntuacioNoticia() {
		
		puntuacio = 3;
		
		if(equip == "Honda" || equip == "Yamaha") {
			puntuacio += 3;
		}
		
		return puntuacio;
	}

}

package n3exercici1;

public class Motociclisme extends Noticia {

	private String equip;
	
	public Motociclisme(String titular, Redactor redactor, String equip) {
		this.titular = titular;
		this.redactor = redactor;
		this.equip = equip;
	}
	
	@Override
	int calcularPreuNoticia() {
		
		preu = 100;
		
		if(equip.equals("Honda") || equip.equals("Yamaha")) {
			preu += 50;
		}
		
		return preu;
		
	}
	
	@Override
	int calcularPuntuacioNoticia() {
		
		puntuacio = 3;
		
		if(equip.equals("Honda") || equip.equals("Yamaha")) {
			puntuacio += 3;
		}
		
		return puntuacio;
	}

}

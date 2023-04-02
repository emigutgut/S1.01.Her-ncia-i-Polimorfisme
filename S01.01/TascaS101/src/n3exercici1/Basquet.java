package n3exercici1;

public class Basquet extends Noticia{

	private String competicio;
	private String club;
	
	public Basquet(String titular, Redactor redactor, String competicio, String club) {
		this.titular = titular;
		this.redactor = redactor;
		this.competicio = competicio;
		this.club = club;
	}
	
	int calcularPreuNoticia() {
		
		preu = 250;
		
		if(competicio == "Eurolliga") {
			preu += 75;
		}
		
		if(club == "Barça" || club == "Madrid") {
			preu += 75;
		}
		
		return preu;
		
	}
	
	int calcularPuntuacioNoticia() {
		
		puntuacio = 4;
		
		if(competicio == "Eurolliga") {
			puntuacio += 3;
		}else if(competicio == "ACB") {
			puntuacio += 2;
		}
		
		if(club == "Barça" || club == "Madrid") {
			puntuacio += 1;
		}
		
		return puntuacio;
	}

}

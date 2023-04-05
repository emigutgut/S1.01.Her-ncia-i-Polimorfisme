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
	
	@Override
	int calcularPreuNoticia() {
		
		preu = 250;
		
		if(competicio.equals("Eurolliga")) {
			preu += 75;
		}
		
		if(club.equals("Barça") || club.equals("Madrid")) {
			preu += 75;
		}
		
		return preu;
		
	}
	
	@Override
	int calcularPuntuacioNoticia() {
		
		puntuacio = 4;
		
		if(competicio.equals("Eurolliga")) {
			puntuacio += 3;
		}else if(competicio.equals("ACB")) {
			puntuacio += 2;
		}
		
		if(club.equals("Barça") || club.equals("Madrid")) {
			puntuacio += 1;
		}
		
		return puntuacio;
	}

}

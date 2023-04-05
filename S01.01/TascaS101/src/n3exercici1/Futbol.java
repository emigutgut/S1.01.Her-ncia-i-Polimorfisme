package n3exercici1;

public class Futbol extends Noticia {
	
	String competicio;
	String club;
	String jugador;
	
	public Futbol(String titular, Redactor redactor, String competicio, String club, String jugador) {
		
		this.titular = titular;
		this.redactor = redactor;
		this.competicio = competicio;
		this.club = club;		
		this.jugador = jugador;
	}
	
	@Override
	int calcularPreuNoticia(){
		
		preu = 300;
		
		if(competicio.equals("Lliga de Campions")) {
			preu += 100;
		}
		
		if(club.equals("Barça") || club.equals("Madrid")) {
			preu += 100;
		}
		
		if(jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
			preu += 50;
		}
		
		return preu;
		
	}
	
	@Override
	int calcularPuntuacioNoticia() {
		
		puntuacio = 5;
		
		if(competicio.equals("Lliga de Campions")) {
			puntuacio += 3;
		}else if(competicio.equals("Lliga")) {
			puntuacio += 2;
		}
		
		if(club.equals("Barça") || club.equals("Madrid")) {
			puntuacio += 1;
		}
		
		if(jugador.equals("FerranTorres") || jugador.equals("Benzema")){
			puntuacio += 1;
		}
		
		return puntuacio;
	}
	
	
}

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
	
	int calcularPreuNoticia(){
		
		preu = 300;
		
		if(competicio == "Lliga de Campions") {
			preu += 100;
		}
		
		if(club == "Barça" || club == "Madrid") {
			preu += 100;
		}
		
		if(jugador == "Ferran Torres" || jugador == "Benzema") {
			preu += 50;
		}
		
		return preu;
		
	}
	
	int calcularPuntuacioNoticia() {
		
		puntuacio = 5;
		
		if(competicio == "Lliga de campions") {
			puntuacio += 3;
		}else if(competicio == "Liga") {
			puntuacio += 2;
		}
		
		if(club == "Barça" || club == "Madrid") {
			puntuacio += 1;
		}
		
		if(jugador == "FerranTorres" || jugador == "Benzema"){
			puntuacio += 1;
		}
		
		return puntuacio;
	}
	
	
}

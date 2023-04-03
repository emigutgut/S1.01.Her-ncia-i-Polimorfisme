package n3exercici1;
import java.util.Scanner;

public class Principal {
	
	private final static Scanner DADES = new Scanner(System.in);
	private static Redactor[] redactors = new Redactor[50];
	private static int contadorRedactors = 0; //primera posició buida del array de redactors
	private static Noticia[] noticies = new Noticia[50];
	private static int contadorNoticies = 0;
	private static int preuNoticia;
	private static int puntuacioNoticia;
	
	public static void main(String[] args) {
		
		menu();
		
	}
	
	public static void menu(){
		
		int opcio = 0;
		
		System.out.println("Selecciona una de las siguientes opciones:");
		System.out.println("1.-Introduir redactor.");
		System.out.println("2.-Eliminar redactor.");
		System.out.println("3.-Introduir notícia a un redactor.");
		System.out.println("4.-Eliminar notícia (ha de demanar redactor i titular de la notícia).");
		System.out.println("5.-Mostrar totes les notícies per redactor.");
		System.out.println("6.-Calcular puntuació de la notícia.");
		System.out.println("7.-Calcular preu notícia.");
		opcio = DADES.nextInt();
		
		
		switch(opcio) {
			
			case 1:
				redactors[contadorRedactors] = introduirRedactor();
				contadorRedactors += 1;
				System.out.println(contadorRedactors);
				
				menu();
				break;
			case 2:
				mostrarRedactor();
				redactors = eliminarRedactor();
				menu();
				break;
			case 3:
				noticies[contadorNoticies] = introduirNoticia();
				contadorNoticies +=1;
				menu();
				break;
			case 4:
				noticies = eliminarNoticia();
				menu();
				break;
			case 5:
				mostrarNoticies();
				menu();
				break;
			case 6:
				puntuacioNoticia = calcularPuntuacio();
				System.out.println("La puntuació de la noticia es de " + puntuacioNoticia + " puntos.");
				menu();
				break;
			case 7:
				preuNoticia = calcularPreu();
				System.out.println("El preu de la noticia es " + preuNoticia + "€.");
				menu();
				break;
		}		
		
	}
	
	public static void mostrarRedactor() {
		for(int i=0; i<contadorRedactors; i++) {
			System.out.print(redactors[i].getNom() + ", ");
			System.out.println(redactors[i].getDni());
		}
	}
	
	public static Redactor introduirRedactor() {
		
		String nomRedactor = "";
		String dniRedactor = "";
		System.out.println("Introudeix el nom del redactor.");
		DADES.nextLine();
		nomRedactor = DADES.nextLine();
		System.out.println("Introdueix el DNI del redactor");
		dniRedactor = DADES.nextLine();
		Redactor redactor = new Redactor(nomRedactor, dniRedactor);
		return redactor;
		
	}
	
	public static Redactor[] eliminarRedactor() {
		
		String nomRedactor = "";
		System.out.println("Introudeix el nom del redactor.");
		DADES.nextLine();
		nomRedactor = DADES.nextLine();
		Redactor nouRedactors[] = new Redactor[50];
		System.arraycopy(redactors, 0, nouRedactors, 0, contadorRedactors);
		for(int i=0; i<contadorRedactors; i++) {
			if(redactors[i].getNom().equals(nomRedactor)) {
				for(int j=0; j<i-1; j++) {
					nouRedactors[j] = redactors[j];
				}
				for(int k=i; k<contadorRedactors; k++) {
					nouRedactors[k] = redactors[k+1];
				}
			}
		}
		
		return nouRedactors;
		
	}
	
	/*public static Redactor seleccionarRedactor() {
		
		Redactor redactor=null;
		int nombreRedactor;
		
		System.out.println("Indica el nombre del redactor:");
		
		for(int i=0; i<contadorRedactors; i++) {
			
			System.out.println(i + " .- " + redactors[i].getNom());
			
		}
		
		nombreRedactor = DADES.nextInt();
		
		for(int i=0; i<contadorRedactors; i++) {
			if(i==nombreRedactor) {
				
				redactor = redactors[i];
				return redactor;
			}
			
		}
		
		return redactor;
		
	}*/
	
	public static Noticia introduirNoticia() {
		
		String esport;
		String titular;
		String competicio;
		String club;
		String jugador;
		Redactor redactor=null;
		int nombreRedactor;
		Noticia noticia=null;
		
		System.out.println("Indica el nombre del redactor:");
		for(int i=0; i<contadorRedactors; i++) {
			
			System.out.println(i + " .- " + redactors[i].getNom());
			
		}
		
		DADES.nextLine();
		nombreRedactor = DADES.nextInt();
		
		for(int i=0; i<contadorRedactors; i++) {
			if(i==nombreRedactor) {
				
				redactor = redactors[i];
				
			}
			
		}
		
		System.out.println("De quin esport es la notícia?");
		DADES.nextLine();
		esport = DADES.nextLine();
		
		switch(esport) {
		
			case "futbol":
				
				System.out.println("Escriu el titular:");
				titular = DADES.nextLine();
				System.out.println("De quina competició parla la notícia?");
				competicio = DADES.nextLine();
				System.out.println("De quin club parla la notícia?");
				club = DADES.nextLine();
				System.out.println("De quin jugador parla la notícia?");
				jugador = DADES.nextLine();
				
				Futbol noticiaFutbol = new Futbol(titular, redactor, competicio, club, jugador);
				return noticiaFutbol;
				
			case "basquet":
				System.out.println("Escriu el titular:");
				titular = DADES.nextLine();
				System.out.println("De quina competició parla la notícia?");
				competicio = DADES.nextLine();
				System.out.println("De quin club parla la notícia?");
				club = DADES.nextLine();
				
				Basquet noticiaBasquet = new Basquet(titular, redactor, competicio, club);
				return noticiaBasquet;
			
			
			case "tenis":
				System.out.println("Escriu el titular:");
				titular = DADES.nextLine();
				System.out.println("De quina competició parla la notícia?");
				competicio = DADES.nextLine();
				System.out.println("De quin tenista parla la notícia?");
				jugador = DADES.nextLine();
				
				Tenis noticiaTenis = new Tenis(titular, redactor, competicio, jugador);
				return noticiaTenis;
				
			case "F1":
				System.out.println("Escriu el titular:");
				titular = DADES.nextLine();
				System.out.println("De quina escudería parla la notícia?");
				club = DADES.nextLine();
				
				F1 noticiaF1 = new F1(titular, redactor, club);
				return noticiaF1;
			
				
			case "motociclisme":
				System.out.println("Escriu el titular:");
				titular = DADES.nextLine();
				System.out.println("De quin club parla la notícia?");
				club = DADES.nextLine();
				
				Motociclisme noticiaMotos = new Motociclisme(titular, redactor, club);
				return noticiaMotos;
		}
		
		return noticia;
		
	}
	
	public static Noticia[] eliminarNoticia() {
		
		Noticia noticiesNou[] = new Noticia[50];
		String titularNoticia;
		String nomRedactor;
		System.out.println("Introudeix el titular de la notícia.");
		DADES.nextLine();
		titularNoticia = DADES.nextLine();
		System.out.println("Introudeix el nom del redactor.");
		DADES.nextLine();
		nomRedactor = DADES.nextLine();
		String redactorBuscat;
		
		System.arraycopy(noticies, 0, noticiesNou, 0, contadorNoticies);
		
		for(int i=0; i<contadorNoticies; i++) {
			if(noticies[i].getTitular().equals(titularNoticia)) {
				Redactor redactor=noticies[i].redactor;
				redactorBuscat = redactor.getNom();
				if(nomRedactor.equals(redactorBuscat)) {
					for(int j=0; j<i-1; j++) {
						noticiesNou[j] = noticies[j];
					}
					for(int k=i; k<contadorRedactors; k++) {
						noticiesNou[k] = noticies[k+1];
					}
				}
				
			}
		}
		
		return noticiesNou;
		
	}
	
	public static void mostrarNoticies() {
		
		System.out.println("NOTICIES:");
		for(int i=0; i<contadorNoticies; i++) {
			
			System.out.println(noticies[i].getNomRedactor() + ": " + noticies[i].getTitular());
			
		}
		
	}
	
	public static int calcularPuntuacio() {
		int puntuacioNoticia=0;
		String titularNoticia;
		
		System.out.println("Introdueix el titular de la noticia:");
		System.out.println("TITULARES:");
		for(int i=0; i<contadorNoticies; i++) {
			System.out.println(noticies[i].getTitular());
		}
		
		DADES.nextLine();
		titularNoticia = DADES.nextLine();
				
		for(int i=0; i<contadorNoticies; i++) {
			
			if(noticies[i].getTitular().equals(titularNoticia)) {
				puntuacioNoticia = noticies[i].calcularPuntuacioNoticia();
				return puntuacioNoticia;
			}
		}
		
		return puntuacioNoticia;
	}
	
	public static int calcularPreu() {
		int preuNoticia=0;
		String titularNoticia;
		
		System.out.println("Introdueix el titular de la noticia:");
		System.out.println("TITULARES:");
		for(int i=0; i<contadorNoticies; i++) {
			System.out.println(noticies[i].getTitular());
		}
		
		DADES.nextLine();
		titularNoticia = DADES.nextLine();
		
		for(int i=0; i<contadorNoticies; i++) {
			if(noticies[i].getTitular().equals(titularNoticia)) {
				preuNoticia = noticies[i].calcularPreuNoticia();
				return preuNoticia;
			}
		}
		
		return preuNoticia;
	}
	
}

package n1exercici2;

public class Cotxe {
	/*
	 * La variable marca al tenir els modificadors static i final es converteix en una constant.
	 * El modificador static indica que es comuna a totes las instancias de la clase, i podem acceder a aquest
	 * atribut mediant el nom de la propia classe.
	 * El modificador final fa que el seu valor no es pugui modificar.
	 */
	private static final String marca = "Ford";
	/*
	 * La variable model es static, por lo que es comuna a totes les classes. Podem accedir-hi amb el nom de la propia classe,
	 * sense instanciar-la.
	 */
	private static String model;
	/*
	 * La variable potencia es final, por lo que el seu valor no es pot modificar. Al no ser static hem de instanciarla per
	 * poder accedir al seu valor.
	 */
	private final int potencia = 400;
	
	public Cotxe(){
		//marca = "Renault";
		model = "Mustang";
		//potencia = 500;
	}
	
	public static void frenar() {
		System.out.println("El vehicle està frenant.");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant.");
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	/*public void setMarca(String novaMarca) {
		marca = novaMarca;
	}*/
	
	public void setModel(String nouModel) {
		model = nouModel;
	}
	
	/*public void setPotencia(int novaPotencia) {
		potencia = novaPotencia;
	}*/
	
}

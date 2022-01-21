package simulacionExamenSpaceInvader;

public class CampoBatalla {
	
	// Arrays
	private Humano humanos[] = new Humano[20];
	private Malvado malvados[] = new Malvado[20];
	
	
	// Singleton
	private static CampoBatalla instance = null;


	/**
	 * Metodo del Singleton
	 * @return
	 */
	public static CampoBatalla getInstance() {
		if (instance == null) {
			instance = new CampoBatalla();
		}
		return instance;
	}
		
	
	/**
	 * Metodo que inicializa los personajes0
	 */
	public CampoBatalla() {
		
		for (int i = 0; i < humanos.length; i++) {
			Humano humano = humanos[i];
		}
		
		for (int i = 0; i < malvados.length; i++) {
			Malvado malvado = malvados[i];
			
		}
		
		// Duplico la cantidad de vida del ultimo elemento del array de los humanos, es decir, del ultimo humano
		Humano ultimoHumano= humanos[humanos.length - 1];
		ultimoHumano.setPuntosDeVida(ultimoHumano.getPuntosDeVida() * 2);
		
		// Duplico la cantidad de vida del ultimo elemento del array de los humanos, es decir, del ultimo humano
		Malvado ultimoMalvado = malvados[malvados.length - 1];
		ultimoMalvado.setPuntosDeVida(ultimoMalvado.getPuntosDeVida() * 2);
	}
	

	/**
	 * Responsable del bucle principal que lleva a cabo la acción
	 */
	public void comienzaBatalla() {
		// Bucle do ... while que permite que los dos primeros personajes de cada tipo con vida se 
		// disparen
	}
	
	
	/**
	 * Método que desordena un array, con un bucle que se ejecute X veces y que obtenga dos índices
	 * al azar e intercambie las posiciones de los dos elementos que corresponden con esos índices
	 * @param array
	 */
	public void mezclarArray (Personaje array[]) {
		
	}
	
	
	/**
	 * Método que se llamará desde el "comienzaBatalla" recibirá a los arrays, alternativamente, de
	 * humanos y malvados y buscará, con un bucle, desde la izquierda a la derecha el primer elemento
	 * que tenga vida.
	 * Si se recorre el array completo y no se encuentra un elemento con vida devolveremos "null", siendo
	 * esto una bandera que se reconocerá en el método "comienzaBatalla"
	 * 
	 * @param humanos
	 * @param malvados
	 * @return
	 */
	private Personaje getPrimerElementoVivoEnArray (Humano humanos[], Malvado malvados[]) {
		
		return null;
	}
	
	
	// Getters y Setters
	
	/**
	 * @return the humanos
	 */
	public Humano[] getHumanos() {
		return humanos;
	}


	/**
	 * @param humanos the humanos to set
	 */
	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}


	/**
	 * @return the malvados
	 */
	public Malvado[] getMalvados() {
		return malvados;
	}


	/**
	 * @param malvados the malvados to set
	 */
	public void setMalvados(Malvado[] malvados) {
		this.malvados = malvados;
	}
	
}

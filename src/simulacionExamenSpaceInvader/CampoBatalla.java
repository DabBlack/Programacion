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
	 * Metodo que inicializa los personajes
	 */
	public CampoBatalla() {
		
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano();
		}
		
		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado();
			
		}
		
		// Duplico la cantidad de vida del ultimo elemento del array de los humanos, es decir, del ultimo humano
		Humano ultimoHumano = humanos[humanos.length - 1];
		ultimoHumano.setPuntosDeVida(ultimoHumano.getPuntosDeVida() * 2);
		
		// Duplico la cantidad de vida del ultimo elemento del array de los humanos, es decir, del ultimo humano
		Malvado ultimoMalvado = malvados[malvados.length - 1];
		ultimoMalvado.setPuntosDeVida(ultimoMalvado.getPuntosDeVida() * 2);
	}
	

	/**
	 * Responsable del bucle principal que lleva a cabo la acción
	 */
	public void comienzaBatalla() {
		
		Humano primerHumanoVivo;
		Malvado primerMalvadoVivo;
		
		// Este bucle detecta el primer humano y el primer malvado vivo y se disparan entre ellos
		// En el caso de no haber personajes vivos se acaba la batalla y gana el bando que le quede algun persoaje vivo
		do {
			// Localizamos el primer humano vivo y el primer malvado vivo para que se disparen
			primerHumanoVivo = getPrimerHumanoVivo(humanos);
			primerMalvadoVivo = getPrimerMalvadoVivo(malvados);
			personajeDisparaAPersonaje(primerHumanoVivo, primerMalvadoVivo);
			
			// Se localiza el primer malvado vivo, si esta muerto han ganado los humanos
			primerMalvadoVivo = getPrimerMalvadoVivo(malvados);
			if (primerMalvadoVivo == null) {
				System.out.println("\n\t\t¡¡¡HAN GANADO LOS HUMANOS!!!");
			}
			// Si no el malvado vivo dispara al humano vivo
			else {
				personajeDisparaAPersonaje(primerMalvadoVivo, primerHumanoVivo);
			}
			
			// Se localiza el primer humano vivo, si esta muerto han ganado los malvado
			primerHumanoVivo = getPrimerHumanoVivo(humanos);
			if (primerHumanoVivo == null) {
				System.out.println("\n\t\t¡¡¡HAN GANADO LOS MALVADOS!!!");
			}
			
		} while (primerHumanoVivo != null && primerMalvadoVivo != null);

	}
	
	
	/**
	 * Método que desordena un array, con un bucle que se ejecute X veces y que obtenga dos índices
	 * al azar e intercambie las posiciones de los dos elementos que corresponden con esos índices
	 * @param array
	 */
	public void mezclarArray (Personaje arrayPersonaje[]) {
		int posicionAleatoria1 = (int) Math.round(Math.random() * (arrayPersonaje.length - 1));
		int posicionAleatoria2 = (int) Math.round(Math.random() * (arrayPersonaje.length - 1));
		
		for (int i = 0; i < arrayPersonaje.length; i++) {
			Personaje auxiliar = arrayPersonaje[posicionAleatoria1];
			arrayPersonaje[posicionAleatoria1] = arrayPersonaje[posicionAleatoria2];
			arrayPersonaje[posicionAleatoria2] = auxiliar;		
		}
	
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
	private Humano getPrimerHumanoVivo (Humano humanos[]){
		Humano ultimoHumanoVivo;
		
		for (int i = 0; i < humanos.length; i++) {
			 if (humanos[i].isEstaVivo() == true) {
				ultimoHumanoVivo = humanos[i]; 
			 	return ultimoHumanoVivo;
			 }
			 else {
				 humanos[i].setEstaVivo(false);
			 }
		}
		return null;
	}
	
	private Malvado getPrimerMalvadoVivo (Malvado malvados[]){
		Malvado ultimoMalvadoVivo;
		
		for (int i = 0; i < malvados.length; i++) {
			 if (malvados[i].isEstaVivo() == true) {
				ultimoMalvadoVivo = malvados[i]; 
			 	return ultimoMalvadoVivo;
			 }
			 else {
				 humanos[i].setEstaVivo(false);
			 }
		}
		return null;
	}
	
	
	/**
	 * También se llamará desde "comienzaBatalla" y se utilizará alternando sus dos argumentos de entrada
	 * En unos casos el primer argumento será un humano y el segundo un malvado y otros casos será al
	 * contrario.
	 * @param queDispara
	 * @param queRecibeDisparo
	 */
	private void personajeDisparaAPersonaje (Personaje queDispara, Personaje queRecibeDisparo) {
		
		System.out.println(queDispara.toString() + queRecibeDisparo.toString());
		
		if(queRecibeDisparo.getPuntosDeVida() > 0) {
			queRecibeDisparo.setPuntosDeVida(queRecibeDisparo.getPuntosDeVida() - queDispara.getPotenciaDeFuego());
		}
		
		if(queRecibeDisparo.getPuntosDeVida() <= 0) {
			queRecibeDisparo.setEstaVivo(false);
			queRecibeDisparo.setPuntosDeVida(0);
		}
		
		System.out.println(queDispara.toString() + "\nHA DISPARADO SOBRE" + queRecibeDisparo.toString() );
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

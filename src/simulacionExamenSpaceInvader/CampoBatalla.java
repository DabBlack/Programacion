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
		
		System.out.println("\t\t\t\t**********************************" + "\n\t\t\t\t Space Invader David Algar Burgos\n" + "\t\t\t\t**********************************");
		
		System.out.println("\n\t\t\t\t   ¡¡QUE COMIENCE LA BATALLA!!\n");
		
		for (int i = 0; i < humanos.length; i++) {
			humanos[i] = new Humano();
			humanos[i].setNombre("Humano " + (i + 1));
		}
		
		for (int i = 0; i < malvados.length; i++) {
			malvados[i] = new Malvado();
			malvados[i].setNombre("Malvado " + (i + 1));
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
		
		Personaje primerHumanoVivo;
		Personaje primerMalvadoVivo;
		
		// Este bucle detecta el primer humano y el primer malvado vivo y se disparan entre ellos
		// En el caso de no haber personajes vivos se acaba la batalla y gana el bando que le quede algun persoaje vivo
		do {
			// Localizamos el primer humano vivo y el primer malvado vivo para que se disparen
			primerHumanoVivo = getPrimerPersonajeVivo(humanos);
			primerMalvadoVivo = getPrimerPersonajeVivo(malvados);
			personajeDisparaAPersonaje(primerHumanoVivo, primerMalvadoVivo);
			
			// Se localiza el primer malvado vivo, si esta muerto han ganado los humanos
			primerMalvadoVivo = getPrimerPersonajeVivo(malvados);
			if (primerMalvadoVivo == null) {
				System.out.println("\n\n\t\t\t\t¡¡¡HAN GANADO LOS HUMANOS!!!\n");
			}
			// Si no el malvado vivo dispara al humano vivo
			else {
				personajeDisparaAPersonaje(primerMalvadoVivo, primerHumanoVivo);

				// Se localiza el primer humano vivo, si esta muerto han ganado los malvado
				primerHumanoVivo = getPrimerPersonajeVivo(humanos);
				if (primerHumanoVivo == null) {
					System.out.println("\n\n\t\t\t\t¡¡¡HAN GANADO LOS MALVADOS!!!\n");
				}
								
			}
			
		} while (primerHumanoVivo != null && primerMalvadoVivo != null);
		
		
		
		System.out.println("\n\n- Humanos ordenados de menos a más disparos que han recibido:\n");
		
		ordenarPersonajesDeMayorAMenorSegunDisparos(humanos);
		mostrarOrdenarPersonajesDeMayorAMenorSegunDisparos(humanos);
		
		System.out.println("\n\n- Humano más dificil de matar:");
		
		personajeMasDificilDeMatar(humanos);
		
		System.out.println("\n- Humano más fácil de matar:");
		
		personajeMenosDificilDeMatar(humanos);
		
		System.out.println("\n\n\n- Malvados ordenados de menos a más disparos que han recibido:\n");
		
		ordenarPersonajesDeMayorAMenorSegunDisparos(malvados);
		mostrarOrdenarPersonajesDeMayorAMenorSegunDisparos(malvados);
		
		System.out.println("\n\n- Malvado más dificil de matar:");
		
		personajeMasDificilDeMatar(malvados);
		
		System.out.println("\n- Malvado más fácil de matar:");
		
		personajeMenosDificilDeMatar(malvados);
		
		
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
	 * Metodo que se llamara desde "comienzaBatalla" para localizar cual es el primer humano o malvado vivo, es decir,
	 * buscara el primer personaje del tipo que necesitemos con su variable booleana a true
	 * @param array
	 * @return
	 */
	private Personaje getPrimerPersonajeVivo (Personaje array[]){
		
		for (int i = 0; i < array.length; i++) {
			 if (array[i].isEstaVivo() == true) { 
			 	return array[i];
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
			queRecibeDisparo.setDisparosRecibidos(queRecibeDisparo.getDisparosRecibidos() + 1);
		}
		
		if(queRecibeDisparo.getPuntosDeVida() <= 0) {
			queRecibeDisparo.setEstaVivo(false);
			queRecibeDisparo.setPuntosDeVida(0);
		}
		
		System.out.println(queDispara.toString() + "\nHA DISPARADO SOBRE" + queRecibeDisparo.toString() );
	}

	
	/**
	 * 	
	 * @param array
	 */
	private void ordenarPersonajesDeMayorAMenorSegunDisparos (Personaje array[]) {
		Personaje auxiliar;
		boolean hayIntercambios = true;
		
		do {
			hayIntercambios = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].getDisparosRecibidos() > array[i + 1].getDisparosRecibidos()) {
					hayIntercambios = true;
					auxiliar = array[i + 1];
					array[i + 1] = array[i];
					array[i] = auxiliar;
				}
			}
		} while(hayIntercambios == true);
				
	}
	
	
	/**
	 * 
	 * @param array
	 */
	private void mostrarOrdenarPersonajesDeMayorAMenorSegunDisparos (Personaje array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\n");
		}
	}
	
	/**
	 * 
	 * @param array
	 * @return 
	 */
	private void personajeMasDificilDeMatar (Personaje array[]) {
		int ultimaPosicionArray = array.length - 1;
		Personaje masDificilDeMatar;
			
		ordenarPersonajesDeMayorAMenorSegunDisparos(array);
		
		masDificilDeMatar = array[ultimaPosicionArray];
		
		System.out.println(masDificilDeMatar);
			
	}
	
	/**
	 * 
	 * @param array
	 * @return 
	 */
	private void personajeMenosDificilDeMatar (Personaje array[]) {
		Personaje menosDificilDeMatar;
			
		ordenarPersonajesDeMayorAMenorSegunDisparos(array);
		
		menosDificilDeMatar = array[0];
		
		System.out.println(menosDificilDeMatar);
			
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

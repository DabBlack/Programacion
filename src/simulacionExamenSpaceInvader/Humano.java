package simulacionExamenSpaceInvader;

public class Humano extends Personaje {

	/**
	 * 
	 */
	public Humano() {
	}

	
	/**
	 * @param puntosDeVida
	 * @param potenciaDeFuego
	 * @param estaVivo
	 */
	public Humano(int puntosDeVida, int potenciaDeFuego, boolean estaVivo) {
		super(puntosDeVida, potenciaDeFuego, estaVivo);
	}


	@Override
	public String toString() {
		return "\nHumano ->  Puntos De Vida: " + puntosDeVida + "  Potencia De Fuego: " + potenciaDeFuego + "  Esta Vivo: "
				+ estaVivo + ".";
	}
	
}

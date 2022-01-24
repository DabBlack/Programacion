package simulacionExamenSpaceInvader;

public class Malvado extends Personaje {

	/**
	 * 
	 */
	public Malvado() {
	}

	
	/**
	 * @param puntosDeVida
	 * @param potenciaDeFuego
	 * @param estaVivo
	 */
	public Malvado(int puntosDeVida, int potenciaDeFuego, boolean estaVivo) {
		super(puntosDeVida, potenciaDeFuego, estaVivo);
	}

	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "\nMalvado ->  Puntos De Vida: " + puntosDeVida + "  Potencia De Fuego: " + potenciaDeFuego + "  Esta Vivo: "
				+ estaVivo + ".";
	}

}

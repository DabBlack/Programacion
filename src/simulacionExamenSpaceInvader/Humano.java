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
	public Humano(int puntosDeVida, int potenciaDeFuego, boolean estaVivo, String nombre, int disparosRecibidos) {
		super(puntosDeVida, potenciaDeFuego, estaVivo, nombre, disparosRecibidos);
	}


	@Override
	public String toString() {
		return "\n" + nombre + " ->  Puntos De Vida: " + puntosDeVida + "  Potencia De Fuego: " + potenciaDeFuego + 
				"  Disparos Recibidos: " + disparosRecibidos + "  Esta Vivo: " + estaVivo + ".";
	}
	
}

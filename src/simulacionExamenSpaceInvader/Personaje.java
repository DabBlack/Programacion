package simulacionExamenSpaceInvader;

public class Personaje {
	
	// Variables	
	protected int puntosDeVida = (int) Math.round(Math.random() * (100 - 50)) + 50;
	protected int potenciaDeFuego = (int) Math.round(Math.random() * (25 - 5)) + 5;
	protected boolean estaVivo = true;
	
	
	// Constructores
	
	/**
	 * 
	 */
	public Personaje() {
		super();
	}

	
	/**
	 * 
	 * @param puntosDeVida
	 * @param potenciaDeFuego
	 * @param estaVivo
	 */
	public Personaje(int puntosDeVida, int potenciaDeFuego, boolean estaVivo) {
		super();
		this.puntosDeVida = puntosDeVida;
		this.potenciaDeFuego = potenciaDeFuego;
		this.estaVivo = estaVivo;
	}


	// To String 
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Personaje [puntosDeVida=" + puntosDeVida + ", potenciaDeFuego=" + potenciaDeFuego + ", estaVivo="
				+ estaVivo + "]";
	}


	// Getters y Setters
	
	/**
	 * @return the puntosDeVida
	 */
	public int getPuntosDeVida() {
		return puntosDeVida;
	}


	/**
	 * @param puntosDeVida the puntosDeVida to set
	 */
	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}


	/**
	 * @return the potenciaDeFuego
	 */
	public int getPotenciaDeFuego() {
		return potenciaDeFuego;
	}


	/**
	 * @param potenciaDeFuego the potenciaDeFuego to set
	 */
	public void setPotenciaDeFuego(int potenciaDeFuego) {
		this.potenciaDeFuego = potenciaDeFuego;
	}


	/**
	 * @return the estaVivo
	 */
	public boolean isEstaVivo() {
		return estaVivo;
	}


	/**
	 * @param estaVivo the estaVivo to set
	 */
	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}
	
	
	
	
	
	
	
}

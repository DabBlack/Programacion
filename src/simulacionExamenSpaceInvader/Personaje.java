package simulacionExamenSpaceInvader;

public class Personaje {
	
	// Variables	
	protected int puntosDeVida = (int) Math.round(Math.random() * (100 - 50)) + 50;
	protected int potenciaDeFuego = (int) Math.round(Math.random() * (25 - 5)) + 5;
	protected boolean estaVivo = true;
	protected String nombre = "";
	protected int disparosRecibidos = 0;
	
	
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
	public Personaje(int puntosDeVida, int potenciaDeFuego, boolean estaVivo, String nombre, int disparosRecibidos) {
		super();
		this.puntosDeVida = puntosDeVida;
		this.potenciaDeFuego = potenciaDeFuego;
		this.estaVivo = estaVivo;
		this.nombre = nombre;
		this.disparosRecibidos = disparosRecibidos;
	}


	// To String 
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "\n" + nombre + " ->  Puntos De Vida: " + puntosDeVida + "  Potencia De Fuego: " + potenciaDeFuego + 
				"  Disparos Recibidos: " + disparosRecibidos + "  Esta Vivo: " + estaVivo + ".";
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


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the disparosRecibidos
	 */
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}


	/**
	 * @param disparosRecibidos the disparosRecibidos to set
	 */
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}
	
	
	
	
	
	
	
}

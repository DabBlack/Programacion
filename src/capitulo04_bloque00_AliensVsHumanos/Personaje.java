package capitulo04_bloque00_AliensVsHumanos;

public class Personaje {

	// Declaracion de propiedades del objeto
	protected int vida;
	protected int potencia;
	protected int precision;

	// Metodos Constructores

	/**
	 * 
	 */
	public Personaje() {
		this.vida = 100;
		this.potencia = (int) Math.round(Math.random() * (30 - 20) + 20);
		this.precision = (int) Math.round(Math.random() * (70 - 50) + 50);
	}

	/**
	 * @param vida
	 * @param potencia
	 * @param precision
	 */
	public Personaje(int vida, int potencia, int precision) {
		this.vida = vida;
		this.potencia = potencia;
		this.precision = precision;
	}

	// To String

	@Override
	public String toString() {
		return "Personaje [vida=" + vida + ", potencia=" + potencia + ", precision=" + precision + "]";
	}

	// Getters y Setters

	/**
	 * @return the vida
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * @param vida the vida to set
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	/**
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the precision
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(int precision) {
		this.precision = precision;
	}

}

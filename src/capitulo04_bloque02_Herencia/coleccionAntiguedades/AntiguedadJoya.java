package capitulo04_bloque02_Herencia.coleccionAntiguedades;

public class AntiguedadJoya extends Antiguedad {

	protected String material, tipo;
	protected float peso_gramos;
	
	/**
	 * 
	 */
	public AntiguedadJoya() {
	}

	
	/**
	 * 
	 * @param añoFabricacion
	 * @param origen
	 * @param precio
	 */
	public AntiguedadJoya(int añoFabricacion, String origen, float precio) {
		super(añoFabricacion, origen, precio);
	}

	
	// To String
	
	@Override
	public String toString() {
		return "Joya [añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + ", material="
				+ material + ", tipo=" + tipo + ", peso_gramos=" + peso_gramos + "]";
	}
	
	
	// Getters y Setters
	
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}


	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the peso_gramos
	 */
	public float getPeso_gramos() {
		return peso_gramos;
	}


	/**
	 * @param peso_gramos the peso_gramos to set
	 */
	public void setPeso_gramos(float peso_gramos) {
		this.peso_gramos = peso_gramos;
	}

	
	
}

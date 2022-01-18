package capitulo04_bloque02_Herencia.coleccionAntiguedades;

public class AntiguedadEscultura extends Antiguedad {

	protected String nombre, escultor, material;
	
	/**
	 * 
	 */
	public AntiguedadEscultura() {
	}

	
	/**
	 * 
	 * @param añoFabricacion
	 * @param origen
	 * @param precio
	 */
	public AntiguedadEscultura(int añoFabricacion, String origen, float precio) {
		super(añoFabricacion, origen, precio);
	}

	
	// To String
	
	@Override
	public String toString() {
		return "Escultura [añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + ", nombre="
				+ nombre + ", escultor=" + escultor + ", material=" + material + "]";
	}

	
	// Getters y Setters

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
	 * @return the escultor
	 */
	public String getEscultor() {
		return escultor;
	}


	/**
	 * @param escultor the escultor to set
	 */
	public void setEscultor(String escultor) {
		this.escultor = escultor;
	}


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

	
	
}

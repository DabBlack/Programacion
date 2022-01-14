package capitulo04_bloque02_Herencia.articulosComestibles;

public class Articulos_Perecederos extends Articulos {

	String fecha_Caducidad;
	
	/**
	 * 
	 */
	public Articulos_Perecederos() {
		super();
	}

	/**
	 * @param fecha_Caducidad
	 */
	public Articulos_Perecederos(String nombre, int codigo, float precio, String fecha_Caducidad) {
		super(nombre, codigo, precio);
		this.fecha_Caducidad = fecha_Caducidad;
	}

	// To String
	
	@Override
	public String toString() {
		return "Articulos_Perecederos [fecha_Caducidad=" + fecha_Caducidad + "]";
	}

	// Getters y Setter

	/**
	 * @return the fecha_Caducidad
	 */
	public String getFecha_Caducidad() {
		return fecha_Caducidad;
	}

	/**
	 * @param fecha_Caducidad the fecha_Caducidad to set
	 */
	public void setFecha_Caducidad(String fecha_Caducidad) {
		this.fecha_Caducidad = fecha_Caducidad;
	}
	
	
}

package capitulo04_bloque02_Herencia.articulosComestibles;

public class Articulo_Perecedero extends Articulo {

	protected String fecha_Caducidad;
	
	/**
	 * 
	 */
	public Articulo_Perecedero() {
		super();
	}
		
	/**
	 * 
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param fecha_Caducidad
	 */
	public Articulo_Perecedero(String nombre, int codigo, float precio, String fecha_Caducidad) {
		super(nombre, codigo, precio);
		this.fecha_Caducidad = fecha_Caducidad;
	}

	
	// Getters y Setter

	@Override
	public String toString() {
		return "Nombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "€"
				+ "  Fecha de caducidad: " + fecha_Caducidad;
	}

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

package examen_15_03_2022;

public abstract class Articulo {

	int id, cantidadUnidades;
	String nombre;
	float precioUnidad;
	
	/**
	 * 
	 */
	public Articulo() {
		super();
	}

	/**
	 * @param id
	 * @param cantidadUnidades
	 * @param nombre
	 * @param precioUnidad
	 */
	public Articulo(int id, int cantidadUnidades, String nombre, float precioUnidad) {
		super();
		this.id = id;
		this.cantidadUnidades = cantidadUnidades;
		this.nombre = nombre;
		this.precioUnidad = precioUnidad;
	}

	public abstract String getDescripcion();
	
	@Override
	public String toString() {
		return "Identificador: " + id + "     Nombre: " + nombre +  "     Cantidad de Unidades: " + cantidadUnidades +
				"     Precio Unidad:" + precioUnidad + "     Cantidad de unidades: " + cantidadUnidades;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cantidadUnidades
	 */
	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	/**
	 * @param cantidadUnidades the cantidadUnidades to set
	 */
	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
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
	 * @return the precioUnidad
	 */
	public float getPrecioUnidad() {
		return precioUnidad;
	}

	/**
	 * @param precioUnidad the precioUnidad to set
	 */
	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
		
}

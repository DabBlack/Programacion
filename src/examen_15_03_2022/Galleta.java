/**
 * 
 */
package examen_15_03_2022;

/**
 * @author diurno
 *
 */
public class Galleta extends Articulo {

	String tipoDeGalleta;
	
	/**
	 * 
	 */
	public Galleta() {
	}

	/**
	 * @param id
	 * @param cantidadUnidades
	 * @param nombre
	 * @param precioUnidad
	 */
	public Galleta(int id, int cantidadUnidades, String nombre, float precioUnidad, String tipoDeGalleta) {
		super(id, cantidadUnidades, nombre, precioUnidad);
		this.tipoDeGalleta = tipoDeGalleta;
	}

	@Override
	public String getDescripcion() {
		return "Galleta Lotus";
	}

	/**
	 * @return the tipoDeGalleta
	 */
	public String getTipoDeGalleta() {
		return tipoDeGalleta;
	}

	/**
	 * @param tipoDeGalleta the tipoDeGalleta to set
	 */
	public void setTipoDeGalleta(String tipoDeGalleta) {
		this.tipoDeGalleta = tipoDeGalleta;
	}

}

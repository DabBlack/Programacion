/**
 * 
 */
package examen_15_03_2022;

/**
 * @author diurno
 *
 */
public class BarraDePan extends Articulo {

	String tipoDeBarra;
	
	/**
	 * 
	 */
	public BarraDePan() {
	}

	/**
	 * @param id
	 * @param cantidadUnidades
	 * @param nombre
	 * @param precioUnidad
	 */
	public BarraDePan(int id, int cantidadUnidades, String nombre, float precioUnidad, String tipoDeBarra) {
		super(id, cantidadUnidades, nombre, precioUnidad);
		this.tipoDeBarra = tipoDeBarra;
	}
	
	@Override
	public String getDescripcion() {
		return "Barra de pan rústica.";
	}

	/**
	 * @return the tipoDeBarra
	 */
	public String getTipoDeBarra() {
		return tipoDeBarra;
	}

	/**
	 * @param tipoDeBarra the tipoDeBarra to set
	 */
	public void setTipoDeBarra(String tipoDeBarra) {
		this.tipoDeBarra = tipoDeBarra;
	}

}

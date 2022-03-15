/**
 * 
 */
package examen_15_03_2022;

/**
 * @author diurno
 *
 */
public class Magdalena extends Articulo {

	String tipoDeMagdalena;
	
	/**
	 * 
	 */
	public Magdalena() {
	}

	/**
	 * @param id
	 * @param cantidadUnidades
	 * @param nombre
	 * @param precioUnidad
	 */
	public Magdalena(int id, int cantidadUnidades, String nombre, float precioUnidad, String tipoDeMagdalena) {
		super(id, cantidadUnidades, nombre, precioUnidad);
		this.tipoDeMagdalena = tipoDeMagdalena;
	}

	@Override
	public String getDescripcion() {
		return "Magdalena con pepitas de chocolate milka";
	}

	/**
	 * @return the tipoDeMagdalena
	 */
	public String getTipoDeMagdalena() {
		return tipoDeMagdalena;
	}

	/**
	 * @param tipoDeMagdalena the tipoDeMagdalena to set
	 */
	public void setTipoDeMagdalena(String tipoDeMagdalena) {
		this.tipoDeMagdalena = tipoDeMagdalena;
	}
	
	

}

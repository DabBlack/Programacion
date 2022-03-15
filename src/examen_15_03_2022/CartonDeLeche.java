/**
 * 
 */
package examen_15_03_2022;

/**
 * @author diurno
 *
 */
public class CartonDeLeche extends Articulo {

	int mlDelCarton;
	
	/**
	 * 
	 */
	public CartonDeLeche() {
	}

	/**
	 * @param id
	 * @param cantidadUnidades
	 * @param nombre
	 * @param precioUnidad
	 */
	public CartonDeLeche(int id, int cantidadUnidades, String nombre, float precioUnidad, int mlDelCarton) {
		super(id, cantidadUnidades, nombre, precioUnidad);
		this.mlDelCarton = mlDelCarton;
	}

	@Override
	public String getDescripcion() {
		return "Cartón de leche La Lechera";
	}

	/**
	 * @return the mlDelCarton
	 */
	public int getMlDelCarton() {
		return mlDelCarton;
	}

	/**
	 * @param mlDelCarton the mlDelCarton to set
	 */
	public void setMlDelCarton(int mlDelCarton) {
		this.mlDelCarton = mlDelCarton;
	}

}

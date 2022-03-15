package examen_15_03_2022;

import java.util.HashMap;

public class Caja {
		
	public static HashMap<String, Articulo> cajaDeArticulos = new HashMap<String, Articulo>();
	
	/**
	 * 
	 */
	public Caja() {
		super();
	}
	
	/**
	 * @return the cajaDeArticulos
	 */
	public static HashMap<String, Articulo> getCajaDeArticulos() {
		return cajaDeArticulos;
	}

	/**
	 * @param cajaDeArticulos the cajaDeArticulos to set
	 */
	public static void setCajaDeArticulos(HashMap<String, Articulo> cajaDeArticulos) {
		Caja.cajaDeArticulos = cajaDeArticulos;
	}
	
}

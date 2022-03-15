package examen_15_03_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


public class Cliente {
	
private static Properties propiedades = null;
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		}
		try {
			File file = new File("./src/examen_15_03_2022/propiedades.properties");
			System.out.println("Fichero encontrado: " + file.exists());
			propiedades.load(new FileReader(file));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return propiedades;

	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	public static String getProperty(String nombreSupermercado) {
		return getPropiedades().getProperty(nombreSupermercado);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
				
		String nombreSupermercado= getProperty("NOMBRESUPERMERCADO");
		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		
		BarraDePan barraDePan = new BarraDePan(1, 2, "BarraDePan", 1, "Barra de Pan integral");
		listaArticulos.add(barraDePan);
		
		CartonDeLeche cartonDeLeche = new CartonDeLeche(2, 5, "CartónDeLeche", 2, 500);
		listaArticulos.add(cartonDeLeche);

		Galleta galleta = new Galleta(3, 10, "Galleta", 1, "Galleta Clásica");
		listaArticulos.add(galleta);

		Magdalena magdalena = new Magdalena(4, 3, "Magdalena", 3, "Magdalena de leche");
		listaArticulos.add(magdalena);

		System.out.println(nombreSupermercado + "\n\nArticulos de la cesta: \n");
		
		mostrarListaArticulos(listaArticulos);
		
		pasarArticulosACaja(listaArticulos);
		
		borrarArticulo();
		
		cantidadTotalDeDineroAPagar();
	}
	
	/**
	 * 
	 * @param listaArticulos
	 */
	public static void mostrarListaArticulos(List<Articulo>listaArticulos) {
		for (int i = 0; i < listaArticulos.size(); i++) {
			System.out.println(i + ".\t" + listaArticulos.get(i) + " ");
		}
	}

	public static void pasarArticulosACaja(List<Articulo>listaArticulos) {
		System.out.println("\nPasando articulos a caja.\n\nArticulos en la caja:");
			
		for (int i = 0; i < listaArticulos.size(); i++) {
			Caja.cajaDeArticulos.put(listaArticulos.get(i).getNombre(), listaArticulos.get(i));
		}
		
	}
	
	/**
	 * 
	 */
	public static void borrarArticulo() {
		Scanner sc = new Scanner(System.in);
		String nombre;

		mostrarHashMap();
		
		System.out.println("\n¿Qué artículo desea eliminar? (Introducir el nombre del artículo)");
		nombre = sc.next();
		
		Caja.getCajaDeArticulos().remove(nombre);
		
		System.out.println("Articulo borrado.");
		
		mostrarHashMap();
	}
	
	public static void mostrarHashMap() {
		Iterator it = Caja.cajaDeArticulos.values().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void cantidadTotalDeDineroAPagar() {
		Iterator it = Caja.cajaDeArticulos.values().iterator();
		float dineroAPagar = 0, dineroUnidad;
		
		while(it.hasNext()) {
			dineroUnidad = Caja.cajaDeArticulos.get(it).precioUnidad;
			dineroUnidad += dineroAPagar;
		}
		
		System.out.println("El dinero a pagar es: " + dineroAPagar + "€");
	}
	
}

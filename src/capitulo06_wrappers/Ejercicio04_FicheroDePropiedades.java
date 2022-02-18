package capitulo06_wrappers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Ejercicio04_FicheroDePropiedades {


	// Declaramos una propiedad de tipo Properties en null
	private static Properties propiedades = null;

	/**
	 * Metodo parecido al Singleton con el que vamos a cargar el fichero .properties
	 * de donde vamos a sacar los datos
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		}
		try {

			File file = new File("./src/capitulo06/wrappers/propiedades.properties");
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
	 * @param nombreP
	 * @return
	 */
	public static String getProperty(String nombreP) {
		return getPropiedades().getProperty(nombreP);
	}

	/**
	 * 
	 * @param nombreP
	 * @return
	 */
	public static int getIntPropiedad(String nombreP) {
		return Integer.parseInt(getPropiedades().getProperty(nombreP));
	}

	/**
	 * 
	 * @param nombreP
	 * @return
	 */
	public static float getFloatPropiedad(String nombreP) {
		return Float.parseFloat(getPropiedades().getProperty(nombreP));
	}

	/**
	 * 
	 * @param nombreP
	 * @return
	 */
	public static boolean getBooleanPropiedad(String nombreP) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombreP));
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String usuario = Ejercicio04FicheroDePropiedades.getProperty("USUARIO");
		int id = Ejercicio04FicheroDePropiedades.getIntPropiedad("ID_USUARIO");
		float estatura = Ejercicio04FicheroDePropiedades.getFloatPropiedad("ESTATURA");
		boolean pregunta = Ejercicio04FicheroDePropiedades.getBooleanPropiedad("ESMUJER");

		System.out.println("Usuario: " + usuario);
		System.out.println("Id de usuario: " + id);
		System.out.println("Estatura del usuario: " + estatura);
		System.out.println("¿El usuario es mujer?: " + pregunta);

	}

}

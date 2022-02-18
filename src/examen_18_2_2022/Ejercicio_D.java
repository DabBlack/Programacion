package examen_18_2_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ejercicio_D {

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
			File file = new File("./src/examen_18_2_2022/propiedades.properties");
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
	public static String getProperty(String nombre) {
		return getPropiedades().getProperty(nombre);
	}

	/**
	 * 
	 * @param nombreP
	 * @return
	 */
	public static int getIntPropiedad(String edad) {
		return Integer.parseInt(getPropiedades().getProperty(edad));
	}

	/**
	 * 
	 * @param nombreP
	 * @return
	 */
	public static float getFloatPropiedad(String peso) {
		return Float.parseFloat(getPropiedades().getProperty(peso));
	}

	/**
	 * 
	 * @param nombreP
	 * @return
	 */
	public static boolean getBooleanPropiedad(String esMayorDeEdad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(esMayorDeEdad));
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nombre = Ejercicio_D.getProperty("nombre");
		int edad = Ejercicio_D.getIntPropiedad("edad");
		float peso = Ejercicio_D.getFloatPropiedad("peso");
		boolean esMayorDeEdad = Ejercicio_D.getBooleanPropiedad("esMayorDeEdad");

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Peso: " + peso + "kg");
		System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);

	}

}

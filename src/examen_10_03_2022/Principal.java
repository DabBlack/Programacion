package examen_10_03_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Principal {

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
			File file = new File("./src/examen_10_03_2022/propiedades.properties");
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
	public static String getProperty(String nombreJuego) {
		return getPropiedades().getProperty(nombreJuego);
	}

	
	public static void main(String[] args) {

		List<Jugador> listaJugadores = new ArrayList<Jugador>();
		List<Tirada> listaTiradas = new ArrayList<Tirada>();
		String nombreJuego = getProperty("NOMBREJUEGO");
		String opcion;
		int puntuacion = 0, probabilidad = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nNombre del juego: " + nombreJuego + "\n");
		
		inicializarObjetos(listaJugadores, listaTiradas);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println("El jugador " + (j + 1) + " va a lanzar un dardo:");

					System.out.println("\n¿A qué jugada desea intentar lanzar?: " + "\n1. Jugada 1 = 1 punto."
							+ "\n2. Jugada 2 = 2 puntos." + "\n3. Jugada 3 = 3 puntos." + "\n4. Jugada 4 = 4 puntos."
							+ "\n5. Jugada 5 = 5 puntos." + "\n6. Jugada 6 = 6 puntos." + "\n7. Jugada 7 = 7 puntos."
							+ "\n8. Jugada 8 = 8 puntos." + "\n9. Jugada 9 = 9 puntos." + "\n9. Jugada 9 = 9 puntos."
							+ "\n10. Jugada 10 = 10 puntos." + "\n11. Jugada 11 = 11 puntos."
							+ "\n12. Jugada 12 = 12 puntos." + "\n13. Jugada 13 = 13 puntos."
							+ "\n14. Jugada 14 = 14 puntos." + "\n15. Jugada 15 = 15 puntos."
							+ "\n16. Jugada 16 = 16 puntos." + "\n17. Jugada 17 = 17 puntos."
							+ "\n18. Jugada 18 = 18 puntos." + "\n19. Jugada 19 = 19 puntos."
							+ "\n20. Jugada 20 = 20 puntos." + "\n21. Jugada 21 = 50 puntos."
							+ "\n22. Jugada 22 = 100 puntos.");

					opcion = sc.next();

					switch (opcion) {
					case "1":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(0).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(0).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(0).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						
						System.out.println("Puntuacion del jugador " + j + ": " + listaJugadores.get(j).getPuntuacion());
						
						break;
						
					case "2":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(1).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(1).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(1).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "3":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(2).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(2).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(2).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "4":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(3).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(3).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(3).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "5":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(4).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(4).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(4).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;

					case "6":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(5).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(5).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(5).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "7":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(6).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(6).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(6).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "8":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(7).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(7).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(7).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "9":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(8).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(8).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(8).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "10":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(9).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(9).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(9).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "11":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(10).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(10).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(10).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "12":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(11).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(11).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(11).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "13":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(12).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(12).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(12).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "14":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(13).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(13).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(13).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "15":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(14).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(14).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(14).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "16":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(15).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(15).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(15).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "17":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(16).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(16).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(16).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "18":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(7).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(17).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(17).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "19":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(18).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(18).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(18).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "20":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(19).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(19).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(19).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "21":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(20).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(21).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(21).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
						
					case "22":
						System.out.println("Ha apuntado a la jugada " + listaTiradas.get(21).getId());
						probabilidad = (int) Math.round(Math.random() * (90 - 10) + 10);
						
						if (probabilidad <= listaTiradas.get(22).getProbabilidadAcierto()) {
							puntuacion = puntuacion + listaTiradas.get(22).getPuntuacion();
							listaJugadores.get(j).setPuntuacion(puntuacion);
						}
						break;
					default:
						System.out.println("\nJugada incorrecta, por favor, introduzca una jugada correcta.");
					}

				}

			}
		}

	}

	public static void inicializarObjetos(List<Jugador> listaJugadores, List<Tirada> listaTiradas) {
		for (int i = 0; i < 4; i++) {
			Jugador jugador = new Jugador();
			jugador.setNombre("Jugador " + i);
		}

		for (int i = 0; i < 20; i++) {
			Tirada tirada = new Tirada();
			tirada.setId(i + 1);
			tirada.setDescripcion("Tirada numero " + i + 1);
			tirada.setPuntuacion(i + 1);
			tirada.setProbabilidadAcierto((int) Math.round(Math.random() * (90 - 10) + 10));
			listaTiradas.add(tirada);
		}

		Tirada tirada21 = new Tirada();
		tirada21.setId(21);
		tirada21.setDescripcion("Tirada numero 21");
		tirada21.setPuntuacion(50);
		tirada21.setProbabilidadAcierto((int) Math.round(Math.random() * (90 - 10) + 10));
		listaTiradas.add(tirada21);

		Tirada tirada22 = new Tirada();
		tirada22.setId(22);
		tirada22.setDescripcion("Tirada numero 22");
		tirada22.setPuntuacion(100);
		tirada22.setProbabilidadAcierto((int) Math.round(Math.random() * (90 - 10) + 10));
		listaTiradas.add(tirada22);
	}

}

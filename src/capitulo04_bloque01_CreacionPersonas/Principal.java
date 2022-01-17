package capitulo04_bloque01_CreacionPersonas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Persona arrayPersona[] = new Persona[3];
		
		boolean numPersonas = false; // Este boolean comprueba el numero de personas que se han creado
		boolean quiereSalirDelPrograma = false;// Este boolean comprueba si el usuario quiere salir del programa
		
		Scanner sc = new Scanner(System.in);
		
		//Necesitamos un bucle do para entrar minimamente una vez y salir si hay tres personas creadas o si el usuario a elegido salir
		do {
			System.out.println("�Que necesita hacer?" + "\n" + "\n" + "Menu" + "\n" + "-0. Salir" + "\n"
					+ "-1. Crear una persona (Maximo 3)" + "\n" + "-2. Consultar personas introducidas");
			int opcionElegidaPorElUsuario = sc.nextInt();
			
			switch (opcionElegidaPorElUsuario) {
			case 0: {
				quiereSalirDelPrograma = true; //Se validan las variables booleanas para que el programa termine
				numPersonas = true; //Se validan las variables booleanas para que el programa termine
				System.out.println("Has salido del programa");
				break;
			}
			case 1: {
				//Creo una persona llamando a un metodo que devuelve un booleano (controlando si hay 3 personas creadas)
				numPersonas = crearPersona(arrayPersona); 
				break;
			}
			case 2: {
				//Visualizo las personas creadas anteriormente llamando a un m�todo  que muestra en pantalla la informaci�n de cada una
				visualizarPersona(arrayPersona);
				break;
			}
			default:
				//Si el usuario elije algo distinto aparecera este mensaje en pantalla
				System.out.println("Selecci�n inv�lida");
			}
		} while (!numPersonas || !quiereSalirDelPrograma);
	}

	public static boolean crearPersona(Persona[] arrayPersona) {
		boolean personaCreada = false; // Esta variable booleana controla si se ha creado una persona en el m�todo
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creacion de una persona");
		
		for (int i = 0; i < arrayPersona.length; i++) {
			personaCreada = false;
			
			// Busca un hueco (null) en el array y crea una persona nueva
			if (arrayPersona[i] == null) {// To String
				System.out.println("Introduce su nombre:");
				String nombre = sc.next();
				
				System.out.println("Introduce su apellido:");
				String apellidos = sc.next();
				
				System.out.println("Introduce su DNI:");
				String dni = sc.next();
				
				System.out.println("Introduce su direccion:");
				String direccion = sc.next();
				
				System.out.println("Introduce su telefono:");
				String telefono = sc.next();
				
				//Creacion de una persona
				arrayPersona[i] = new Persona(nombre, apellidos, dni, direccion, telefono);
				personaCreada = true;
			}
			
			//Si hay 3 personas devuelve true
			if (i == arrayPersona.length - 1) {
				return true;
			}
			
			//Pregunta al usuario si quiere seguir creando personas tras crear una
			else  if (personaCreada) {
				boolean opcionValida = false;
				
				while (!opcionValida) {
					System.out.println("�Quieres crear otra persona? Si/No");
					String aux = sc.next();
					
					if (aux.contentEquals("Si")) {
						System.out.println("Vas a crear otra persona");
						opcionValida = true;
					}
					else if (aux.contentEquals("No")) {
						return false; //Aqui detenemos el metodo y devolvemos false
					}
				}
				
			}
		}
		return false;
	}

	public static void visualizarPersona(Persona[] arrayPersona) {
		for (int i = 0; i < arrayPersona.length; i++) {
			//Si se cumple la condicion el bucle imprime las personas en orden
			if (arrayPersona[i] != null) {
				System.out.println(arrayPersona[i].toString() + "\n");
			}
			//Si no se cumple la condicion el metodo se detendra con el break
			else {
				 break;
			}
		}
	}


}

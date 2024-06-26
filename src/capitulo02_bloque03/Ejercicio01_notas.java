package capitulo02_bloque03;



import javax.swing.JOptionPane;

public class Ejercicio01_notas {

	public static void main(String[] args) {
		
		String str;
		int nota;
		
		str = JOptionPane.showInputDialog("Introduce tu nota: ");
		nota = Integer.parseInt(str);
		System.out.println("Tu nota es: " + nota);
		
		//El switch proporciona unos casos en los que, si la variable se corresponde a alguno de ellos el programa se detiene con break y se inicia ese caso.
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente"); // Se llega en los cases 0, 1 y 2
			break; // Con esta instruccion salimos del switch
		case 3:
		case 4:
			System.out.println("Deficiente"); // Se llega en los cases 3 y 4
			break; // Con esta instruccion salimos del switch
		case 5:
			System.out.println("Suficiente"); //Se llega en el caso 5
			break; // Con esta instrucción salimos del switch
		case 6: 
			System.out.println("Bien"); //Se llega en el caso 6
			break; // Con esta instruccion salimos del switch
		case 7:
		case 8:
			System.out.println("Notable"); // Se llega en los cases 6 y 7
			break; // Con esta instruccion salimos del switch
		case 9:
		case 10:
			System.out.println("Sobresaliente"); // Se llega en los cases 9 y 10
			break; // Con esta instruccion salimos del switch
		default:
			System.out.println("Error, el valor no pertenece a ninguna nota");
		}
		
	}
		
}


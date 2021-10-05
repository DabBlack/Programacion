package bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02_calculadora {

	public static void main(String[] args) {
		
		String str;
		int opcion;
		float num1, num2;
		
		str = JOptionPane.showInputDialog("Introduzca una opcion" + "\n1.- Raices" + "\n2.- Potencias" + "\n3.- Division" + "\n0.- Salir de la aplicacion");
		opcion = Integer.parseInt(str);
		
		switch(opcion) {
		case 1:
			str = JOptionPane.showInputDialog("Introduzca el radicando: ");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca el indice: ");
			num2 = Integer.parseInt(str);
			System.out.println("El resultado de la raiz es: " + (Math.pow(num1, 1 / num2)));
			break;
		case 2:
			str = JOptionPane.showInputDialog("Introduzca la base: ");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca el exponente: ");
			num2 = Integer.parseInt(str);
			System.out.println("El resultado de la potencia es: " + (Math.pow(num1, num2)));
			break;
		case 3:
			str = JOptionPane.showInputDialog("Introduzca el dividendo numero: ");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca el divisor numero: ");
			num2 = Integer.parseInt(str);
			System.out.println("El resultado de la division es: " + (num1 / num2));
			break;
		case 0:
			return;
		}
		
	}

}

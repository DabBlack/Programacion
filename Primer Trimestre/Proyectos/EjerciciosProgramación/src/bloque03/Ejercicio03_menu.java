package bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_menu {

	public static void main(String[] args) {
		
		String str;
		int opcion;
		float cateto1, cateto2, hipotenusa;
		
		str = JOptionPane.showInputDialog("Introduzca una opcion" + "\n1.- Calculo de la hipotenusa de un triangulo." + "\n2.- Calculo de la superficie de una circunferencia." + "\n3.- C�lculo del perimetro de una circunferencia." +
				"\n4.- Calculo del area de un rectangulo" + "\n5.- Calculo del area de un triangulo." + "\n0.- Salir de la aplicacion");
		opcion = Integer.parseInt(str);
		
		switch(opcion) {
		case 1:
			str = JOptionPane.showInputDialog("Introduzca el radicando: ");
			cateto1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca el indice: ");
			cateto2 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca el indice: ");
			hipotenusa = Integer.parseInt(str);
			System.out.println("La longitud de la hipotenusa es: " + ();
			break;
//		case 2:
//			str = JOptionPane.showInputDialog("Introduzca la base: ");
//			num1 = Integer.parseInt(str);
//			str = JOptionPane.showInputDialog("Introduzca el exponente: ");
//			num2 = Integer.parseInt(str);
//			System.out.println("El resultado de la potencia es: " + (Math.pow(num1, num2)));
//			break;
//		case 3:
//			str = JOptionPane.showInputDialog("Introduzca el dividendo numero: ");
//			num1 = Integer.parseInt(str);
//			str = JOptionPane.showInputDialog("Introduzca el divisor numero: ");
//			num2 = Integer.parseInt(str);
//			System.out.println("El resultado de la division es: " + (num1 / num2));
//			break;
		case 0:
			return;
		}
	}

}

package bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_menu {

	public static void main(String[] args) {
		
		String str;
		int opcion, cateto1, cateto2;
		
		System.out.println("Menú");
		System.out.println("1.- Cálculo de la hipotenusa de un triángulo.");
		System.out.println("2.- Cálculo de la superficie de una circunferencia.");
		System.out.println("3.- Cálculo del perímetro de una circunferencia.");
		System.out.println("4.- Cálculo del área de un rectángulo.");
		System.out.println("5.- Cálculo del área de un triángulo.");
		System.out.println("0.- Salir de la aplicación");
		
		str = JOptionPane.showInputDialog("Introduzca la opción");
		opcion = Integer.parseInt(str);
		
//		switch(opcion) {
//		case 1:
//			str = JOptionPane.showInputDialog("Introduzca el valor del primer cateto");
//			cateto1 = Integer.parseInt(str)
//			str = JOptionPane.showInputDialog("Introduzca el valor del primer cateto");
//			cateto1 = Integer.parseInt(str)
//			System.out.println("La hipotenusa de este triángulo vale: " + (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
//			break;
//		case 2:
//			System.out.println("La superficie de esta circunferencia vale: " + ();
//			break;
//		case 3:
//			System.out.println("El perímetro de esta circunferencia vale: " + ();	
//			break;
//		case 4:
//			System.out.println("El área de este rectángulo vale: " + ();
//			break;
//		case 5:
//			System.out.println("El área de este triángulo vale: " + ();
//			break;
//		case 0:
//			return;
	}

}

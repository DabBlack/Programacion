package capitulo02_bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_menu {

	public static void main(String[] args) {
		
		String str;
		int opcion;
		float cateto1, cateto2, hipotenusa, pi = (float) 3.1416, radio, base, altura;
		
		do {
			
			str = JOptionPane.showInputDialog("Introduzca una opcion" + "\n1.- Calculo de la hipotenusa de un triangulo." + "\n2.- Calculo de la superficie de"
					+ " una circunferencia." + "\n3.- Calculo del perimetro de una circunferencia." + "\n4.- Calculo del area de un rectangulo" + 
					"\n5.- Calculo del area de un triangulo." + "\n0.- Salir de la aplicacion");
			
			opcion = Integer.parseInt(str);
			
			switch(opcion) {
			case 1:
				str = JOptionPane.showInputDialog("Introduzca el primer cateto: ");
				cateto1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca el segundo cateto: ");
				cateto2 = Integer.parseInt(str);
				hipotenusa = (float) (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
				System.out.println("El valor de la hipotenusa de este triangulo es: " + (Math.sqrt(hipotenusa)));
				break;
			case 2:
				str = JOptionPane.showInputDialog("Introduzca el radio: ");
				radio = Integer.parseInt(str);
				System.out.println("El valor del area de esta circunferencia es: " + pi * (Math.pow(radio, 2)));
				break;
			case 3:
				str = JOptionPane.showInputDialog("Introduzca la longitud del radio: ");
				radio = Integer.parseInt(str);
				System.out.println("El valor del perimetro de esta circunferencia es: " + 2 * pi * radio);
				break;
			case 4:
				str = JOptionPane.showInputDialog("Introduzca la longitud de la base: ");
				base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca la longitud de la altura: ");
				altura = Integer.parseInt(str);
				System.out.println("El valor del area de este rectangulo es: " + base * altura);
				break;
			case 5:
				str = JOptionPane.showInputDialog("Introduzca la longitud de la base: ");
				base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca la longitud de la altura: ");
				altura = Integer.parseInt(str);
				System.out.println("El valor del area de este triangulo es: " + (base * altura) / 2);
				break;
			case 0:
				System.out.println("El programa ha terminado correctamente.");
				return;
			default:
				System.out.println("Opcion incorrecta, seleccione una opcion correcta del menu");
			
			} 
		} while (opcion != 0);
	}
}

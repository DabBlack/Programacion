package capitulo02_bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("Introduzca un numero: "); //Se declara la variable str de tipo
		//String y se pide al usuario que introduzca un valor
		int var1 = Integer.parseInt(str);
		System.out.println("Primer numero introducido: " + var1); //Se muesra en pantalla el primer valor introducido
		
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: "); //Se pide al usuario que introduzca un valor
		int var2 = Integer.parseInt(str);
		System.out.println("Segundo numero introducido: " + var2); //Se muesra en pantalla el segundo valor introducido
		
		if (var1 < var2) {
			System.out.println("Numero menor: " + var1);
		}
	
		else {
			if (var2 < var1) {
				System.out.println("Numero menor: " + var2);
			}
			else {
				System.out.println("Son iguales");
			}
		
		}
		
	}

}

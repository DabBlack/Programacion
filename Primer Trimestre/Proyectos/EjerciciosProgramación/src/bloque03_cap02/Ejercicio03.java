package bloque03_cap02;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int num, multiplo;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del que se desee conocer sus multiplos: ")); 
		System.out.println("Numero introducido: " + num);
		
		for (int i = 0 ; i < 100 ; i++) {
			
			if (i % num != 0);
			System.out.println("Multiplos: ");
		}
		
	}

}

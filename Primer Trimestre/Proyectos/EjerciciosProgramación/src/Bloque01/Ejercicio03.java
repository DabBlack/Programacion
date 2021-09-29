package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero: ");
		int var1 = Integer.parseInt(str); //Pido el primer numero entero al usuario
		System.out.println("Número introducido: " + var1);
		
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: ");		
		int var2 = Integer.parseInt(str); //Pido el segundo numero entero al usuario
		System.out.println("Número introducido: " + var2);
		
		str = JOptionPane.showInputDialog("Introduzca un tercer numero: ");
		int var3 = Integer.parseInt(str); //Pido el tercer numero entero al usuario
		System.out.println("Número introducido: " + var3);
		
		int suma = var1 + var2 + var3; //Declaro la variable suma y sumo las tres variables anteriores
		
		System.out.println("Resultado de la suma: "+ suma);
			//Muestro el resultado de la suma de las tres variables en pantalla
		}

}

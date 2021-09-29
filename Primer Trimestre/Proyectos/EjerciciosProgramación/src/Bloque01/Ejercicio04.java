package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero: ");
		//Declaro una variable string y le pido al usuario que introduzca un valor
		int var1 = Integer.parseInt(str); //Declaro la variable var1 de tipo int
		System.out.println("Número introducido: " + var1);	
		
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: ");	
		//Pido el segundo numero entero al usuario
		int var2 = Integer.parseInt(str); //Declaro la variable var2 de tipo int
		System.out.println("Número introducido: " + var2);
		
		str = JOptionPane.showInputDialog("Introduzca un tercer numero: ");
		//Pido el tercer numero entero al usuario
		int var3 = Integer.parseInt(str); //Declaro la variable var3 de tipo int
		System.out.println("Número introducido: " + var3);
		
		int suma = var1 + var2 + var3; //Declaro la variable suma y sumo las tres variables anteriores
		
		System.out.println("Resultado de la media: "+ suma / 3);
			//Muestro en pantalla el resultado de la suma de las variables entre el número de variables 
			//variables existentes
		}
}
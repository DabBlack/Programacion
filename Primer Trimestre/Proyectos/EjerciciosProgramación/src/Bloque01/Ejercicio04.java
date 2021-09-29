package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero: ");
		int var1 = Integer.parseInt(str); //Pido el primer numero entero al usuario
			
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: ");		
		int var2 = Integer.parseInt(str); //Pido el segundo numero entero al usuario
				
		str = JOptionPane.showInputDialog("Introduzca un tercer numero: ");
		int var3 = Integer.parseInt(str); //Pido el tercer numero entero al usuario
				
		int suma = var1 + var2 + var3; //Declaro la variable suma y sumo las tres variables anteriores
		
		System.out.println("Resultado de la media: "+ suma / 3);
			//Muestro en pantalla el resultado de la suma de las variables entre el número de variables 
			//variables existentes
		}
}

package bloque03_cap01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
//		1º.- Realiza un programa que pida al usuario cuatro números enteros, y calcule la suma solo de aquellos números introducidos por el usuario, 
//		que sean mayores de 10. Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el programa debe calcular la suma solo de 15 más 25, 
//		ya que 5 y 6 son menores de 10.
		//String str;
		int num, suma = 0;
				
		for (int i = 0;  i < 4 ;i ++) {
			
			Scanner sc = new Scanner (System.in);
		//	str = JOptionPane.showInputDialog("Indroduzca un numero: ");
			num = sc.nextInt();
		//	num = Integer.parseInt(str);
			System.out.println("Valor de: " + num);
			if (num > 10) {
				suma += num;
			}
			System.out.println("Suma: " + suma);
			
		}
		
		
		
		
		
	}

}

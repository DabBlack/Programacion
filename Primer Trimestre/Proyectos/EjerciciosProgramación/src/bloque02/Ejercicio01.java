package bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un primer numero: "); //Se declara la variable str de
		//tipo String y se pide al usuario que introduzca un valor
		int var1 = Integer.parseInt(str); //Se declara la variable var1 de tipo int
		
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: "); //Se pide al usuario que introduzca un valor
		int var2 = Integer.parseInt(str); //Se declara la variable var2 de tipo int
		
		str = JOptionPane.showInputDialog("Introduzca un tercer numero: "); //Se pide al usuario que introduzca un valor
		int var3 = Integer.parseInt(str); //Se declara la variable var3 de tipo int
		
		str = JOptionPane.showInputDialog("Introduzca cuarto un numero: "); //Se pide al usuario que introduzca un valor
		int var4 = Integer.parseInt(str); //Se declara la variable var4 de tipo int
		
		str = JOptionPane.showInputDialog("Introduzca quinto un numero: "); //Se pide al usuario que introduzca un valor
		int var5 = Integer.parseInt(str); //Se declara la variable var5 de tipo int
		
		System.out.println("Primer valor: " + var1 + "\nSegundo valor: " + var2 + "\nTercer valor: " + var3 +
				"\nCuarto valor: " + var4 + "\nQuinto valor: " + var5);
		
		if (var1 < 0 || var2 < 0 || var3 < 0 || var4 < 0 || var5 < 0) {
			System.out.println("Numeros negativos: " + var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", " + var5);
		}
		
		
		
	}

}

package capitulo02_bloque02;

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
		
		int negativos = 0;
		int bajos = 0;
		int medios = 0;
		int grandes = 0;
		
		//Primer numero
		
		if (var1 < 0) {
			negativos = negativos + var1;
		}
			
			else {
				if (var1 >= 0 && var1 <=25) {
					bajos = bajos + var1;
			}
				
				else {
					if (var1 >= 26 && var1 <=250) {
						medios = medios + var1;
				}
					
					else {
						grandes = grandes + var1;
					}
				}
			}
		
		//Segundo numero
		
		if (var2 < 0) {
			negativos = negativos + var2;
		}
					
			else {
				if (var2 >= 0 && var2 <=25) {
					bajos = bajos + var2;
			}
						
				else {
					if (var2 >= 26 && var2 <=250) {
						medios = medios + var2;
				}
							
					else {
						grandes = grandes + var2;
					}
				}
			}

		//Tercer numero
		
		if (var3 < 0) {
			negativos = negativos + var3;
		}
					
			else {
				if (var3 >= 0 && var3 <=25) {
					bajos = bajos + var3;
			}
						
				else {
					if (var3 >= 26 && var3 <=250) {
						medios = medios + var3;
				}
							
					else {
						grandes = grandes + var3;
					}
				}
			}

		//Cuarto numero
		
		if (var4 < 0) {
			negativos = negativos + var4;
		}
					
			else {
				if (var4 >= 0 && var4 <=25) {
					bajos = bajos + var4;
			}
				
				else {
					if (var4 >= 26 && var4 <=250) {
						medios = medios + var4;
				}
							
					else {
						grandes = grandes + var4;
					}
				}
			}

		//Quinto numero
		
		if (var5 < 0) {
			negativos = negativos + var5;
		}
					
			else {
				if (var5 >= 0 && var5 <=25) {
					bajos = bajos + var5;
			}
						
				else {
					if (var5 >= 26 && var5 <=250) {
						medios = medios + var5;
				}
							
					else {
						grandes = grandes + var5;
					}
				}
			}
		
		System.out.println("Suma de los numeros negativos: " + negativos + "\nSuma de los numeros bajos: " + bajos + "\nSuma de los numeros medios: "
							+ medios + "\nSuma de los numeros grandes " + grandes);
		
	}
}

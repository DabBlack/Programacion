package capitulo03_bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int num, reps, numMayor = 0, numMenor = 0;
		String introducir = "Introduzca un numero: ", introducido = "Numero introducido: ";
		
		reps = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros que desea introducir: "));
		System.out.println("Cantidad de numeros que se van a introducir: " + reps);
		
		for (int i = 0 ; i < reps ; i++) {
			
			if (i == 0) { //Primera interaccion
				num = Integer.parseInt(JOptionPane.showInputDialog(introducir)); 
				System.out.println(introducido + num);
				numMayor = num;
				numMenor = num;
			}
			else { //Resto de interacciones
				num = Integer.parseInt(JOptionPane.showInputDialog(introducir)); 
				System.out.println(introducido + num);
				if (num > numMayor) {
					numMayor = num;
				}
				else if (num < numMenor){
						numMenor = num;
				}
			}
		}
		
		System.out.println("Numero mayor: " + numMayor + "\nNumero menor: " + numMenor);
		
	}

}

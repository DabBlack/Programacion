package bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04_monedas {

	public static void main(String[] args) {
	
		String str;
		int precio, pago, cambio;
		
		str = JOptionPane.showInputDialog("Introduzca el precio total a pagar:");
		precio = Integer.parseInt(str);
		System.out.println("Precio a pagar: " + precio + " unidades");
		
		str = JOptionPane.showInputDialog("Introduzca el pago correspondiente");
		pago = Integer.parseInt(str);
		System.out.println("Pago realizado de: " + pago + " unidades");
		
		cambio = pago - precio;
		if (pago < precio) {
			System.out.println("Importe incorrecto, vuelva a introducir un importe");
			return;
		}
			else {
				System.out.println("El cambio es de: " + cambio + " unidades");
			}
		
		do {
			if (cambio > 100) {
				System.out.println("Unidades monetarias de 100 a devolver: " + (cambio - 100 ) + 1);
			}
				else if (cambio > 50) {
					System.out.println("Unidades monetarias de 50 a devolver: " + (cambio - 50 ) + 1);
				}
					else if (cambio > 25) {
						System.out.println("Unidades monetarias de 25 a devolver: " + (cambio - 25 ) + 1);
					}
					else if (cambio > 5) {
						System.out.println("Unidades monetarias de 5 a devolver: " + (cambio - 5 ) + 1);
					}
						else if (cambio > 1){
							System.out.println("Unidades mnetarias de 1 a devolver: " + (cambio - 1 ) + 1);
						}
		} while (cambio != 0);

			
			
		
//		do {
//			str = JOptionPane.showInputDialog("Introduzca el pago correspondiente");
//			pago = Integer.parseInt(str);
//			System.out.println("Pago realizado de: " + pago + " unidades");
//			
//			if (pago < precio) {
//				System.out.println("Importe incorrecto, vuelva a introducir un importe");
//				str = JOptionPane.showInputDialog("Introduzca el pago correspondiente");
//				pago = Integer.parseInt(str);
//				
//			}
//		
//		} while (pago < precio);
//		
	}

}

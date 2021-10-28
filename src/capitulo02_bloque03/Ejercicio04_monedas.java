package capitulo02_bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04_monedas {

	public static void main(String[] args) {
	
		String str;
		int precio, pago, cambio, devolver1 = 0, devolver2 = 0, devolver3 = 0, devolver4 = 0, devolver5 = 0, resto = 0;
		
		str = JOptionPane.showInputDialog("Introduzca el precio total a pagar:");
		precio = Integer.parseInt(str);
		System.out.println("Precio a pagar: " + precio + " unidades");
		
		str = JOptionPane.showInputDialog("Introduzca el pago correspondiente:");
		pago = Integer.parseInt(str);
		System.out.println("Pago realizado de: " + pago + " unidades");
		
		cambio = pago - precio;
		if (pago < precio) {
			System.out.println("El cambio es de: " + cambio + " unidades");
			System.out.println("Importe incorrecto, vuelva a introducir un importe.");
			return;
		}
			else {
				System.out.println("El cambio es de: " + cambio + " unidades");
			}
		
		if (pago == precio) {
			System.out.println("Importe abonado correctamente sin necesidad de cambio.");
		}
		
		if (cambio > 0) {
			devolver1 = cambio / 100;
			System.out.println(devolver1 + " Monedas de 100: " + devolver1 * 100);
			resto = cambio - devolver1 * 100;
		}
		
		if (resto > 0) {
			devolver2 = resto / 50;
			System.out.println(devolver2 + " Monedas de 50: " + devolver2 * 50);
			resto = cambio - (devolver2 * 50) - (devolver1 * 100);
		}
		
		if (resto > 0) {
			devolver3 = resto / 25;
			System.out.println(devolver3 + " Monedas de 25: " + devolver3 * 25);
			resto = cambio - (devolver3 * 25) - (devolver2 * 50) - (devolver1 * 100);
		}
		if (resto > 0) {
			devolver4 = resto / 5;
			System.out.println(devolver4 + " Monedas de 5: " + devolver4 * 5);
			resto = cambio - (devolver4* 5) - (devolver3 * 25) - (devolver2 * 50) - (devolver1 * 100);
		}
		
		if (resto > 0) {
			devolver5 = resto / 1;
			System.out.println(devolver5 + " Monedas de 1: " + devolver5 * 1);
			resto = cambio - (devolver5 * 1) - (devolver4 * 5) - (devolver3 * 25) - (devolver2 * 50) - (devolver1 * 100);
			System.out.println("El cambio y el pago han sido abonados correctamente.");
		}
		
	}

}

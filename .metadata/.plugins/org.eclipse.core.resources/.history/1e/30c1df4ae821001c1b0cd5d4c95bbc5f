package bloque01;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("El valor del Euribor es: "); //Se declara la variable String y se pide al usuario el valor del euribor
		float euribor = Float.parseFloat(str); //Se declara la variable euribor de tipo float
		
		str = JOptionPane.showInputDialog("El Diferencial es: "); //Se pide al usuario el valor del diferencial
		float diferencial = Float.parseFloat(str); //Se declara la variable diferencial de tipo float
		
		float Ia = euribor + diferencial; //Se declara la variable Ia de tipo float, asignandole el valor del resultado de la suma de la variable euribot + diferencial
		System.out.println("El Interes Anual es de: " + Ia);
		
		float Im = ((Ia / 12) / 100); //Se declara la variable Im de tipo float, asignandole el valor de la operacion indicada
		System.out.println("El valor del Interes Mensual es de: " + Im); //Se muestra en pantalla el valor del interes mensual
		
		str = JOptionPane.showInputDialog("El capital es: "); //Se pide al usuario que introduzca el valor del capital
		float capital = Float.parseFloat(str); //Se declara la variable capital de tipo float
		
		str = JOptionPane.showInputDialog("El numero de plazos mensuales es de: "); //Se pide al usuario que introduzca el numero de plazos mensuales de la hipoteca
		float nplazos = Float.parseFloat(str); //Se declara la variable nplazos de tipo float
		
		double cuotamensual = capital * ((Im + Math.pow(1 + Im, nplazos)) / Math.pow(1 + Im, nplazos) - 1);
		//Se declara la variable cuotamensual de tipo double, asignandole el valor de la operacion indicada
		System.out.println("Cuota mensual a pagar: " + cuotamensual); //Se muestra en pantalla la cuota mensual a pagar
	}
}

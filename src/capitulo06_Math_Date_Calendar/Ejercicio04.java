package capitulo06_Math_Date_Calendar;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		String str;

		str = JOptionPane.showInputDialog("Introduzca una fecha válida, por favor: ");

		parseoFecha();
		fechaTipoCalendar();
		camposIndividualizados();
		calculosFechas();
	}

	/**
	 * 
	 */
	public static void parseoFecha() {
		Date fechaIntroducida = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Fecha introducida: " + sdf.format(fechaIntroducida));
	}

	
	/**
	 * 
	 */
	public static void fechaTipoCalendar() {
		Calendar fechaCalendar = new GregorianCalendar();

		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		System.out.println("\nMisma fecha pero sacada de Calendar: " + fechaAPartirDeCalendar);
	}

	
	/**
	 * 
	 */
	public static void camposIndividualizados() {
		Calendar fechaCalendar = Calendar.getInstance();
		Date fechaDate = new Date(fechaCalendar.getTimeInMillis());
		
		System.out.println("\nAño tipo Calendar: " + fechaCalendar.get(Calendar.YEAR));

		System.out.println("\nMes tipo Calendar: " + fechaCalendar.get(Calendar.MONTH));

		System.out.println("\nDía tipo Calendar: " + fechaCalendar.get(Calendar.DAY_OF_MONTH));

		System.out.println("\nHora tipo Calendar: " + fechaCalendar.get(Calendar.HOUR_OF_DAY));

		System.out.println("\nMinuto tipo Calendar: " + fechaCalendar.get(Calendar.MINUTE));

		System.out.println("\nSegundo tipo Calendar: " + fechaCalendar.get(Calendar.SECOND));
	}


	/**
	 * 
	 */
	public static void calculosFechas() {
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("\nDentro de 3 días: " + ahora.getTime());
		
		System.out.println("\nDos semanas antes: " + ahora.getTime());
		
		ahora.add(Calendar.DAY_OF_YEAR, 300);
		System.out.println("\nDentro de 300 días: " + ahora.getTime());
		
		ahora.add(Calendar.YEAR, 4);
		System.out.println("\nDentro de 4 años: " + ahora.getTime());
	}

}

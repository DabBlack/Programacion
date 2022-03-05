package capitulo06_Math_Date_Calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		String str;

		str = JOptionPane.showInputDialog("Introduzca una fecha con el siguiente formato ''dd/MM/yyyy HH:mm:ss'', por favor: ");

		System.out.println("\t- Fecha introducida por el usuario: \n");
		fechaDateYFechaCalendar(str);

		System.out.println("\n\t- Campos individualizados: \n");
		camposIndividualizados();

		System.out.println("\n\t-Cálculos de fechas: \n");
		calculosFechas();
	}

	
	/**
	 * 
	 * @param str
	 */
	public static void fechaDateYFechaCalendar(String str) {
		Date fechaIntroducida = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		try {
			fechaIntroducida = sdf.parse(str);
		} catch (ParseException e) {
			System.out.println("Error en el parseo, el formato de fecha válido es  (dd/MM/yyyy HH:mm:ss)");
		}
		System.out.println("La fecha en tipo Date es: " + sdf.format(fechaIntroducida));

		// Creamos una fecha de tipo Calendar
		Calendar fechaCalendar = new GregorianCalendar();

		// Le asignamos el tiempo de fecha de tipo Date

		fechaCalendar.setTime(fechaIntroducida);

		// Imprimimos la fecha de tipo Calendar
		System.out.println("La fecha en tipo Calendar es: " + fechaCalendar.getTime());

	}

	
	/**
	 * 
	 */
	public static void camposIndividualizados() {
		Calendar fechaCalendar = Calendar.getInstance();
		Date fechaDate = new Date(fechaCalendar.getTimeInMillis());
		
		// Año
		SimpleDateFormat anio = new SimpleDateFormat("yyyy");
		System.out.println("Año tipo Date: " + anio.format(fechaDate));
		System.out.println("Año tipo Calendar: " + fechaCalendar.get(Calendar.YEAR));
	
		// Mes
		SimpleDateFormat mes = new SimpleDateFormat("M");
		System.out.println("\nMes tipo Date: " + mes.format(fechaDate));
		System.out.println("Mes tipo Calendar: " + fechaCalendar.get(Calendar.MONTH));
	
		// Dia
		SimpleDateFormat dia = new SimpleDateFormat("dd");
		System.out.println("\nDía tipo Date: " + dia.format(fechaDate));
		System.out.println("Día tipo Calendar: " + fechaCalendar.get(Calendar.DAY_OF_MONTH));
		
		// Hora
		SimpleDateFormat hora = new SimpleDateFormat("HH");	
		System.out.println("\nHora tipo Date: " + hora.format(fechaDate));
		System.out.println("Hora tipo Calendar: " + fechaCalendar.get(Calendar.HOUR_OF_DAY));
			
		// Minuto
		SimpleDateFormat minuto = new SimpleDateFormat("mm");
		System.out.println("\nMinuto tipo Date: " + minuto.format(fechaDate));
		System.out.println("Minuto tipo Calendar: " + fechaCalendar.get(Calendar.MINUTE));
		
		// Segundo
		SimpleDateFormat segundo = new SimpleDateFormat("ss");
		System.out.println("\nSegundo tipo Date: " + segundo.format(fechaDate));
		System.out.println("Segundo tipo Calendar: " + fechaCalendar.get(Calendar.SECOND));
	}

	
	/**
	 * 
	 */
	public static void calculosFechas() {
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Dentro de 3 días: " + ahora.getTime());

		ahora.add(Calendar.WEEK_OF_YEAR, -2);
		System.out.println("Dos semanas antes: " + ahora.getTime());

		ahora.add(Calendar.DAY_OF_YEAR, 300);
		System.out.println("Dentro de 300 días: " + ahora.getTime());

		ahora.add(Calendar.YEAR, 4);
		System.out.println("Dentro de 4 años: " + ahora.getTime());
	}
	
}

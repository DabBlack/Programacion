package capitulo06_Math_Date_Calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Roma
		Calendar ahoraRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		System.out.println("Hora actual en Roma: " + ahoraRoma.get(Calendar.HOUR_OF_DAY) + "h");
		
		// Washinton
		Calendar ahoraWashintong = Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT+5"));
		System.out.println("\nHora actual en Washintong: " + ahoraWashintong.get(Calendar.HOUR_OF_DAY)  + "h");
		
		// Diferencia horaria entre Roma e Italia
		Calendar diferenciahoraria = Calendar.getInstance();
		
		diferenciahoraria.set(Calendar.HOUR_OF_DAY, (ahoraRoma.get(Calendar.HOUR_OF_DAY) - ahoraWashintong.get(Calendar.HOUR_OF_DAY)));
		
		System.out.println("\nLa diferencia horaria entre Roma y Washintong es: " + diferenciahoraria.get(Calendar.HOUR_OF_DAY)  + "h");
	
	}
}

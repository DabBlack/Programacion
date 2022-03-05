package capitulo06_Math_Date_Calendar;

public class Ejercicio02 {

	public static void main(String[] args) {
		
				double pi = 0;
				int signo = 1;
				double division;

				for (int i = 1; i < 1000000; i += 2) {
					division = 4f / i;
					pi += signo * division;
					signo *= -1;
				}

				System.out.println("El valor del número pi es: " + pi);

			}

}

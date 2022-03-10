package examen_03_12_2021;

public class Ejercicio_C {

	public static void main(String[] args) {
		float array[] = new float[10];	
		
		rafanacci(array);
		
		System.out.println("Serie de Rafanacci: " + "\n");
		
		mostrarArray(array);
	}

	public static void rafanacci(float array[]) {
		float dosAnteriores = 0;
		float mitadDelAnterior = 0;
		for (int i = 0; i < 2; i++) {
			array[i] = i;
		}
		
		for (int i = 2; i < array.length; i++) {
			dosAnteriores = (array[i - 1] * array[i - 2]);
			mitadDelAnterior = array[i - 1] / 2;
			array[i] = dosAnteriores + mitadDelAnterior;
		}
	}
	
	public static void mostrarArray(float array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
	}
	
}

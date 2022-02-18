package capitulo06_wrappers;

public class Ejercicio03_100PrimerosNumerosEnterosEnHexadecimal {

	public static void main(String[] args) {
		// El metodo Integer.toHexString convierte los numeros decimales en hexadecimales
		for (int i = 0; i < 100; i++) {
			System.out.println(Integer.toHexString(i));
		}
	}

}

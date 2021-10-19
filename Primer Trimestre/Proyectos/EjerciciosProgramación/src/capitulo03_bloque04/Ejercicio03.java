package capitulo03_bloque04;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int num = 1, resultado = 0, i = 0;

		do  {
			while (i <= 10) {
				
				resultado = num * i;
				System.out.println(num + "x" + i + "=" + resultado);
				i++;
			} 
			num++;
			i = 0;
			System.out.println(" ");
		}  while (num <= 15);
	}

}


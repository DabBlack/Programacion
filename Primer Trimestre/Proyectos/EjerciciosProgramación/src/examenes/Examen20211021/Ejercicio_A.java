package examenes.Examen20211021;

public class Ejercicio_A {

	public static void main(String[] args) {
		
		int num;
		
		for (int i = 0; i < 10; i++){
			
			num = (int) Math.round(Math.random() * 100);
			
			System.out.println(num);
		
			if (num % 2 == 1) {
				System.out.println("Numeros impares: " + num);
			}
		
		}
		
	}

}

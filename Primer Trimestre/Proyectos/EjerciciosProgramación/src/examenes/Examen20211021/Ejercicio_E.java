package examenes.Examen20211021;

public class Ejercicio_E {

	public static void main(String[] args) {
		
		int num = 0, limite = 7;
	
		
		for (int i = 0; i < 100; i++){
			
			num = (int) Math.round(Math.random() * 100);
			
			System.out.println(num);
			
			if (num == limite) {
				do {
					System.out.println(" Este numero acaba en 7 " + "\n");
					limite = limite + 10;
					
				} while(num == limite);
			}
		}

	}

}

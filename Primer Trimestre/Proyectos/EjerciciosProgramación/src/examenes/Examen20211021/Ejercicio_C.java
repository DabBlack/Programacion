package examenes.Examen20211021;

public class Ejercicio_C {

	public static void main(String[] args) {
		
		int num, limiteSuperior30 = 30, limiteInferior20 = 20, limiteSuperior50 = 50, limiteInferior40 = 40;
		
		for (int i = 0; i < 10; i++){
			
		num = (int) (Math.round(Math.random() * (limiteSuperior30 - limiteInferior20)) + limiteInferior20);
		
		if (num % 2 == 0)
			System.out.println("Numero generado: " + num);
		
		}
		
		for (int i = 0; i < 10; i++){
			
			num = (int) (Math.round(Math.random() * (limiteSuperior50 - limiteInferior40)) + limiteInferior40);
			
			if (num % 2 == 0)
				System.out.println("Numero generado: " + num);
			
			}
		
	}

}

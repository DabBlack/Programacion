package examen03122021;

public class Ejercicio_D {

	public static void main(String[] args) {
		char frase[] = new char[] {'H','o','l','a',' ','M','u','n','d','o'};
		
		System.out.println("Array Original: " + "\n");
		
		mostrarArray(frase);
		
		System.out.println("\n" + "\n" + "Array traducido a minusculas: " + "\n");
	}

	public static String minusculas(char frase[]) {
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == (int) 65) {
				
			}	
		}
		
		return null;
	}
	
	public static void mostrarArray(char frase[]) {
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i] + " ");
		}
	}
	
}

package fibonacci;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {

        fibonacciOriginal(2, 3, 6);
    }

    public static void fibonacciOriginal(int n1, int n2, int rep) {
        for (int i = 0; i < rep; i++) { //iniciamos for para que en cada iteración se sume el elemento
            int next = n1+n2;
            System.out.println(next + " "); //Imprimimos los valores 
            n1 = n2;
            n2 = next;
        }

	}

}

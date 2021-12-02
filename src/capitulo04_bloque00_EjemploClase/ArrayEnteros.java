package capitulo04_bloque00_EjemploClase;

public class ArrayEnteros {

	private NumeroEntero array[] = new NumeroEntero[100];

	/**
	 * 
	 */
	public ArrayEnteros() {
		//Esto tambien se puede declarar aqui o arriba
//		array = new NumeroEntero[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = new NumeroEntero();
		}
	}

	/**
	 * @param array
	 */
	public ArrayEnteros(NumeroEntero[] array) {
		this.array = array;
	}

	public void mostrar() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "");
		}
	}
	
	
	/**
	 * @return the array
	 */
	public NumeroEntero[] getArray() {
		return array;
	}

	/**
	 * @param array the array to set
	 */
	public void setArray(NumeroEntero[] array) {
		this.array = array;
	}
	
	
	
}

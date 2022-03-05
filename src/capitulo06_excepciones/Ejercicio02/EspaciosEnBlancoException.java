package capitulo06_excepciones.Ejercicio02;

public class EspaciosEnBlancoException extends Exception {
	
	/**
	 * 
	 */
	public EspaciosEnBlancoException() {
	}

	/**
	 * @param message
	 */
	public EspaciosEnBlancoException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public EspaciosEnBlancoException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EspaciosEnBlancoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EspaciosEnBlancoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}

package capitulo06_excepciones.Ejercicio01;

public class NumeroNoParException extends Exception {
	
	/**
	 * 
	 */
	public NumeroNoParException() {
	}

	/**
	 * @param message
	 */
	public NumeroNoParException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public NumeroNoParException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NumeroNoParException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public NumeroNoParException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);	
	}
	
}

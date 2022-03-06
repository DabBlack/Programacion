package capitulo06_excepciones.Ejercicio02;

public class PalabraBombillaException extends Exception {
	
	/**
	 * 
	 */
	public PalabraBombillaException() {
	}

	/**
	 * 
	 * @param message
	 */
	public PalabraBombillaException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param cause
	 */
	public PalabraBombillaException(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public PalabraBombillaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PalabraBombillaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}

package capitulo06_excepciones.Ejercicio02;

public class PalabraOfensivaException extends Exception {
	
	/**
	 * 
	 */
	public PalabraOfensivaException() {
	}

	/**
	 * 
	 * @param message
	 */
	public PalabraOfensivaException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param cause
	 */
	public PalabraOfensivaException(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public PalabraOfensivaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PalabraOfensivaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

package capitulo06_excepciones.Ejercicio02;

public class MenosDe3CaracteresException extends Exception {
	
	/**
	 * 
	 */
	public MenosDe3CaracteresException() {
	}

	/**
	 * 
	 * @param message
	 */
	public MenosDe3CaracteresException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param cause
	 */
	public MenosDe3CaracteresException(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public MenosDe3CaracteresException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MenosDe3CaracteresException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}

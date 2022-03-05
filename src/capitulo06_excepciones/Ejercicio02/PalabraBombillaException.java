package capitulo06_excepciones.Ejercicio02;

public class PalabraBombillaException extends Exception {
	
	public PalabraBombillaException() {
	}

	public PalabraBombillaException(String message) {
		super(message);
	}

	public PalabraBombillaException(Throwable cause) {
		super(cause);
	}

	public PalabraBombillaException(String message, Throwable cause) {
		super(message, cause);
	}

	public PalabraBombillaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}

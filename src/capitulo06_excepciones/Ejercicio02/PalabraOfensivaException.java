package capitulo06_excepciones.Ejercicio02;

public class PalabraOfensivaException extends Exception {
	
	public PalabraOfensivaException() {
	}

	public PalabraOfensivaException(String message) {
		super(message);
	}

	public PalabraOfensivaException(Throwable cause) {
		super(cause);
	}

	public PalabraOfensivaException(String message, Throwable cause) {
		super(message, cause);
	}

	public PalabraOfensivaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

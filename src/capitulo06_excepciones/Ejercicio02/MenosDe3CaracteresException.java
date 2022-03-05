package capitulo06_excepciones.Ejercicio02;

public class MenosDe3CaracteresException extends Exception {
	
	public MenosDe3CaracteresException() {
	}

	public MenosDe3CaracteresException(String message) {
		super(message);
	}

	public MenosDe3CaracteresException(Throwable cause) {
		super(cause);
	}

	public MenosDe3CaracteresException(String message, Throwable cause) {
		super(message, cause);
	}

	public MenosDe3CaracteresException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}

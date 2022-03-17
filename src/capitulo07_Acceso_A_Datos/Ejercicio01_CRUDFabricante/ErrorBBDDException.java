package capitulo07_Acceso_A_Datos.Ejercicio01_CRUDFabricante;

public class ErrorBBDDException extends Exception {

	public ErrorBBDDException() {
	}

	public ErrorBBDDException(String arg0) {
		super(arg0);
	}

	public ErrorBBDDException(Throwable arg0) {
		super(arg0);
	}

	public ErrorBBDDException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ErrorBBDDException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}

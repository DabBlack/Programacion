package simulacionExamenSpaceInvader;

public class Principal {

	public static void main(String[] args) {
		
		// Con esta línea se inicializa el campo de batalla
		CampoBatalla.getInstance().mezclarArray(CampoBatalla.getInstance().getHumanos());
		CampoBatalla.getInstance().mezclarArray(CampoBatalla.getInstance().getMalvados());

		// Se realiza la batalla
		CampoBatalla.getInstance().comienzaBatalla();
	}

}

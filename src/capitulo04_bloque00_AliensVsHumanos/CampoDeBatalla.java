package capitulo04_bloque00_AliensVsHumanos;

public class CampoDeBatalla {
	
	private Humano arrayHumanos[] = new Humano[5];
	private Alien arrayAliens[] = new Alien[5];
	
	public CampoDeBatalla() {
		for (int i = 0; i < arrayAliens.length; i++) {
			arrayAliens[i] = new Alien();
		}
		
		Alien ultimoAlien = arrayAliens[arrayAliens.length - 1];
		ultimoAlien.setVida(ultimoAlien.getVida() * 10);
	}
	
	
	
}
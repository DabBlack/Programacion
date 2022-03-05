package capitulo06_excepciones.Ejercicio02;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		try {
			pedirFrase();
		}
		catch(EspaciosEnBlancoException e) {
			System.out.println(e.getMessage());
			
		}
		catch(MenosDe3CaracteresException e) {
			System.out.println(e.getMessage());
		}
		catch(PalabraOfensivaException e) {
			System.out.println(e.getMessage());
		}
		catch(PalabraBombillaException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	/**
	 * 
	 * @throws EspaciosEnBlancoException
	 * @throws MenosDe3CaracteresException
	 * @throws PalabraBombillaException
	 * @throws PalabraOfensivaException
	 */
	public static void pedirFrase() throws EspaciosEnBlancoException, MenosDe3CaracteresException, PalabraBombillaException, PalabraOfensivaException{
		String str;
		str = JOptionPane.showInputDialog("Introduzca una frase:");
		
		String bombilla = new String("bombilla");
		String tonto = new String ("tonto");
		String tonta = new String("tonta");
		String idiota = new String ("idiota");
		
		
		for (int i = 0; i < str.length(); i++) {
			if(str.trim() == " ") {
				throw new EspaciosEnBlancoException("No se admiten solo espacios en la frase.");
				
			}
			else {
				if(str.length() < 3) {
					throw new MenosDe3CaracteresException("La longitud mínima admitida es 3 caracteres.");
					
				}
				else {
					if(str.equals(tonto) || str.equals(idiota) || str.equals(tonta)) {
						throw new PalabraOfensivaException("No se admiten palabras ofensivas.");
					}
					else {
						if(!str.equals(bombilla)) {
							throw new PalabraBombillaException("La frase debe contener la palabra bombilla para que sea válida.");
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}

}

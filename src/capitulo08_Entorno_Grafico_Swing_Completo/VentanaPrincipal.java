package capitulo08_Entorno_Grafico_Swing_Completo;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import capitulo08_Entorno_Grafico_Swing_Completo.utils.Apariencia;
import capitulo08_Entorno_Grafico_Swing_Completo.vista.CRUD_Cliente;
import capitulo08_Entorno_Grafico_Swing_Completo.vista.CRUD_Coche;
import capitulo08_Entorno_Grafico_Swing_Completo.vista.CRUD_Concesionario;
import capitulo08_Entorno_Grafico_Swing_Completo.vista.CRUD_Fabricante;
import capitulo08_Entorno_Grafico_Swing_Completo.vista.CRUD_Venta;

public class VentanaPrincipal extends JFrame {

	
	static {
		Apariencia.setAparienciasOrdenadas(Apariencia.aparienciasOrdenadas);
	}

	/**
	 * 
	 */
	public VentanaPrincipal() {
		super("JComponents Avanzados");
		this.setBounds(0, 0, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(getTabbedPane(), BorderLayout.CENTER);
	}

	/**
	 * 
	 * @return
	 */
	private JTabbedPane getTabbedPane() {
		JTabbedPane tabbedPane = new JTabbedPane();

		tabbedPane.add("Fabricantes", new CRUD_Fabricante());
		tabbedPane.add("Coches", new CRUD_Coche());
		tabbedPane.add("Concesionarios", new CRUD_Concesionario());
		tabbedPane.add("Clientes", new CRUD_Cliente());
		tabbedPane.add("Ventas", new CRUD_Venta());

		return tabbedPane;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

}

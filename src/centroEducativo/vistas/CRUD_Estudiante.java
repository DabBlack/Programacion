package centroEducativo.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;


public class CRUD_Estudiante extends JPanel {

	/**
	 * Create the panel.
	 */
	public CRUD_Estudiante() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		JButton button = new JButton("<<");
		toolBar.add(button);
		
		JButton button_1 = new JButton("<");
		toolBar.add(button_1);
		
		JButton button_2 = new JButton(">");
		toolBar.add(button_2);
		
		JButton button_3 = new JButton(">>");
		toolBar.add(button_3);
		
		JButton btnNuevo = new JButton("Nuevo");
		toolBar.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		toolBar.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		toolBar.add(btnEliminar);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);

	}

}
	
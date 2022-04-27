package centroEducativo.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolBar;

import centroEducativo.controladores.ControladorEstudiante;
import centroEducativo.entidades.Estudiante;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class CRUD_Estudiante extends JPanel {

	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JButton btnEliminar;
	private CRUD_PanelDatosPersonales panelDatosPersonales = new CRUD_PanelDatosPersonales();
	
	
	/**
	 * Create the application.
	 */
	public CRUD_Estudiante() {
		initialize();
		mostrarEstudiante(ControladorEstudiante.findPrimerEstudiante());
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEstudiante(ControladorEstudiante.findPrimerEstudiante());
			}
		});
		toolBar.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEstudiante(ControladorEstudiante.findAnteriorEstudiante(panelDatosPersonales.getId()));
			}
		});
		toolBar.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEstudiante(ControladorEstudiante.findAnteriorEstudiante(panelDatosPersonales.getId()));
			}
		});
		toolBar.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarEstudiante(ControladorEstudiante.findUltimoEstudiante());
			}
		});
		toolBar.add(btnUltimo);
		
		btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarDatos();
			}
		});
		btnNuevo.setIcon(new ImageIcon(CRUD_Estudiante.class.getResource("/centroEducativo/res/nuevo.png")));
		toolBar.add(btnNuevo);
		
		btnGuardar = new JButton("");

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarEstudiante();
			}
		});
		btnGuardar.setIcon(new ImageIcon(CRUD_Estudiante.class.getResource("/centroEducativo/res/guardar.png")));
		toolBar.add(btnGuardar);
		
		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarEstudiante();
			}
		});
		btnEliminar.setIcon(new ImageIcon(CRUD_Estudiante.class.getResource("/centroEducativo/res/eliminar.png")));
		toolBar.add(btnEliminar);
		
		add(panelDatosPersonales, BorderLayout.CENTER);

	}


	/**
	 * Guardado, puede ser un alta nueva o una modificación
	 */
	private void guardarEstudiante() {
		Estudiante a = new Estudiante();

		a.setNombre(panelDatosPersonales.getNombre());
		a.setApellido1(panelDatosPersonales.getPrimerApellido());
		a.setApellido2(panelDatosPersonales.getSegundoApellido());
		a.setDni(panelDatosPersonales.getDni());
		a.setDireccion(panelDatosPersonales.getDireccion());
		a.setEmail(panelDatosPersonales.getEmail());
		a.setTelefono(panelDatosPersonales.getTelefono());
		
		if (ControladorEstudiante.guardarEstudiante(a) == 1) {
			panelDatosPersonales.setId(a.getId());
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
		}
		else {
			JOptionPane.showMessageDialog(null, "Error, no se ha podido guardar");
		}
	}
	
	/**
	 * Eliminación 
	 */
	private void eliminarEstudiante() {
		String posiblesRespuestas[] = {"Sí","No"};
		// Utilizo un JOptionPane para preguntar si realmente se desea eliminar un registro
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea eliminar?", "Confirmar eliminación", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, new ImageIcon(CRUD_Estudiante.class.getResource("/centroEducativo/res/confirm.png")), 
		        posiblesRespuestas, posiblesRespuestas[1]);
	    
		// Si se confirma que se desea eliminar, se procede a ello
		if(opcionElegida == 0) {
			int idActual = (panelDatosPersonales.getId());
			boolean existeAnterior = ControladorEstudiante.findAnteriorEstudiante(idActual) != null;
			boolean existeSiguiente = ControladorEstudiante.findSiguienteEstudiante(idActual) != null;
			
			if (ControladorEstudiante.eliminarEstudiante(idActual) == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				// Ahora debo navegar, una vez he borrado el registro, al registro anterior
				if (existeAnterior) {
					mostrarEstudiante(ControladorEstudiante.findAnteriorEstudiante(idActual));
				}
				else {
					if (existeSiguiente) {
						mostrarEstudiante(ControladorEstudiante.findSiguienteEstudiante(idActual));
					}
					else {
						limpiarDatos();
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, no se ha podido eliminar");
			}
	    }
	}
	
	/**
	 * 
	 */
	private void limpiarDatos() {
		panelDatosPersonales.setId(0);
		panelDatosPersonales.setNombre("");
		panelDatosPersonales.setPrimerApellido("");
		panelDatosPersonales.setSegundoApellido("");
		panelDatosPersonales.setDni("");
		panelDatosPersonales.setDireccion("");
		panelDatosPersonales.setEmail("");
		panelDatosPersonales.setTelefono("");
	}
	
	
	/**
	 * 
	 * @param a
	 */
	private void mostrarEstudiante(Estudiante a) {
		if (a != null) {
			panelDatosPersonales.setId(a.getId());
			panelDatosPersonales.setNombre(a.getNombre());
			panelDatosPersonales.setPrimerApellido(a.getApellido1());
			panelDatosPersonales.setSegundoApellido(a.getApellido2());
			panelDatosPersonales.setDni(a.getDni());
			panelDatosPersonales.setDireccion(a.getDireccion());
			panelDatosPersonales.setEmail(a.getEmail());
			panelDatosPersonales.setTelefono(a.getTelefono());
			
			// Ahora habilitamos o deshabilitamos botones de navegación
			// Si no existe un anterior deshabilito los botones de primero y anterior
			if (ControladorEstudiante.findAnteriorEstudiante(a.getId()) == null) {
				btnPrimero.setEnabled(false);
				btnAnterior.setEnabled(false);
			}
			else {
				btnPrimero.setEnabled(true);
				btnAnterior.setEnabled(true);
			}
			// Si no existe un siguiente deshabilito los botones de último y siguiente
			boolean existeSiguiente = 
					(ControladorEstudiante.findSiguienteEstudiante(a.getId()) == null)? false : true;
			btnUltimo.setEnabled(existeSiguiente);
			btnSiguiente.setEnabled(existeSiguiente);
		}
		
	}

}
	
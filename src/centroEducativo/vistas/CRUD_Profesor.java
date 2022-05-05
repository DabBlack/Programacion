package centroEducativo.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolBar;

import centroEducativo.controladores.ControladorProfesor;
import centroEducativo.controladores.ControladorTipologiaSexo;
import centroEducativo.entidades.Estudiante;
import centroEducativo.entidades.Profesor;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class CRUD_Profesor extends JPanel {

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
	public CRUD_Profesor() {
		initialize();
		mostrarProfesor(ControladorProfesor.findPrimerProfesor());
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
				mostrarProfesor(ControladorProfesor.findPrimerProfesor());
			}
		});
		toolBar.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarProfesor(ControladorProfesor.findAnteriorProfesor(panelDatosPersonales.getId()));
			}
		});
		toolBar.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarProfesor(ControladorProfesor.findSiguienteProfesor(panelDatosPersonales.getId()));
			}
		});
		toolBar.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarProfesor(ControladorProfesor.findUltimoProfesor());
			}
		});
		toolBar.add(btnUltimo);
		
		btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarDatos();
			}
		});
		btnNuevo.setIcon(new ImageIcon(CRUD_Profesor.class.getResource("/centroEducativo/res/nuevo.png")));
		toolBar.add(btnNuevo);
		
		btnGuardar = new JButton("");

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarProfesor();
			}
		});
		btnGuardar.setIcon(new ImageIcon(CRUD_Profesor.class.getResource("/centroEducativo/res/guardar.png")));
		toolBar.add(btnGuardar);
		
		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarProfesor();
			}
		});
		btnEliminar.setIcon(new ImageIcon(CRUD_Profesor.class.getResource("/centroEducativo/res/eliminar.png")));
		toolBar.add(btnEliminar);
		
		add(panelDatosPersonales, BorderLayout.CENTER);

	}


	/**
	 * Guardado, puede ser un alta nueva o una modificación
	 */
	private void guardarProfesor() {
		Profesor p = new Profesor();

		p.setNombre(panelDatosPersonales.getNombre());
		p.setApellido1(panelDatosPersonales.getPrimerApellido());
		p.setApellido2(panelDatosPersonales.getSegundoApellido());
		p.setTipologiaSexo_id(panelDatosPersonales.getSexo().getId());
		p.setDni(panelDatosPersonales.getDni());
		p.setDireccion(panelDatosPersonales.getDireccion());
		p.setEmail(panelDatosPersonales.getEmail());
		p.setTelefono(panelDatosPersonales.getTelefono());
		
		if (ControladorProfesor.guardarProfesor(p) == 1) {
			panelDatosPersonales.setId(p.getId());
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
		}
		else {
			JOptionPane.showMessageDialog(null, "Error, no se ha podido guardar");
		}
	}
	
	/**
	 * Eliminación 
	 */
	private void eliminarProfesor() {
		String posiblesRespuestas[] = {"Sí","No"};
		// Utilizo un JOptionPane para preguntar si realmente se desea eliminar un registro
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea eliminar?", "Confirmar eliminación", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, new ImageIcon(CRUD_Profesor.class.getResource("/centroEducativo/res/confirm.png")), 
		        posiblesRespuestas, posiblesRespuestas[1]);
	    
		// Si se confirma que se desea eliminar, se procede a ello
		if(opcionElegida == 0) {
			int idActual = (panelDatosPersonales.getId());
			boolean existeAnterior = ControladorProfesor.findAnteriorProfesor(idActual) != null;
			boolean existeSiguiente = ControladorProfesor.findSiguienteProfesor(idActual) != null;
			
			if (ControladorProfesor.eliminarProfesor(idActual) == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				// Ahora debo navegar, una vez he borrado el registro, al registro anterior
				if (existeAnterior) {
					mostrarProfesor(ControladorProfesor.findAnteriorProfesor(idActual));
				}
				else {
					if (existeSiguiente) {
						mostrarProfesor(ControladorProfesor.findSiguienteProfesor(idActual));
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
		panelDatosPersonales.clearSexo();
		panelDatosPersonales.setDni("");
		panelDatosPersonales.setDireccion("");
		panelDatosPersonales.setEmail("");
		panelDatosPersonales.setTelefono("");
		}
	
	
	/**
	 * 
	 * @param a
	 */
	private void mostrarProfesor(Profesor p) {
		if (p != null) {
			panelDatosPersonales.setId(p.getId());
			panelDatosPersonales.setNombre(p.getNombre());
			panelDatosPersonales.setPrimerApellido(p.getApellido1());
			panelDatosPersonales.setSegundoApellido(p.getApellido2());
			panelDatosPersonales.setSexo(ControladorTipologiaSexo.findAll());
			panelDatosPersonales.setDni(p.getDni());
			panelDatosPersonales.setDireccion(p.getDireccion());
			panelDatosPersonales.setEmail(p.getEmail());
			panelDatosPersonales.setTelefono(p.getTelefono());
			panelDatosPersonales.setImagen(p.getImagen());

			
			// Ahora habilitamos o deshabilitamos botones de navegación
			// Si no existe un anterior deshabilito los botones de primero y anterior
			if (ControladorProfesor.findAnteriorProfesor(p.getId()) == null) {
				btnPrimero.setEnabled(false);
				btnAnterior.setEnabled(false);
			}
			else {
				btnPrimero.setEnabled(true);
				btnAnterior.setEnabled(true);
			}
			// Si no existe un siguiente deshabilito los botones de último y siguiente
			boolean existeSiguiente = 
					(ControladorProfesor.findSiguienteProfesor(p.getId()) == null)? false : true;
			btnUltimo.setEnabled(existeSiguiente);
			btnSiguiente.setEnabled(existeSiguiente);
		}
		
	}

}
	
package centroEducativo.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

import capitulo08_Entorno_Grafico_Swing_Completo.controladores.ControladorFabricante;
import centroEducativo.controladores.ControladorMateria;
import centroEducativo.entidades.Materia;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CRUD_Materia extends JPanel {
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfAcronimo;
	private JTextField jtfCurso_id;

	
	/**
	 * Create the application.
	 */
	public CRUD_Materia() {
		initialize();
		mostrarMateria(ControladorMateria.findPrimeraMateria());	
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
				mostrarMateria(ControladorMateria.findPrimeraMateria());
			}
		});
		toolBar.add(btnPrimero);
		
		btnAnterior = new JButton("<");

		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMateria(
						ControladorMateria.findAnteriorMateria(
								Integer.parseInt(jtfId.getText())));
			}
		});
		toolBar.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMateria(
						ControladorMateria.findSiguienteMateria(
								Integer.parseInt(jtfId.getText())));
			}
		});
		toolBar.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMateria(ControladorMateria.findUltimaMateria());
			}
		});
		toolBar.add(btnUltimo);
		
		btnNuevo= new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarDatos();
			}
		});
		btnNuevo.setIcon(new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/nuevo.png")));
		toolBar.add(btnNuevo);
		
		btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarMateria();
			}
		});
		btnGuardar.setIcon(new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/guardar.png")));
		toolBar.add(btnGuardar);
		
		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarMateria();
			}
		});
		btnEliminar.setIcon(new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/eliminar.png")));
		toolBar.add(btnEliminar);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblId = new JLabel("id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 1;
		panel.add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 4;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 4;
		gbc_jtfNombre.gridy = 3;
		panel.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblAcronimo = new JLabel("Acronimo");
		GridBagConstraints gbc_lblAcronimo = new GridBagConstraints();
		gbc_lblAcronimo.anchor = GridBagConstraints.EAST;
		gbc_lblAcronimo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAcronimo.gridx = 3;
		gbc_lblAcronimo.gridy = 5;
		panel.add(lblAcronimo, gbc_lblAcronimo);
		
		jtfAcronimo = new JTextField();
		GridBagConstraints gbc_jtfAcronimo = new GridBagConstraints();
		gbc_jtfAcronimo.insets = new Insets(0, 0, 5, 5);
		gbc_jtfAcronimo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfAcronimo.gridx = 4;
		gbc_jtfAcronimo.gridy = 5;
		panel.add(jtfAcronimo, gbc_jtfAcronimo);
		jtfAcronimo.setColumns(10);
		
		JLabel lblCursoid = new JLabel("Curso_id:");
		GridBagConstraints gbc_lblCursoid = new GridBagConstraints();
		gbc_lblCursoid.anchor = GridBagConstraints.EAST;
		gbc_lblCursoid.insets = new Insets(0, 0, 0, 5);
		gbc_lblCursoid.gridx = 3;
		gbc_lblCursoid.gridy = 7;
		panel.add(lblCursoid, gbc_lblCursoid);
		
		jtfCurso_id = new JTextField();
		GridBagConstraints gbc_jtfCurso_id = new GridBagConstraints();
		gbc_jtfCurso_id.insets = new Insets(0, 0, 0, 5);
		gbc_jtfCurso_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCurso_id.gridx = 4;
		gbc_jtfCurso_id.gridy = 7;
		panel.add(jtfCurso_id, gbc_jtfCurso_id);
		jtfCurso_id.setColumns(10);
		
	}

	/**
	 * Guardado, puede ser un alta nueva o una modificación
	 */
	private void guardarMateria() {
		Materia m = new Materia();
		m.setId(Integer.parseInt(jtfId.getText()));
		m.setNombre(jtfNombre.getText());
		m.setAcronimo(jtfAcronimo.getText());
		m.setCurso_id(Integer.parseInt(jtfCurso_id.getText()));
		if (ControladorMateria.guardarMateria(m) == 1) {
			jtfId.setText("" + m.getId());
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
		} else {
			JOptionPane.showMessageDialog(null, "Error, no se ha podido guardar");
		}
	}

	/**
	 * Eliminación
	 */
	private void eliminarMateria() {
		String posiblesRespuestas[] = { "Sí", "No" };
		// Utilizo un JOptionPane para preguntar si realmente se desea eliminar un
		// registro
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea eliminar?", "Confirmar eliminación",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/confirm.png")), posiblesRespuestas,
				posiblesRespuestas[1]);

		// Si se confirma que se desea eliminar, se procede a ello
		if (opcionElegida == 0) {
			int idActual = Integer.parseInt(jtfId.getText());
			boolean existeAnterior = ControladorMateria.findAnteriorMateria(idActual) != null;
			boolean existeSiguiente = ControladorMateria.findSiguienteMateria(idActual) != null;

			if (ControladorMateria.eliminarMateria(idActual) == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				// Ahora debo navegar, una vez he borrado el registro, al registro anterior
				if (existeAnterior) {
					mostrarMateria(ControladorMateria.findAnteriorMateria(idActual));
				} else {
					if (existeSiguiente) {
						mostrarMateria(ControladorMateria.findSiguienteMateria(idActual));
					} else {
						limpiarDatos();
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error, no se ha podido eliminar");
			}
		}
	}

	/**
	 * 
	 */
	private void limpiarDatos() {
		jtfId.setText("0");
		jtfNombre.setText("");
		jtfAcronimo.setText("");
		jtfCurso_id.setText("");
	}

	/**
	 * 
	 * @param f
	 */
	private void mostrarMateria(Materia m) {
		if (m != null) {
			jtfId.setText("" + m.getId());
			jtfNombre.setText(m.getNombre());
			jtfAcronimo.setText(m.getAcronimo());
			jtfCurso_id.setText("" + m.getCurso_id());
			// Ahora habilitamos o deshabilitamos botones de navegación
			// Si no existe un anterior deshabilito los botones de primero y anterior
			if (ControladorMateria.findAnteriorMateria(m.getId()) == null) {
				btnPrimero.setEnabled(false);
				btnAnterior.setEnabled(false);
			} else {
				btnPrimero.setEnabled(true);
				btnAnterior.setEnabled(true);
			}
			// Si no existe un siguiente deshabilito los botones de último y siguiente
			boolean existeSiguiente = (ControladorMateria.findSiguienteMateria(m.getId()) == null) ? false : true;
			btnUltimo.setEnabled(existeSiguiente);
			btnSiguiente.setEnabled(existeSiguiente);
		}

	}

}



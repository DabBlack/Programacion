package centroEducativo.vistas;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import javax.swing.JToolBar;

import centroEducativo.controladores.ControladorCurso;
import centroEducativo.entidades.Curso;

import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class CRUD_Curso extends JPanel {

	private JTextField jtfId;
	private JTextField jtfDescripcion;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JButton btnEliminar;

	
	
	/**
	 * Create the application.
	 */
	public CRUD_Curso() {
		initialize();
		mostrarCurso(ControladorCurso.findPrimerCurso());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCurso(ControladorCurso.findPrimerCurso());
			}
		});
		toolBar.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCurso(
						ControladorCurso.findAnteriorCurso(
								Integer.parseInt(jtfId.getText())));
			}
		});
		toolBar.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCurso(
						ControladorCurso.findSiguienteCurso(
								Integer.parseInt(jtfId.getText())));
			}
		});
		toolBar.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCurso(ControladorCurso.findUltimoCurso());
			}
		});
		toolBar.add(btnUltimo);
		
		btnNuevo = new JButton("");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarDatos();
			}
		});
		btnNuevo.setIcon(new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/nuevo.png")));
		toolBar.add(btnNuevo);
		
		btnGuardar= new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarCurso();
			}
		});
		btnGuardar.setIcon(new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/guardar.png")));
		toolBar.add(btnGuardar);
		
		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarCurso();
			}
		});
		btnEliminar.setIcon(new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/eliminar.png")));
		toolBar.add(btnEliminar);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblId = new JLabel("id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 5;
		gbc_lblId.gridy = 3;
		panel_1.add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 9;
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 6;
		gbc_jtfId.gridy = 3;
		panel_1.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 5;
		gbc_lblDescripcin.gridy = 5;
		panel_1.add(lblDescripcin, gbc_lblDescripcin);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.gridwidth = 9;
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 6;
		gbc_jtfDescripcion.gridy = 5;
		panel_1.add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
	}
	

	/**
	 * Guardado, puede ser un alta nueva o una modificación
	 */
	private void guardarCurso() {
		Curso c = new Curso();
		c.setId(Integer.parseInt(jtfId.getText()));
		c.setDescripcion(jtfDescripcion.getText());
		if (ControladorCurso.guardarCurso(c) == 1) {
			jtfId.setText("" + c.getId());
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
		}
		else {
			JOptionPane.showMessageDialog(null, "Error, no se ha podido guardar");
		}
	}
	
	/**
	 * Eliminación 
	 */
	private void eliminarCurso() {
		String posiblesRespuestas[] = {"Sí","No"};
		// Utilizo un JOptionPane para preguntar si realmente se desea eliminar un registro
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Realmente desea eliminar?", "Confirmar eliminación", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, new ImageIcon(CRUD_Curso.class.getResource("/centroEducativo/res/confirm.png")), 
		        posiblesRespuestas, posiblesRespuestas[1]);
	    
		// Si se confirma que se desea eliminar, se procede a ello
		if(opcionElegida == 0) {
			int idActual = Integer.parseInt(jtfId.getText());
			boolean existeAnterior = ControladorCurso.findAnteriorCurso(idActual) != null;
			boolean existeSiguiente = ControladorCurso.findSiguienteCurso(idActual) != null;
			
			if (ControladorCurso.eliminarCurso(idActual) == 1) {
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
				// Ahora debo navegar, una vez he borrado el registro, al registro anterior
				if (existeAnterior) {
					mostrarCurso(ControladorCurso.findAnteriorCurso(idActual));
				}
				else {
					if (existeSiguiente) {
						mostrarCurso(ControladorCurso.findSiguienteCurso(idActual));
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
		jtfId.setText("0");
		jtfDescripcion.setText("");
	}
	
	
	/**
	 * 
	 * @param f
	 */
	private void mostrarCurso(Curso c) {
		if (c != null) {
			jtfId.setText("" + c.getId());
			jtfDescripcion.setText(c.getDescripcion());
			// Ahora habilitamos o deshabilitamos botones de navegación
			// Si no existe un anterior deshabilito los botones de primero y anterior
			if (ControladorCurso.findAnteriorCurso(c.getId()) == null) {
				btnPrimero.setEnabled(false);
				btnAnterior.setEnabled(false);
			}
			else {
				btnPrimero.setEnabled(true);
				btnAnterior.setEnabled(true);
			}
			// Si no existe un siguiente deshabilito los botones de último y siguiente
			boolean existeSiguiente = 
					(ControladorCurso.findSiguienteCurso(c.getId()) == null)? false : true;
			btnUltimo.setEnabled(existeSiguiente);
			btnSiguiente.setEnabled(existeSiguiente);
		}
		
	}
	
}

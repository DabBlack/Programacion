package examen_05_09_2022;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import examen_05_09_2022.controladores.ControladorAcuerdo;
import examen_05_09_2022.controladores.ControladorIdioma;
import examen_05_09_2022.controladores.ControladorPais;
import examen_05_09_2022.controladores.ControladorUsuario;
import examen_05_09_2022.entidades.Acuerdo;
import examen_05_09_2022.entidades.Idioma;
import examen_05_09_2022.entidades.Pais;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField jtfEmail;
	private JTextField jtfUsuario;
	private JTextField jtfPassword;
	private JTextField jtfRepeatPassword;
	private JLabel lblEmail;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JLabel lblRepeticionPassword;
	private JLabel lblPas;
	private JLabel lblIdioma;
	private JComboBox <Pais> jcbPais;
	private JComboBox <Idioma> jcbIdioma;
	private Checkbox checkbox;
	private Acuerdo acuerdo;
	private Pais p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 0;
		getContentPane().add(lblEmail, gbc_lblEmail);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.gridwidth = 3;
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 2;
		gbc_jtfEmail.gridy = 0;
		getContentPane().add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 1;
		getContentPane().add(lblUsuario, gbc_lblUsuario);
		
		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridwidth = 3;
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.gridx = 2;
		gbc_jtfUsuario.gridy = 1;
		getContentPane().add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 2;
		getContentPane().add(lblPassword, gbc_lblPassword);
		
		jtfPassword = new JTextField();
		GridBagConstraints gbc_jtfPassword = new GridBagConstraints();
		gbc_jtfPassword.gridwidth = 3;
		gbc_jtfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPassword.gridx = 2;
		gbc_jtfPassword.gridy = 2;
		getContentPane().add(jtfPassword, gbc_jtfPassword);
		jtfPassword.setColumns(10);
		
		lblRepeticionPassword = new JLabel("Repetición Password:");
		GridBagConstraints gbc_lblRepeticionPassword = new GridBagConstraints();
		gbc_lblRepeticionPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepeticionPassword.anchor = GridBagConstraints.EAST;
		gbc_lblRepeticionPassword.gridx = 1;
		gbc_lblRepeticionPassword.gridy = 3;
		getContentPane().add(lblRepeticionPassword, gbc_lblRepeticionPassword);
		
		jtfRepeatPassword = new JTextField();
		GridBagConstraints gbc_jtfRepeatPassword = new GridBagConstraints();
		gbc_jtfRepeatPassword.gridwidth = 3;
		gbc_jtfRepeatPassword.insets = new Insets(0, 0, 5, 0);
		gbc_jtfRepeatPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfRepeatPassword.gridx = 2;
		gbc_jtfRepeatPassword.gridy = 3;
		getContentPane().add(jtfRepeatPassword, gbc_jtfRepeatPassword);
		jtfRepeatPassword.setColumns(10);
		
		lblPas = new JLabel("País");
		GridBagConstraints gbc_lblPas = new GridBagConstraints();
		gbc_lblPas.insets = new Insets(0, 0, 5, 5);
		gbc_lblPas.anchor = GridBagConstraints.EAST;
		gbc_lblPas.gridx = 1;
		gbc_lblPas.gridy = 4;
		getContentPane().add(lblPas, gbc_lblPas);
		
		jcbPais = new JComboBox<Pais>();
		GridBagConstraints gbc_jcbPais = new GridBagConstraints();
		gbc_jcbPais.gridwidth = 3;
		gbc_jcbPais.insets = new Insets(0, 0, 5, 0);
		gbc_jcbPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbPais.gridx = 2;
		gbc_jcbPais.gridy = 4;
		getContentPane().add(jcbPais, gbc_jcbPais);
		
		lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.anchor = GridBagConstraints.EAST;
		gbc_lblIdioma.gridx = 1;
		gbc_lblIdioma.gridy = 5;
		getContentPane().add(lblIdioma, gbc_lblIdioma);
		
		jcbIdioma = new JComboBox<Idioma>();
		GridBagConstraints gbc_jbcIdioma = new GridBagConstraints();
		gbc_jbcIdioma.gridwidth = 3;
		gbc_jbcIdioma.insets = new Insets(0, 0, 5, 0);
		gbc_jbcIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jbcIdioma.gridx = 2;
		gbc_jbcIdioma.gridy = 5;
		getContentPane().add(jcbIdioma, gbc_jbcIdioma);
		
		inicializarComboBoxes();
		
		checkbox = new Checkbox();
		GridBagConstraints gbc_checkbox = new GridBagConstraints();
		gbc_checkbox.insets = new Insets(0, 0, 5, 5);
		gbc_checkbox.gridx = 1;
		gbc_checkbox.gridy = 7;
		getContentPane().add(checkbox, gbc_checkbox);
		checkbox.setName(ControladorAcuerdo.findAll().toString());
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setEnabled(true);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarUsuario();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 8;
		getContentPane().add(btnGuardar, gbc_btnGuardar);
		
	}
		
	/**
	 * 
	 */
	private void inicializarComboBoxes() {
		List<Pais> listaPaises = ControladorPais.findAll();
		List<Idioma> listaIdioma= ControladorIdioma.findAll();

		for (Pais p : listaPaises) {
			jcbPais.addItem(p);
		}
		
		for (Idioma i : listaIdioma) {
			jcbIdioma.addItem(i);
		}
		
	}
	
	/**
	 * 
	 */
	private void guardarUsuario() {
		int nuevoIdDisponible = 0;
		
		if (jtfUsuario.getText().length() > 8 | jtfEmail.getText().contains("@") == true |
				jtfEmail.getText().contains(".") == true | jtfEmail.getText().lastIndexOf(".") > 
				jtfEmail.getText().lastIndexOf("@") | jtfPassword.getText().equals(jtfRepeatPassword.getText())) {
			try {
				Statement s = ConnectionManager.getConexion().createStatement();
				
				nuevoIdDisponible = ControladorUsuario.maxIdEnTabla("usuario");
				if (nuevoIdDisponible != -1) {
					int registrosAfectados = s.executeUpdate(
							"insert into usuario values (" + nuevoIdDisponible + ",'" + jtfEmail.getText() + "', '" 
									+ jtfUsuario.getText() + "','" + jtfPassword + "','" + jcbIdioma + "')");
					System.out.println(registrosAfectados + " registros insertados ");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		else {
			JOptionPane.showInputDialog("No es posible guardar al usuario ya que no cumple con las condiciones"
					+ " prestablecidas");
		}
		
	}
	
	


}

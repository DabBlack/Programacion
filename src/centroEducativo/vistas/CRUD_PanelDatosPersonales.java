package centroEducativo.vistas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.JTextField;

import centroEducativo.controladores.ControladorTipologiaSexo;
import centroEducativo.entidades.TipologiaSexo;

import javax.swing.JComboBox;

public class CRUD_PanelDatosPersonales extends JPanel {
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfPrimerApellido;
	private JTextField jtfSegundoApellido;
	private JTextField jtfDni;
	private JTextField jtfDireccion;
	private JTextField jtfEmail;
	private JTextField jtfTelefono;
	private JComboBox jcbSexo;

	/**
	 * Create the panel.
	 */
	public CRUD_PanelDatosPersonales() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 5);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 2;
		gbc_jtfId.gridy = 0;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 2;
		gbc_jtfNombre.gridy = 1;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		GridBagConstraints gbc_lblPrimerApellido = new GridBagConstraints();
		gbc_lblPrimerApellido.anchor = GridBagConstraints.EAST;
		gbc_lblPrimerApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellido.gridx = 1;
		gbc_lblPrimerApellido.gridy = 2;
		add(lblPrimerApellido, gbc_lblPrimerApellido);
		
		jtfPrimerApellido = new JTextField();
		GridBagConstraints gbc_jtfPrimerApellido = new GridBagConstraints();
		gbc_jtfPrimerApellido.insets = new Insets(0, 0, 5, 5);
		gbc_jtfPrimerApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPrimerApellido.gridx = 2;
		gbc_jtfPrimerApellido.gridy = 2;
		add(jtfPrimerApellido, gbc_jtfPrimerApellido);
		jtfPrimerApellido.setColumns(10);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		GridBagConstraints gbc_lblSegundoApellido = new GridBagConstraints();
		gbc_lblSegundoApellido.anchor = GridBagConstraints.EAST;
		gbc_lblSegundoApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellido.gridx = 1;
		gbc_lblSegundoApellido.gridy = 3;
		add(lblSegundoApellido, gbc_lblSegundoApellido);
		
		jtfSegundoApellido = new JTextField();
		GridBagConstraints gbc_jtfSegundoApellido = new GridBagConstraints();
		gbc_jtfSegundoApellido.insets = new Insets(0, 0, 5, 5);
		gbc_jtfSegundoApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSegundoApellido.gridx = 2;
		gbc_jtfSegundoApellido.gridy = 3;
		add(jtfSegundoApellido, gbc_jtfSegundoApellido);
		jtfSegundoApellido.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 1;
		gbc_lblSexo.gridy = 4;
		add(lblSexo, gbc_lblSexo);
		
		jcbSexo = new JComboBox();
		GridBagConstraints gbc_jcbSexo = new GridBagConstraints();
		gbc_jcbSexo.insets = new Insets(0, 0, 5, 5);
		gbc_jcbSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbSexo.gridx = 2;
		gbc_jcbSexo.gridy = 4;
		add(jcbSexo, gbc_jcbSexo);
		
		JLabel lblDni = new JLabel("DNI:");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 5;
		add(lblDni, gbc_lblDni);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 5);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 2;
		gbc_jtfDni.gridy = 5;
		add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		JLabel lblDireccin_1 = new JLabel("Dirección:");
		GridBagConstraints gbc_lblDireccin_1 = new GridBagConstraints();
		gbc_lblDireccin_1.anchor = GridBagConstraints.EAST;
		gbc_lblDireccin_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin_1.gridx = 1;
		gbc_lblDireccin_1.gridy = 6;
		add(lblDireccin_1, gbc_lblDireccin_1);
		
		jtfDireccion = new JTextField();
		GridBagConstraints gbc_jtfDireccion = new GridBagConstraints();
		gbc_jtfDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_jtfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDireccion.gridx = 2;
		gbc_jtfDireccion.gridy = 6;
		add(jtfDireccion, gbc_jtfDireccion);
		jtfDireccion.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 7;
		add(lblEmail, gbc_lblEmail);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 5);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 2;
		gbc_jtfEmail.gridy = 7;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelfono.gridx = 1;
		gbc_lblTelfono.gridy = 8;
		add(lblTelfono, gbc_lblTelfono);
		
		jtfTelefono = new JTextField();
		GridBagConstraints gbc_jtfTelefono = new GridBagConstraints();
		gbc_jtfTelefono.insets = new Insets(0, 0, 0, 5);
		gbc_jtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfTelefono.gridx = 2;
		gbc_jtfTelefono.gridy = 8;
		add(jtfTelefono, gbc_jtfTelefono);
		jtfTelefono.setColumns(10);

	}
	
	/**
	 * 
	 */
	private void inicializarComboBoxCursos() {
		List<TipologiaSexo> tipologiaSexo = ControladorTipologiaSexo.findAll();
		for (TipologiaSexo t : tipologiaSexo) {
			jcbSexo.addItem(t);
		}
	}
	
	/**
	 * 
	 * @param newId
	 */
	public void setId(int newId) {
		this.jtfId.setText("" + newId);
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return Integer.parseInt(this.jtfId.getText());
	}
	
	/**
	 * 
	 * @param newNombre
	 */
	public void setNombre(String newNombre) {
		this.jtfNombre.setText(newNombre);
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.jtfNombre.getText();
	}
	
	/**
	 * 
	 * @param newPrimerApellido
	 */
	public void setPrimerApellido(String newPrimerApellido) {
		this.jtfPrimerApellido.setText(newPrimerApellido);
	}

	/**
	 * 
	 * @return
	 */
	public String getPrimerApellido() {
		return this.jtfPrimerApellido.getText();
	}
	
	/**
	 * 
	 * @param newSegundoApellido
	 */
	public void setSegundoApellido(String newSegundoApellido) {
		this.jtfSegundoApellido.setText(newSegundoApellido);
	}

	/**
	 * 
	 * @return
	 */
	public String getSegundoApellido() {
		return this.jtfSegundoApellido.getText();
	}
	
	/**
	 * 
	 * @param newSexo
	 */
	public void setSexo(List<TipologiaSexo> newSexo) {
		for(TipologiaSexo ts:newSexo) {
			this.jcbSexo.addItem(ts);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public TipologiaSexo getSexo() {
		return (TipologiaSexo) this.jcbSexo.getSelectedItem();
	}
	
	/**
	 * 
	 * @param newDni
	 */
	public void setDni(String newDni) {
		this.jtfDni.setText(newDni);
	}

	/**
	 * 
	 * @return
	 */
	public String getDni() {
		return this.jtfDni.getText();
	}
	
	/**
	 * 
	 * @param newDireccion
	 */
	public void setDireccion(String newDireccion) {
		this.jtfDireccion.setText(newDireccion);
	}

	/**
	 * 
	 * @return
	 */
	public String getDireccion() {
		return this.jtfDireccion.getText();
	}
	
	/**
	 * 
	 * @param newEmail
	 */
	public void setEmail(String newEmail) {
		this.jtfEmail.setText(newEmail);
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return this.jtfEmail.getText();
	}
	
	/**
	 * 
	 * @param newEmail
	 */
	public void setTelefono(String newTelefono) {
		this.jtfTelefono.setText(newTelefono);
	}

	/**
	 * 
	 * @return
	 */
	public String getTelefono() {
		return this.jtfTelefono.getText();
	}

	/**
	 * 
	 */
	public void clearSexo() {
		this.jcbSexo.setSelectedIndex(0);
	}
	
	
}

package examen_16_05_2022;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;

import examen_16_05_2022.controladores.ControladorArtista;
import examen_16_05_2022.controladores.ControladorMunicipio;
import examen_16_05_2022.controladores.ControladorProvincia;
import examen_16_05_2022.entidades.Artista;
import examen_16_05_2022.entidades.Municipio;
import examen_16_05_2022.entidades.Provincia;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField jtfBusqueda;
	private JTextField jtfNombre;
	private JComboBox<Provincia> jcbProvincia;
	private JComboBox<Municipio> jcbMunicipio;
	private JComboBox<Artista> jcbArtistas;
	private JButton btnGuardar;
	private JButton btnBuscar;
	private JRadioButton rdbtnCantante;
	private JRadioButton rdbtnDanza;
	private JRadioButton rdbtnMagia;
	private JScrollPane scrollPane;
	private JButton btnCambiarImagen;
	private byte[] imagenEnArrayDeBytes;



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
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**Idiomas
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 169, 86, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblGestinDeArtistas = new JLabel("Gestión de artistas");
		GridBagConstraints gbc_lblGestinDeArtistas = new GridBagConstraints();
		gbc_lblGestinDeArtistas.gridwidth = 4;
		gbc_lblGestinDeArtistas.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestinDeArtistas.gridx = 4;
		gbc_lblGestinDeArtistas.gridy = 4;
		contentPane.add(lblGestinDeArtistas, gbc_lblGestinDeArtistas);
		
		JLabel lblBsquedaDeArtistas = new JLabel("Búsqueda de artistas:");
		GridBagConstraints gbc_lblBsquedaDeArtistas = new GridBagConstraints();
		gbc_lblBsquedaDeArtistas.anchor = GridBagConstraints.EAST;
		gbc_lblBsquedaDeArtistas.insets = new Insets(0, 0, 5, 5);
		gbc_lblBsquedaDeArtistas.gridx = 1;
		gbc_lblBsquedaDeArtistas.gridy = 5;
		contentPane.add(lblBsquedaDeArtistas, gbc_lblBsquedaDeArtistas);
		
		jtfBusqueda = new JTextField();
		GridBagConstraints gbc_jtfBusqueda = new GridBagConstraints();
		gbc_jtfBusqueda.gridwidth = 5;
		gbc_jtfBusqueda.insets = new Insets(0, 0, 5, 5);
		gbc_jtfBusqueda.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfBusqueda.gridx = 2;
		gbc_jtfBusqueda.gridy = 5;
		contentPane.add(jtfBusqueda, gbc_jtfBusqueda);
		jtfBusqueda.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarArtista();
			}
		});
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 7;
		gbc_btnBuscar.gridy = 5;
		contentPane.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblArtistasEncontrados = new JLabel("Artistas encontrados:");
		GridBagConstraints gbc_lblArtistasEncontrados = new GridBagConstraints();
		gbc_lblArtistasEncontrados.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtistasEncontrados.gridx = 1;
		gbc_lblArtistasEncontrados.gridy = 6;
		contentPane.add(lblArtistasEncontrados, gbc_lblArtistasEncontrados);
		
		jcbArtistas = new JComboBox();
		GridBagConstraints gbc_jcbArtistas = new GridBagConstraints();
		gbc_jcbArtistas.gridwidth = 4;
		gbc_jcbArtistas.insets = new Insets(0, 0, 5, 5);
		gbc_jcbArtistas.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbArtistas.gridx = 3;
		gbc_jcbArtistas.gridy = 6;
		contentPane.add(jcbArtistas, gbc_jcbArtistas);
		
		JButton btnCargarDatos = new JButton("Cargar Datos");
		GridBagConstraints gbc_btnCargarDatos = new GridBagConstraints();
		gbc_btnCargarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargarDatos.gridx = 7;
		gbc_btnCargarDatos.gridy = 6;
		contentPane.add(btnCargarDatos, gbc_btnCargarDatos);
		
		JLabel lblArtistaEncontrado = new JLabel("Artista encontrado");
		GridBagConstraints gbc_lblArtistaEncontrado = new GridBagConstraints();
		gbc_lblArtistaEncontrado.gridwidth = 5;
		gbc_lblArtistaEncontrado.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtistaEncontrado.gridx = 3;
		gbc_lblArtistaEncontrado.gridy = 7;
		contentPane.add(lblArtistaEncontrado, gbc_lblArtistaEncontrado);
		
		JLabel lblNombreArtstico = new JLabel("Nombre artístico:");
		GridBagConstraints gbc_lblNombreArtstico = new GridBagConstraints();
		gbc_lblNombreArtstico.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArtstico.gridx = 1;
		gbc_lblNombreArtstico.gridy = 8;
		contentPane.add(lblNombreArtstico, gbc_lblNombreArtstico);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.gridwidth = 4;
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 3;
		gbc_jtfNombre.gridy = 8;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		rdbtnCantante = new JRadioButton("Cantante");
		GridBagConstraints gbc_rdbtnCantante = new GridBagConstraints();
		gbc_rdbtnCantante.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCantante.gridx = 4;
		gbc_rdbtnCantante.gridy = 10;
		contentPane.add(rdbtnCantante, gbc_rdbtnCantante);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 7;
		gbc_scrollPane.gridy = 10;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JLabel lblDisciplina = new JLabel("Disciplina:");
		GridBagConstraints gbc_lblDisciplina = new GridBagConstraints();
		gbc_lblDisciplina.insets = new Insets(0, 0, 5, 5);
		gbc_lblDisciplina.gridx = 1;
		gbc_lblDisciplina.gridy = 11;
		contentPane.add(lblDisciplina, gbc_lblDisciplina);
		
		rdbtnMagia = new JRadioButton("Magia");
		GridBagConstraints gbc_rdbtnMagia = new GridBagConstraints();
		gbc_rdbtnMagia.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMagia.gridx = 4;
		gbc_rdbtnMagia.gridy = 11;
		contentPane.add(rdbtnMagia, gbc_rdbtnMagia);
		
		rdbtnDanza = new JRadioButton("Danza");
		GridBagConstraints gbc_rdbtnDanza = new GridBagConstraints();
		gbc_rdbtnDanza.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDanza.gridx = 4;
		gbc_rdbtnDanza.gridy = 12;
		contentPane.add(rdbtnDanza, gbc_rdbtnDanza);
		
		jcbProvincia= new JComboBox<Provincia>();
		jcbProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filtrarMunicipiosPorProvinciaSeleccionada();
			}
		});
		
		btnCambiarImagen = new JButton("Cambiar");
		btnCambiarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaImagen();	
			}
		});
		GridBagConstraints gbc_CambiarbtnImagen = new GridBagConstraints();
		gbc_CambiarbtnImagen.gridwidth = 2;
		gbc_CambiarbtnImagen.insets = new Insets(0, 0, 5, 5);
		gbc_CambiarbtnImagen.gridx = 7;
		gbc_CambiarbtnImagen.gridy = 12;
		contentPane.add(btnCambiarImagen, gbc_CambiarbtnImagen);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 1;
		gbc_lblProvincia.gridy = 13;
		contentPane.add(lblProvincia, gbc_lblProvincia);
		GridBagConstraints gbc_jcbProvincia = new GridBagConstraints();
		gbc_jcbProvincia.gridwidth = 3;
		gbc_jcbProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_jcbProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProvincia.gridx = 4;
		gbc_jcbProvincia.gridy = 13;
		contentPane.add(jcbProvincia, gbc_jcbProvincia);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarArtista();
			}
		});
		
		JLabel lblMunicipio = new JLabel("Municipio:");
		GridBagConstraints gbc_lblMunicipio = new GridBagConstraints();
		gbc_lblMunicipio.insets = new Insets(0, 0, 5, 5);
		gbc_lblMunicipio.gridx = 1;
		gbc_lblMunicipio.gridy = 14;
		contentPane.add(lblMunicipio, gbc_lblMunicipio);
		
		jcbMunicipio = new JComboBox<Municipio>();
		GridBagConstraints gbc_jcbMunicipio = new GridBagConstraints();
		gbc_jcbMunicipio.gridwidth = 3;
		gbc_jcbMunicipio.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMunicipio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMunicipio.gridx = 4;
		gbc_jcbMunicipio.gridy = 14;
		contentPane.add(jcbMunicipio, gbc_jcbMunicipio);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 3;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuardar.gridx = 7;
		gbc_btnGuardar.gridy = 14;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		cargarProvinciasEnComboBox();
		cargarMunicipiosEnComboBox();
//		cargarArtistasEnComboBox();
	}

	/**
	 * Con este método seleccionamos la imagen que queremos 
	 */
	public void seleccionaImagen () {
		JFileChooser jfileChooser = new JFileChooser();
				
		// Tipo de selección que se hace en el diálogo
		jfileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Sólo selecciona ficheros

		// Filtro del tipo de ficheros que puede abrir
		jfileChooser.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return "Archivos de imagen *.jpg *.png *.gif";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || (f.isFile() &&
						(f.getAbsolutePath().endsWith(".jpg") || 
								f.getAbsolutePath().endsWith(".jpeg")|| 
								f.getAbsolutePath().endsWith(".png")|| 
								f.getAbsolutePath().endsWith(".gif")))) 
					return true;
				return false;
			}
		});
		
		// Abro el diálogo para la elección del usuario
		int seleccionUsuario = jfileChooser.showOpenDialog(null);
		
		if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
			File fichero = jfileChooser.getSelectedFile();
			
			if (fichero.isFile()) {
				try {
					this.imagenEnArrayDeBytes = Files.readAllBytes(fichero.toPath());
					mostrarImagen(imagenEnArrayDeBytes);
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
		
	
	/**
	 * Este método recibe un array de byte
	 */
	public void mostrarImagen (byte[] imagenEnArrayDeBytes) {
		if (imagenEnArrayDeBytes != null && imagenEnArrayDeBytes.length > 0) {
			ImageIcon icono = new ImageIcon(imagenEnArrayDeBytes);
			JLabel lblIcono = new JLabel(icono);
			scrollPane.setViewportView(lblIcono);
		}
		else {
			JLabel lblIcono = new JLabel("Sin imagen");
			scrollPane.setViewportView(lblIcono);
		}

	}
		
	/**
	 * 
	 * @param imagenEnArrayDeBytes
	 */
	public void setImagen(byte[] imagenEnArrayDeBytes) {
		mostrarImagen(imagenEnArrayDeBytes);
	}
	/**
	 * 
	 * @return
	 */
	public byte[] getImagen() {
		return imagenEnArrayDeBytes;
	}
	
	/**
	 * 
	 */
	private void buscarArtista() {
		Artista a = ControladorArtista.findByNombreArtista(this.jtfBusqueda.getText());
		this.jcbArtistas.addItem(a);
	}
	
	/**
	 * 
	 */
	private void cargarArtistasEnComboBox() {
		List<Artista> artistas = ControladorArtista.findAll();
		for (Artista a : artistas) {
			this.jcbArtistas.addItem(a);
		}
	}
	
	/**
	 * 
	 */
	private void cargarProvinciasEnComboBox() {
		List<Provincia> provincias = ControladorProvincia.findAll();
		for (Provincia p : provincias) {
			this.jcbProvincia.addItem(p);
		}
	}

	/**
	 * 
	 */
	private void cargarMunicipiosEnComboBox() {
		List<Municipio> municipios = ControladorMunicipio.findAll();
		for (Municipio m : municipios) {
			this.jcbMunicipio.addItem(m);
		}
	}

	/**
	 * 
	 */
	private void filtrarMunicipiosPorProvinciaSeleccionada() {
		int idProvinciaSeleccionado = ((Provincia) this.jcbProvincia.getSelectedItem()).getId();
		
		this.jcbMunicipio.removeAllItems();
		
		List<Municipio> municipios = ControladorMunicipio.findByIdProvincia(idProvinciaSeleccionado);		
		for (Municipio i : municipios) {
			this.jcbMunicipio.addItem(i);
		}
	}
	
	private void guardarArtista() {
		Artista a = new Artista();
		a.setNombre(this.jtfNombre.getText());
		
		if(rdbtnCantante != null) {
			a.setIdDisciplina(1);
		}
		
		if(rdbtnMagia!= null) {
			a.setIdDisciplina(2);
		}
		
		if(rdbtnDanza!= null) {
			a.setIdDisciplina(3);
		}
		
		a.setIdMunicipio(((Municipio) this.jcbMunicipio.getSelectedItem()).getId());
		
		if (ControladorArtista.guardarArtista(a) > 0) {
			JOptionPane.showMessageDialog(null, "Usuario almacenado correctamente");
		}
		else {
			JOptionPane.showMessageDialog(null, "El usuario no puede guardarse");
		}
	}
	
}

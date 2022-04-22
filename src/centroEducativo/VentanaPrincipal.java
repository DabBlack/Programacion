package centroEducativo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import centroEducativo.vistas.CRUD_Curso;
import centroEducativo.vistas.CRUD_Materia;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JDialog;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		super("Centro Educativo");
		this.setBounds(500, 250, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGestion = new JMenu("Gestión");
		menuBar.add(mnGestion);
		
		JMenuItem mntmCursos = new JMenuItem("Cursos");
		mntmCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				// El usuario no puede redimensionar el diálogo
				dialogo.setResizable(true);
				// Título del díalogo
				dialogo.setTitle("Gestión de Cursos");
				// Introducimos el panel creado sobre el diálogo
				dialogo.setContentPane(new CRUD_Curso());
				// Empaquetar el diálogo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
				dialogo.pack();
				// El usuario no puede hacer clic sobre la ventana padre, si el Diálogo es modal
				dialogo.setModal(true);
				// Centro el diálogo en pantalla
				dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
						(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
				// Muestro el diálogo en pantalla
				dialogo.setVisible(true);
			}
		});
		mnGestion.add(mntmCursos);
		
		JMenuItem mntmMaterias = new JMenuItem("Materias");
		mntmMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				// El usuario no puede redimensionar el diálogo
				dialogo.setResizable(true);
				// Título del díalogo
				dialogo.setTitle("Gestión de Materias");
				// Introducimos el panel creado sobre el diálogo
				dialogo.setContentPane(new CRUD_Materia());
				// Empaquetar el diálogo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
				dialogo.pack();
				// El usuario no puede hacer clic sobre la ventana padre, si el Diálogo es modal
				dialogo.setModal(true);
				// Centro el diálogo en pantalla
				dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
						(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
				// Muestro el diálogo en pantalla
				dialogo.setVisible(true);
			}
		});
		mnGestion.add(mntmMaterias);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{79, 0};
		gbl_contentPane.rowHeights = new int[]{31, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JToolBar toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		contentPane.add(toolBar, gbc_toolBar);
		
		JButton btnCursos= new JButton("Cursos");
		btnCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				// El usuario no puede redimensionar el diálogo
				dialogo.setResizable(true);
				// Título del díalogo
				dialogo.setTitle("Gestión de Cursos");
				// Introducimos el panel creado sobre el diálogo
				dialogo.setContentPane(new CRUD_Curso());
				// Empaquetar el diálogo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
				dialogo.pack();
				// El usuario no puede hacer clic sobre la ventana padre, si el Diálogo es modal
				dialogo.setModal(true);
				// Centro el diálogo en pantalla
				dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
						(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
				// Muestro el diálogo en pantalla
				dialogo.setVisible(true);
			}
		});
		toolBar.add(btnCursos);
		
		
	}

}

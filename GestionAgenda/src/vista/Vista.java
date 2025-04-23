package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.Contacto;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
    private Controlador controlador; 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea nombreArea = new JTextArea();
		nombreArea.setBounds(117, 34, 137, 33);
		contentPane.add(nombreArea);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombre.setBounds(23, 32, 101, 40);
		contentPane.add(lblNombre);
		
		JLabel lblApellidosopcional = new JLabel("Apellidos (Opcional)");
		lblApellidosopcional.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblApellidosopcional.setBounds(23, 83, 231, 40);
		contentPane.add(lblApellidosopcional);
		
		JTextArea apellidosArea = new JTextArea();
		apellidosArea.setBounds(117, 134, 137, 33);
		contentPane.add(apellidosArea);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNumero.setBounds(23, 134, 101, 33);
		contentPane.add(lblNumero);
		
		JLabel lblNewLabel = new JLabel("DISCLAMER");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(23, 244, 357, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblLosBotonesFuncionan = new JLabel("Los botones funcionan teniendo en cuenta  el numero especificado");
		lblLosBotonesFuncionan.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLosBotonesFuncionan.setForeground(Color.RED);
		lblLosBotonesFuncionan.setBounds(25, 324, 688, 40);
		contentPane.add(lblLosBotonesFuncionan);
		
		JLabel lblRetExitError = new JLabel("");
		lblRetExitError.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblRetExitError.setBounds(23, 200, 101, 33);
		contentPane.add(lblRetExitError);
		
		JTextArea numeroArea = new JTextArea();
		numeroArea.setBounds(230, 90, 137, 33);
		contentPane.add(numeroArea);
		
		JButton btnAgregarContacto = new JButton("Agregar Contacto");
		btnAgregarContacto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String nombre = nombreArea.getText();
				String apellidos = apellidosArea.getText();
				try {
					int numero = Integer.parseInt(numeroArea.getText());
					controlador.aniadirContacto(nombre, apellidos, numero);
				}catch(NumberFormatException nfe) {
					lblRetExitError.setText("¡Solo se pueden introducir numero en el numero!");;
				}
				
				
				
				
			}
		});
		btnAgregarContacto.setBounds(23, 395, 163, 40);
		contentPane.add(btnAgregarContacto);
		
		JButton btnEditarContacto = new JButton("Editar Contacto");
		btnEditarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditarContacto.setBounds(207, 395, 163, 40);
		contentPane.add(btnEditarContacto);
		
		JButton btnBorrarContacto = new JButton("Borrar Contacto");
		btnBorrarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrarContacto.setBounds(390, 395, 163, 40);
		contentPane.add(btnBorrarContacto);
		
		
		
		table = new JTable();
		table.setBounds(376, 27, 337, 226);
		contentPane.add(table);
		
		JButton btnMostrarContactos = new JButton("Mostrar Contactos");
		btnMostrarContactos.setBounds(563, 395, 163, 40);
		contentPane.add(btnMostrarContactos);
		
		
	}
}

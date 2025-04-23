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
import java.io.FileNotFoundException;
import java.io.IOException;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
    private Controlador controlador; 

	/**
	 * Create the frame.
	 */
	public Vista(Controlador c) {
		
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
		
		JTextArea numeroArea = new JTextArea();
		numeroArea.setBounds(117, 134, 137, 33);
		contentPane.add(numeroArea);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNumero.setBounds(23, 134, 101, 33);
		contentPane.add(lblNumero);
		
		JLabel lblNewLabel = new JLabel("DISCLAMER");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(23, 257, 231, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblLosBotonesFuncionan = new JLabel("Los botones funcionan teniendo en cuenta  el numero especificado");
		lblLosBotonesFuncionan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLosBotonesFuncionan.setForeground(Color.RED);
		lblLosBotonesFuncionan.setBounds(25, 282, 688, 40);
		contentPane.add(lblLosBotonesFuncionan);
		
		JLabel lblRetExitError = new JLabel("");
		lblRetExitError.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRetExitError.setBounds(23, 192, 344, 53);
		contentPane.add(lblRetExitError);
		
		JTextArea apellidosArea = new JTextArea();
		apellidosArea.setBounds(230, 90, 137, 33);
		contentPane.add(apellidosArea);
		
		JButton btnAgregarContacto = new JButton("Agregar Contacto");
		btnAgregarContacto.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombre = nombreArea.getText();
		        String apellidos = numeroArea.getText();
		        if (nombre.isEmpty() || apellidos.isEmpty() || numeroArea.getText().isEmpty()) {
		            lblRetExitError.setText("¡Completa todos los campos!");
		            return;
		        }else {
		        	try {
		        		System.out.println(numeroArea.getText().trim());
			            int numero = Integer.parseInt(numeroArea.getText().trim());
			            controlador.aniadirContacto(nombre, apellidos, numero);
			            lblRetExitError.setText("Contacto agregado correctamente.");
			            nombreArea.setText("");
				        apellidosArea.setText("");
				        numeroArea.setText("");
				        lblRetExitError.setText("Contacto agregador correctamente");
			        } catch (NumberFormatException nfe) {
			            lblRetExitError.setText("¡Solo se pueden introducir números en el número!");
			        }
			        
		        }
		    }
		});
		btnAgregarContacto.setBounds(23, 333, 163, 40);
		contentPane.add(btnAgregarContacto);
		
		JButton btnEditarContacto = new JButton("Editar Contacto");
		btnEditarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditarContacto.setBounds(23, 395, 163, 40);
		contentPane.add(btnEditarContacto);
		
		JButton btnBorrarContacto = new JButton("Borrar Contacto");
		btnBorrarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrarContacto.setBounds(204, 333, 163, 40);
		contentPane.add(btnBorrarContacto);
		
		
		
		table = new JTable();
		table.setBounds(376, 27, 337, 226);
		contentPane.add(table);
		
		JButton btnMostrarContactos = new JButton("Mostrar Contactos");
		btnMostrarContactos.setBounds(204, 395, 163, 40);
		contentPane.add(btnMostrarContactos);
		
		JButton btnGuardarCambios = new JButton("Guardar Cambios");
		btnGuardarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controlador.guardarCambios();
					lblRetExitError.setText("Se ha guardado correctamente");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnGuardarCambios.setBounds(376, 395, 163, 40);
		contentPane.add(btnGuardarCambios);
		
		
	}
}

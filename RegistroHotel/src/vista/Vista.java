package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre, textFieldApellidos,textFieldNumero, textFieldBuscar;
	private JComboBox<String> comboBox;
	private JCheckBox chckbxTodoIncluido;
	private JButton btnHacerReserva, btnEditarReserva, btnBuscarReserva ;
	
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("* Nombre: ");
		lblNombre.setBounds(29, 29, 67, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(29, 57, 58, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblNumero = new JLabel("* Numero:");
		lblNumero.setBounds(29, 82, 74, 14);
		contentPane.add(lblNumero);
		
		JLabel lblDisclaimer = new JLabel("Los atributos obligatorios están marcados con  *");
		lblDisclaimer.setBounds(29, 285, 257, 29);
		contentPane.add(lblDisclaimer);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(96, 26, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(96, 54, 86, 20);
		contentPane.add(textFieldApellidos);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(96, 79, 86, 20);
		contentPane.add(textFieldNumero);
		
		JLabel lblHabitacion = new JLabel("* Habitacion: ");
		lblHabitacion.setBounds(29, 114, 74, 14);
		contentPane.add(lblHabitacion);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Luxury", "Super_Luxury", "Suit", "Presidential_Suit"}));
		comboBox.setBounds(106, 110, 86, 22);
		contentPane.add(comboBox);
		
		chckbxTodoIncluido = new JCheckBox("Todo incluido");
		chckbxTodoIncluido.setBounds(34, 149, 119, 23);
		contentPane.add(chckbxTodoIncluido);
		
		btnHacerReserva = new JButton("Hacer reserva");
		btnHacerReserva.setBounds(29, 210, 124, 23);
		contentPane.add(btnHacerReserva);
		
		JLabel lblSiYaTiene = new JLabel("Si ya tiene una reserva busquela por su id");
		lblSiYaTiene.setBounds(311, 0, 232, 29);
		contentPane.add(lblSiYaTiene);
		
		btnEditarReserva = new JButton("Editar reserva");
		btnEditarReserva.setBounds(162, 210, 124, 23);
		contentPane.add(btnEditarReserva);
		
		textFieldBuscar = new JTextField();
		textFieldBuscar.setColumns(10);
		textFieldBuscar.setBounds(394, 40, 86, 20);
		contentPane.add(textFieldBuscar);
		
		JLabel lblBuscar = new JLabel("Buscar: ");
		lblBuscar.setBounds(332, 43, 52, 14);
		contentPane.add(lblBuscar);
		
		btnBuscarReserva = new JButton("Buscar Reserva");
		btnBuscarReserva.setBounds(342, 78, 124, 23);
		contentPane.add(btnBuscarReserva);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JTextField getTextFieldApellidos() {
		return textFieldApellidos;
	}

	public void setTextFieldApellidos(JTextField textFieldApellidos) {
		this.textFieldApellidos = textFieldApellidos;
	}

	public JTextField getTextFieldNumero() {
		return textFieldNumero;
	}

	public void setTextFieldNumero(JTextField textFieldNumero) {
		this.textFieldNumero = textFieldNumero;
	}

	public JTextField getTextFieldBuscar() {
		return textFieldBuscar;
	}

	public void setTextFieldBuscar(JTextField textFieldBuscar) {
		this.textFieldBuscar = textFieldBuscar;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JCheckBox getChckbxTodoIncluido() {
		return chckbxTodoIncluido;
	}

	public void setChckbxTodoIncluido(JCheckBox chckbxTodoIncluido) {
		this.chckbxTodoIncluido = chckbxTodoIncluido;
	}

	public JButton getBtnHacerReserva() {
		return btnHacerReserva;
	}

	public void setBtnHacerReserva(JButton btnHacerReserva) {
		this.btnHacerReserva = btnHacerReserva;
	}

	public JButton getBtnEditarReserva() {
		return btnEditarReserva;
	}

	public void setBtnEditarReserva(JButton btnEditarReserva) {
		this.btnEditarReserva = btnEditarReserva;
	}

	public JButton getBtnBuscarReserva() {
		return btnBuscarReserva;
	}

	public void setBtnBuscarReserva(JButton btnBuscarReserva) {
		this.btnBuscarReserva = btnBuscarReserva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void Error(String mensaje) {
		
		
		
	}
}

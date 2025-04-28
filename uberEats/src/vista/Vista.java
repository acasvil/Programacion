package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JCheckBox chckbxHamburguesa, chckbxPatatas,chckbxcocaCola, chckbxHelado;
	private JButton btnAniadir, btnBuscar, btnMostrarDatos;
	private JTextPane textPaneRespuesta;
	
	public Vista() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 29, 491, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(129, 11, 76, 39);
		panel.add(lblNombre);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 17));
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(228, 22, 157, 20);
		panel.add(textFieldNombre);
		textFieldNombre.setText("Introduzca su nombre");
		textFieldNombre.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 111, 491, 62);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		chckbxHamburguesa = new JCheckBox("Hamburguesa");
		chckbxHamburguesa.setBounds(58, 14, 97, 37);
		panel_1.add(chckbxHamburguesa);
		
		chckbxPatatas = new JCheckBox("Patatas");
		chckbxPatatas.setBounds(157, 14, 83, 37);
		panel_1.add(chckbxPatatas);
		
		chckbxcocaCola = new JCheckBox("Coca cola");
		chckbxcocaCola.setBounds(247, 14, 83, 37);
		panel_1.add(chckbxcocaCola);
		
		chckbxHelado = new JCheckBox("Helado");
		chckbxHelado.setBounds(344, 14, 97, 37);
		panel_1.add(chckbxHelado);
		
		btnAniadir = new JButton("Añadir");
		btnAniadir.setBounds(55, 194, 130, 36);
		contentPane.add(btnAniadir);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(202, 194, 130, 36);
		contentPane.add(btnBuscar);
		
		btnMostrarDatos = new JButton("Mostar Datos");
		btnMostrarDatos.setBounds(354, 194, 130, 36);
		contentPane.add(btnMostrarDatos);
		
		textPaneRespuesta = new JTextPane();
		textPaneRespuesta.setBounds(20, 270, 491, 49);
		contentPane.add(textPaneRespuesta);
		
		// Después de añadir textPaneRespuesta
		contentPane.add(textPaneRespuesta);

		// Estas dos líneas nuevas:
		contentPane.revalidate();
		contentPane.repaint();

		setVisible(true);

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

	public JCheckBox getChckbxHamburguesa() {
		return chckbxHamburguesa;
	}

	public void setChckbxHamburguesa(JCheckBox chckbxHamburguesa) {
		this.chckbxHamburguesa = chckbxHamburguesa;
	}

	public JCheckBox getChckbxPatatas() {
		return chckbxPatatas;
	}

	public void setChckbxPatatas(JCheckBox chckbxPatatas) {
		this.chckbxPatatas = chckbxPatatas;
	}

	public JCheckBox getChckbxcocaCola() {
		return chckbxcocaCola;
	}

	public void setChckbxcocaCola(JCheckBox chckbxcocaCola) {
		this.chckbxcocaCola = chckbxcocaCola;
	}

	public JCheckBox getChckbxHelado() {
		return chckbxHelado;
	}

	public void setChckbxHelado(JCheckBox chckbxHelado) {
		this.chckbxHelado = chckbxHelado;
	}

	public JButton getBtnAniadir() {
		return btnAniadir;
	}

	public void setBtnAniadir(JButton btnAniadir) {
		this.btnAniadir = btnAniadir;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnMostarTodo() {
		return btnMostrarDatos;
	}

	public void setBtnMostarTodo(JButton btnMostarTodo) {
		this.btnMostrarDatos = btnMostarTodo;
	}

	public JTextPane getTextPaneRespuesta() {
		return textPaneRespuesta;
	}

	public void setTextPaneRespuesta(JTextPane textPaneRespuesta) {
		this.textPaneRespuesta = textPaneRespuesta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

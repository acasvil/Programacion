package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JCheckBox chckbxHamburguesa, chckbxPatatas,chckbxcocaCola, chckbxHelado;
	private JButton btnAniadir, btnBuscar, btnMostrarDatos;
	private JTextPane textPaneRespuesta;
	
	public Vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 21, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);

		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(115, 21, 86, 21);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 17));
		contentPane.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setToolTipText("");
		textFieldNombre.setBounds(199, 23, 168, 21);
		textFieldNombre.setColumns(10);
		contentPane.add(textFieldNombre);
		
		chckbxHamburguesa = new JCheckBox("Hamburguesa");
		chckbxHamburguesa.setBounds(79, 77, 108, 23);
		contentPane.add(chckbxHamburguesa);
		
		chckbxPatatas = new JCheckBox("Patatas");
		chckbxPatatas.setBounds(189, 77, 80, 23);
		contentPane.add(chckbxPatatas);
		
		chckbxcocaCola = new JCheckBox("Coca cola");
		chckbxcocaCola.setBounds(271, 77, 96, 23);
		contentPane.add(chckbxcocaCola);
		
		chckbxHelado = new JCheckBox("Helado");
		chckbxHelado.setBounds(369, 77, 80, 23);
		contentPane.add(chckbxHelado);
		
		btnAniadir = new JButton("Añadir");
		btnAniadir.setBounds(27, 124, 121, 33);
		contentPane.add(btnAniadir);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(199, 124, 121, 33);
		contentPane.add(btnBuscar);
		
		btnMostrarDatos = new JButton("Mostar Datos");
		btnMostrarDatos.setBounds(352, 124, 121, 33);
		contentPane.add(btnMostrarDatos);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(27, 186, 446, 55);
		contentPane.add(textPane);
	

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

	public JButton getBtnMostrarDatos() {
		return btnMostrarDatos;
	}

	public void setBtnMostrarDatos(JButton btnMostrarDatos) {
		this.btnMostrarDatos = btnMostrarDatos;
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

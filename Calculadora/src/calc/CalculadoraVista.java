package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraVista frame = new CalculadoraVista();
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
	
	String firstNum = "";
	String secondNum = "";
	int firstIntNum = 0;
	int secondIntNum = 0;
	boolean firstSec = false;
	String operacion = "";
	
	
	public CalculadoraVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Calculadora");
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "4";
				
				}else {
					secondNum += "4";
					
				}
			}
		});
		btn4.setBounds(0, 240, 112, 83);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "1";
					
				}else {
					secondNum += "1";
				}
			}
		});
		btn1.setBounds(0, 324, 112, 83);
		contentPane.add(btn1);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "5";
				
				}else {
					secondNum += "5";
					
				}
			}
		});
		btn5.setBounds(111, 240, 112, 83);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "6";
				
				}else {
					secondNum += "6";
					
				}
			}
		});
		btn6.setBounds(222, 240, 112, 83);
		contentPane.add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "2";
				
				}else {
					secondNum += "2";
					
				}
			}
		});
		btn2.setBounds(111, 324, 112, 83);
		contentPane.add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "0";
				
				}else {
					secondNum += "0";
					
				}
			}
		});
		btn0.setBounds(0, 407, 223, 83);
		contentPane.add(btn0);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "3";
				
				}else {
					secondNum += "3";
					
				}
			}
		});
		btn3.setBounds(222, 324, 112, 83);
		contentPane.add(btn3);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondIntNum = Integer.parseInt(secondNum);
				
				if(operacion.equalsIgnoreCase("-")) {
					System.out.println(firstIntNum - secondIntNum);
				}
				
				firstSec=false;
				firstNum="0";
				secondNum="0";
				
			}
		});
		btnIgual.setBounds(222, 407, 112, 83);
		contentPane.add(btnIgual);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstSec == false) {
					firstNum += "5";
				
				}else {
					secondNum += "4";
					
				}
			}
		});
		btn7.setBounds(0, 158, 112, 83);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn8.setBounds(111, 158, 112, 83);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btn9.setBounds(222, 158, 112, 83);
		contentPane.add(btn9);
		
		JButton btnMas = new JButton("+");
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnMas.setBounds(344, 158, 90, 83);
		contentPane.add(btnMas);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnMenos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				firstIntNum = Integer.parseInt(firstNum);
				firstSec = true;
				operacion = "-";
			}
		});
		btnMenos.setBounds(344, 240, 90, 83);
		contentPane.add(btnMenos);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnMult.setBounds(344, 324, 90, 83);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("%");
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnDiv.setBounds(344, 407, 90, 83);
		contentPane.add(btnDiv);
		
		JLabel lblPantalla = new JLabel("00");
		lblPantalla.setBackground(new Color(192, 192, 192));
		lblPantalla.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblPantalla.setBounds(10, 28, 424, 93);
		contentPane.add(lblPantalla);
	}
}

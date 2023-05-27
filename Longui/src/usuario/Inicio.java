package usuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("Software financiero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Sistema Contable Financiero ");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 65, 396, 53);
		contentPane.add(lblNewLabel);
		
		JButton SalirButton = new JButton("Salir ");
		SalirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		SalirButton.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		SalirButton.setBounds(87, 176, 94, 19);
		contentPane.add(SalirButton);
		
		JButton IngresarButton = new JButton(" Ingresar");
		IngresarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Logeon p = new Logeon ();
				 JButton sourceButton = (JButton) e.getSource();
	             Inicio inicio = (Inicio) sourceButton.getTopLevelAncestor();	
				 p.setSplash(inicio);
				 p.setVisible(true);	
			}
		});
		IngresarButton.setFont(new Font("Modern No. 20", Font.PLAIN, 16));
		IngresarButton.setBounds(278, 176, 100, 19);
		contentPane.add(IngresarButton);
		
		
	}
}

package usuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logeon extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField jpassClave;
	private Inicio splash;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeon frame = new Logeon();
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
	public Logeon (Inicio splash)  {}
	//Pasar referencia//
	public void setSplash(Inicio splash) {
		this.splash = splash;
	}
	
	public Logeon() {
		setTitle("Seguridad del Sistema Contable Financiero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Control de Acceso");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(70, 11, 262, 44);
		contentPane.add(lblNewLabel);
		
		JLabel Usuariolbl = new JLabel("Usuario");
		Usuariolbl.setFont(new Font("Modern No. 20", Font.BOLD, 22));
		Usuariolbl.setBounds(10, 77, 82, 17);
		contentPane.add(Usuariolbl);
		
		JLabel Contraseñalbl = new JLabel("Contraseña");
		Contraseñalbl.setFont(new Font("Modern No. 20", Font.BOLD, 21));
		Contraseñalbl.setBounds(10, 138, 109, 20);
		contentPane.add(Contraseñalbl);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(120, 74, 198, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(120, 139, 198, 19);
		contentPane.add(jpassClave);
		
		JButton IngresarButton = new JButton("Ingresar");
		IngresarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			char [ ] clave = jpassClave.getPassword();	
			String claveFinal = new String(clave);	
		    if(textUsuario.getText().equals("KDM") && claveFinal.equals("040307")){	
		    splash.setVisible(false);
			Logeon.this.dispose();	
			JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA CONTABLE FINANCIERO", "INGRESASTES",JOptionPane.INFORMATION_MESSAGE);
			Principal abrir = new Principal ();
			abrir.setExtendedState(MAXIMIZED_BOTH);
		    abrir.setVisible(true);    
		    }
		    else { 
		    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR",
		    			JOptionPane.ERROR_MESSAGE);
		    textUsuario.setText(null);
			jpassClave.setText(null);
		    }
			}
			
		});
		IngresarButton.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		IngresarButton.setBounds(288, 196, 97, 20);
		contentPane.add(IngresarButton);
		
		JButton SalirButton = new JButton("Salir ");
		SalirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		SalirButton.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		SalirButton.setBounds(69, 196, 89, 20);
		contentPane.add(SalirButton);
		
	   
	}
}

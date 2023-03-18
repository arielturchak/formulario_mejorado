package Grafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.Window.Type;

public class Formulario1 extends javax.swing.JFrame {

	
		private JPanel contentPane;
		private JTextField textUsuario;
		private JPasswordField jpassClave;
		private JButton btnIngresar;
		private JLabel lblLogo;
		private JLabel lblEscudo;
		
		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Formulario1 frame = new Formulario1();
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
		public Formulario1() {
			setFont(new Font("Arial", Font.PLAIN, 16));
			setVisible(true);
			setTitle("INGRESAR");
			setResizable(false);
			setIconImage(Toolkit.getDefaultToolkit().getImage(Formulario1.class.getResource("/Imagenes/icons8-marvel-48.png")));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 681, 417);
			//setExtendedState(Frame.MAXIMIZED_BOTH); para extenderlo a pantalla completa
			setLocationRelativeTo(null);//centrar la ventana
			contentPane = new JPanel();
			contentPane.setForeground(Color.BLACK);
			contentPane.setBackground(new Color(255, 235, 205));
			contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblUsuario = new JLabel("USUARIO:");
			lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setFont(new Font("Arial", Font.BOLD, 16));
			lblUsuario.setBounds(105, 240, 89, 16);
			contentPane.add(lblUsuario);
			
			JLabel lblcontraseña = new JLabel("CONTRASEÑA:");
			lblcontraseña.setForeground(Color.WHITE);
			lblcontraseña.setFont(new Font("Arial", Font.BOLD, 16));
			lblcontraseña.setBounds(65, 294, 139, 16);
			contentPane.add(lblcontraseña);
			
			textUsuario = new JTextField();
			textUsuario.setCaretColor(Color.WHITE);
			textUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			textUsuario.setForeground(Color.WHITE);
			textUsuario.setBackground(Color.BLACK);
			textUsuario.setFont(new Font("Arial", Font.BOLD, 12));
			textUsuario.setBounds(216, 237, 300, 26);
			contentPane.add(textUsuario);
			textUsuario.setColumns(10);
			
			jpassClave = new JPasswordField();
			jpassClave.setCaretColor(Color.WHITE);
			jpassClave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			jpassClave.setColumns(10);
			jpassClave.setForeground(Color.WHITE);
			jpassClave.setBackground(Color.BLACK);
			jpassClave.setFont(new Font("Arial", Font.BOLD, 14));
			jpassClave.setBounds(216, 291, 300, 26);
			contentPane.add(jpassClave);
			
			btnIngresar = new JButton("INGRESAR");
			btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnIngresar.setForeground(Color.BLUE);
			btnIngresar.setBackground(Color.WHITE);
			btnIngresar.setFont(new Font("Arial", Font.BOLD, 13));
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//crear eventos
					
					char[] clave = jpassClave.getPassword();
					String claveFinal = new String (clave);
					
					if(textUsuario.getText().equals("Ariel") && claveFinal.equals("123")) {
						dispose();//para cerrar la ventana actual
						JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Ingresaste", JOptionPane.INFORMATION_MESSAGE);
						
						formulario2 p = new formulario2();
						p.setVisible(true);
						
					}else{
						JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos","Error", JOptionPane.ERROR_MESSAGE);
						textUsuario.setText("");//borramos el usuario o contraseña equivocados
						jpassClave.setText("");
						textUsuario.requestFocus();//dejamos el campo vacio 
					}
				}
			});
			btnIngresar.setBounds(285, 329, 117, 29);
			contentPane.add(btnIngresar);
			
			lblLogo = new JLabel("");
			lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogo.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/pngwing.com (2) (1).png")));
			lblLogo.setBounds(216, 37, 292, 187);
			contentPane.add(lblLogo);
			
			lblEscudo = new JLabel("");
			lblEscudo.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/pngwing.com (4) (1).png")));
			lblEscudo.setBounds(491, 201, 184, 160);
			contentPane.add(lblEscudo);
			
			JLabel lblFondoAzul = new JLabel("");
			lblFondoAzul.setFont(new Font("Arial", Font.BOLD, 14));
			lblFondoAzul.setForeground(SystemColor.control);
			lblFondoAzul.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/fondoAzul.jpg")));
			lblFondoAzul.setBounds(0, 0, 700, 389);
			contentPane.add(lblFondoAzul);
		}
	}

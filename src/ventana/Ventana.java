package ventana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Ventana extends JFrame {

	public Ventana() {
        setVisible(true);
        setTitle("user login");
        setSize(700, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.componentes();
    }

    public void componentes() {
    	JPanel login = new JPanel();
        login.setSize(700, 550);
        login.setLocation(0, 0);
        login.setLayout(null);
        login.setBackground(new Color(13, 61, 131 ));
        
        
        JLabel img = new JLabel("");
        img.setIcon(new ImageIcon(getClass().getResource("/userIcon.png")));
        img.setLocation(170, 200); 
        img.setSize(500, 30); 
        login.add(img);
        
        JLabel img2 = new JLabel("");
        img2.setIcon(new ImageIcon(getClass().getResource("/candado.png")));
        img2.setLocation(170, 280); 
        img2.setSize(500, 30); 
        login.add(img2);
        
   
        JLabel user = new JLabel("User Login");
        user.setLocation(280, 20); 
        user.setSize(200, 40); 
        user.setFont(new Font("signPainter", Font.BOLD, 30));
        user.setForeground(Color.white);
        login.add(user);

        JLabel title = new JLabel("My account", SwingConstants.CENTER);
        title.setLocation(220, 80 );
        title.setSize(250, 100);
        title.setFont(new Font("signPainter", Font.BOLD, 40));
        title.setForeground(Color.YELLOW);
        login.add(title);

    
        
        JLabel usuario = new JLabel("Enter your username", SwingConstants.CENTER);
        usuario.setLocation(170, 170);
        usuario.setSize(180, 30);
        usuario.setFont(new Font("signPainter", Font.BOLD, 12));
        usuario.setForeground(Color.white);
        login.add(usuario);

        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(200, 200, 280, 30);
        login.add(usuarioField);

        JLabel contraseña = new JLabel("Enter your password", SwingConstants.CENTER);
        contraseña.setLocation(120, 250);
        contraseña.setSize(280, 30);
        contraseña.setFont(new Font("signPainter", Font.BOLD, 12));
        contraseña.setForeground(Color.white);
        login.add(contraseña);

        JPasswordField contraseñaField = new JPasswordField();
        contraseñaField.setBounds(200, 280, 280, 30);
        contraseñaField.setOpaque(true);
        login.add(contraseñaField);

        JButton acceder = new JButton("Acceder");
        acceder.setBounds(270, 320, 140, 50);
       
        acceder.setBackground(Color.YELLOW);
        login.add(acceder);
        
        JLabel cuenta = new JLabel("¿Don't have a account?", SwingConstants.CENTER);
        cuenta.setLocation(250, 380);
        cuenta.setSize(180, 30);
        cuenta.setForeground(Color.WHITE);
        login.add(cuenta);

        JButton registro = new JButton("sign up");
        registro.setBounds(250, 420, 180, 30);
        registro.setBackground(Color.YELLOW);
        login.add(registro);
        
        
        
        JPanel login2 = new JPanel();
        login2.setSize(500, 300);
        login2.setLocation(100, 80);
        login2.setLayout(null);
        login2.setBackground(new Color( 13, 54, 113));
        login.add(login2);
        
        
    
        
        this.add(login); 
        this.repaint();
        
    }
			
		}
	


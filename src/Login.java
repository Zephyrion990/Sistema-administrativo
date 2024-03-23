import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	public Login() {
        setLayout(null);

        // Titulo
        JLabel lblTitulo = new JLabel("Inicio de Sesion");
        lblTitulo.setBounds(150, 90, 300, 50);
        add(lblTitulo);

        // Usuario
        JLabel lblusuario = new JLabel("Usuario:");
        lblusuario.setBounds(150, 160, 200, 30);
        add(lblusuario);

        JTextField tfUsuario = new JTextField();
        tfUsuario.setBounds(150, 190, 200, 30);
        add(tfUsuario);

        // Contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(150, 220, 200, 30);
        add(lblPassword);

        JPasswordField password = new JPasswordField();
        password.setBounds(150, 250, 200, 30);
        add(password);
        
        // Botones
        JButton btnCambio = new JButton("¿Olvistaste tu contraseña?");
        btnCambio.setBorderPainted(false);
        btnCambio.setBounds(150, 290, 200, 40);
        add(btnCambio);

        JButton btnLogin = new JButton("Iniciar");
        btnLogin.setBounds(255, 340, 99, 40);
        add(btnLogin);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds (150, 340, 99, 40);
        add(btnCancelar);
	}
}

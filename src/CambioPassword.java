import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CambioPassword extends JPanel{
	public CambioPassword() {
        setLayout(null);
        
        JLabel lblTitulo = new JLabel("Cambiar Contraseña");
        lblTitulo.setBounds(150, 90, 300, 50);
        add(lblTitulo);

        // Usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(150, 160, 200, 30);
        add(lblUsuario);

        JTextField tfUsuario = new JTextField();
        tfUsuario .setBounds(150, 190, 200, 30);
        add(tfUsuario );
        
        // Nueva contraseña
        JLabel lblnewPassword = new JLabel("Nueva Contraseña:");
        lblnewPassword.setBounds(150, 220, 200, 30);
        add(lblnewPassword);

        JPasswordField newPasswordField = new JPasswordField();
        newPasswordField.setBounds(150, 250, 200, 30);
        add(newPasswordField);

        // botones 
        JButton btncambiar = new JButton("Cambiar");
        btncambiar.setBounds(255, 300, 100, 40);
        add(btncambiar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(150, 300, 100, 40);
        add(btnCancelar);
    }
}

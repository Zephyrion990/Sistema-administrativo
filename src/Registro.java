import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends JPanel{
	public Registro() {
		setLayout(null);
				
				//setBackground(Color.BLACK);
				
				JLabel lbltitulo = new JLabel("Nuevo Usuario");
				lbltitulo.setBounds(150, 90, 200, 50);
				add(lbltitulo);
				
				JLabel lblusuario = new JLabel("Usuario");
				lblusuario.setBounds(150, 140, 200, 50);
				add(lblusuario);
				
				JTextField txtUsuario = new JTextField();
				txtUsuario.setBounds(150, 180, 200, 30);
				add(txtUsuario);
				
				JLabel lblCorreo = new JLabel("Correo");
				lblCorreo.setBounds(150, 230, 200, 50);
				add(lblCorreo);
				
				JTextField tfCorreo = new JTextField();
				tfCorreo.setBounds(150, 270, 200, 30);
				add(tfCorreo);
				
				JLabel lblContrasena = new JLabel("Contraseña");
				lblContrasena.setBounds(150, 320, 200, 50);
				add(lblContrasena);
				
				JPasswordField pfContraseña = new JPasswordField();
				pfContraseña.setBounds(150, 360, 200, 30);
				add(pfContraseña);
				
				JCheckBox cb = new JCheckBox("Acepto terminos y condiciones");
				cb.setBounds(150, 410, 200, 30);
				add(cb);
				
				JButton btncancelar = new JButton("Cancelar");
				btncancelar.setBorderPainted(false);
				btncancelar.setBounds(150, 460,90, 40);
				add(btncancelar);
				
				JButton btnaceptar = new JButton("Aceptar");
				btnaceptar.setBorderPainted(false);
				btnaceptar.setBounds(255, 460,90, 40);
				add(btnaceptar);
			}
}

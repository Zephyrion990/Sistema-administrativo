import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MyFrame extends JFrame {
    public MyFrame() {
    	
    	// Tamaño
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setTitle("Sistema Administrativo");
        setBounds(screenWidth / 2, screenHeight / 2, 500, 700);
        setLocationRelativeTo(null);
        setResizable(true);

        JTabbedPane tabbedPane = new JTabbedPane();
        Registro registroPanel = new Registro();
        Login loginPanel = new Login();
        CambioPassword cambiarPasswordPanel = new CambioPassword();
        Menu menu = new Menu();
        
        
        //operaciones
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu menu1=new JMenu("Opciones");
        mb.add(menu1);
        
        JMenu mi1 = new JMenu("Archivo");
        menu1.add(mi1);
        JMenuItem mi2 = new JMenu("Guardar");
        menu1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("Mas");
        mi2.add(mi3);
        JMenuItem mi4 =new JMenuItem("Compartir");
        mi1.add(mi4);
        
        //
        tabbedPane.addTab("Registro", registroPanel);
        tabbedPane.addTab("Login", loginPanel);
        tabbedPane.addTab("Cambiar Contraseña", cambiarPasswordPanel);
        tabbedPane.addTab("Menu", menu);

        add(tabbedPane);
	}
}
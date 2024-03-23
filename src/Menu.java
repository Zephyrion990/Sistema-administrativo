import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Menu extends JPanel {
	 public Menu() {
	   	 setLayout(null);
	        
	        JPanel panelCentral = new JPanel();
	        SpringLayout springLayout = new SpringLayout();
	        panelCentral.setLayout(springLayout);
	        panelCentral.setBounds(20, 20, 800, 800);
	        add(panelCentral);

	        JLabel etiqueta = new JLabel("Texto:");
	        JTextField textField = new JTextField(15);
	        panelCentral.add(etiqueta);
	        panelCentral.add(textField);

	        springLayout.putConstraint(SpringLayout.WEST, etiqueta, 10, SpringLayout.WEST, panelCentral);
	        springLayout.putConstraint(SpringLayout.NORTH, etiqueta, 10, SpringLayout.NORTH, panelCentral);
	        springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.EAST, etiqueta);
	        springLayout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, panelCentral);
	    }
}

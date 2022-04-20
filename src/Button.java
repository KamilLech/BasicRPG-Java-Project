import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton{
	Color primaryColor;
	Color secondaryColor;
	
	String buttonText;
	Button(String buttonText){
		this.buttonText = buttonText;
//		this.setPreferredSize(new Dimension(200,200));
		this.setPreferredSize(new Dimension(200,50));
//		this.setMaximumSize(new Dimension(200,200));
//		this.setMinimumSize(new Dimension(200,200));
		this.setFocusable(false);
		this.setText(buttonText);
		
		primaryColor = Main.theme.getPrimaryColor();
		secondaryColor = Main.theme.getSecondaryColor();
		this.setForeground(primaryColor);
		this.setBackground(Color.white);
	}

	
	
}

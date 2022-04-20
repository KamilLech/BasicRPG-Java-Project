import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Window implements ActionListener{

	JFrame frame;
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	Button button1;
	
	public Window(int width, int height, String title){
		
		frame = new JFrame(title);
		
		ImageIcon logo = new ImageIcon("logo.png");
		frame.setIconImage(logo.getImage());
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("Plik");
		editMenu = new JMenu("Edycja");
		helpMenu = new JMenu("Pomoc");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		

		fileMenu.setMnemonic(KeyEvent.VK_P);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_O);
		
		Color backgroundColor = Main.theme.getBackgroundColor();
		frame.getContentPane().setBackground(backgroundColor);
		
		button1 = new Button("testuj zręczność");
		button1.addActionListener(this);
		
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			DiceBag diceBag = new DiceBag();
			Dice k100 = diceBag.getK100();
			int wynikRzutu;
			wynikRzutu = k100.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
			CharacterSheet charater = new CharacterSheet("Bob", 22, 60, 50, 6);
			System.out.println("Czy zdany test: "+charater.traitTest("dexterity", wynikRzutu));
		}
		
	}
}

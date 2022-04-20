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

public class DiceBagWindow implements ActionListener{

	JFrame frame;
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	Button buttonK4;
	Button buttonK6;
	Button buttonK8;
	Button buttonK10;
	Button buttonK12;
	Button buttonK20;
	Button buttonK100;
	
	public DiceBagWindow(int width, int height, String title){
		
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
		
		buttonK4 = new Button("Rzuć K4");
		buttonK4.addActionListener(this);
		buttonK6 = new Button("Rzuć K6");
		buttonK6.addActionListener(this);
		buttonK8 = new Button("Rzuć K8");
		buttonK8.addActionListener(this);
		buttonK10 = new Button("Rzuć K10");
		buttonK10.addActionListener(this);
		buttonK12 = new Button("Rzuć K12");
		buttonK12.addActionListener(this);
		buttonK20 = new Button("Rzuć K20");
		buttonK20.addActionListener(this);
		buttonK100 = new Button("Rzuć K100");
		buttonK100.addActionListener(this);
		
		frame.setLayout(new FlowLayout());
		
		frame.add(buttonK4);
		frame.add(buttonK6);
		frame.add(buttonK8);
		frame.add(buttonK10);
		frame.add(buttonK12);
		frame.add(buttonK20);
		frame.add(buttonK100);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == buttonK4) {
//			DiceBag diceBag = new DiceBag();
//			Dice k100 = diceBag.getK100();
//			int wynikRzutu;
//			wynikRzutu = k100.roll();
//			System.out.println("wynik rzutu: "+wynikRzutu);
//			CharacterSheet charater = new CharacterSheet("Bob", 22, 60, 50, 6);
//			System.out.println("Czy zdany test: "+charater.traitTest("dexterity", wynikRzutu));
//		}
		if(e.getSource() == buttonK4) {
			Dice k4 = DiceBag.getK4();
			int wynikRzutu;
			wynikRzutu = k4.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		if(e.getSource() == buttonK6) {
			Dice k6 = DiceBag.getK6();
			int wynikRzutu;
			wynikRzutu = k6.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		if(e.getSource() == buttonK8) {
			Dice k8 = DiceBag.getK8();
			int wynikRzutu;
			wynikRzutu = k8.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		if(e.getSource() == buttonK10) {
			Dice k10 = DiceBag.getK10();
			int wynikRzutu;
			wynikRzutu = k10.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		if(e.getSource() == buttonK12) {
			Dice k12 = DiceBag.getK12();
			int wynikRzutu;
			wynikRzutu = k12.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		if(e.getSource() == buttonK20) {
			Dice k20 = DiceBag.getK20();
			int wynikRzutu;
			wynikRzutu = k20.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		if(e.getSource() == buttonK100) {
			Dice k100 = DiceBag.getK100();
			int wynikRzutu;
			wynikRzutu = k100.roll();
			System.out.println("wynik rzutu: "+wynikRzutu);
		}
		
	}
}
package cs212unit4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Add more visual features to the GUI: it still does not respond to user interaction
//  that is the next step.

public class TreeArt2 extends JFrame {
	 public TreeArt2() {
		 setSize(1200, 1000);  // wide, height
		 Container content = getContentPane();
		 content.setLayout(new BorderLayout());  // a layout with a center and regions at N, S, E, W
		 
		 // In the North put a login panel --- the panel has 4 components
		 JPanel login = new JPanel();
		 content.add(login, BorderLayout.NORTH);
		 login.setLayout(new GridLayout(4,1));
		 login.add(new JLabel("Login:"));
		 login.add(new JTextField(20));
		 login.add(new JLabel("Password:"));
		 login.add(new JPasswordField(20));
		 
		 // At the East put a large area of text
		 JTextArea text = new JTextArea("This gui displays:\n A menu bar, Labels, Panels, Text and Buttons\n"
		 		+ "The GUI does not yet respond to user interactions \n"
				+ "but that functionality can be added later.\n"
		 		+ "The user can add a user name and password into their boxes.\n");
		 content.add(text, BorderLayout.EAST);
		 
		 // In the Center panel with buttons making a tree diagram.
		 
		 JPanel display = new JPanel();
		 display.setLayout(new GridLayout(10,21));
		 for (int r = 0; r < 10; r++) {
			 for (int c = 0; c < 21; c++) {
				 JButton b = new JButton();
				 if (c - 10 > -(r + 1) && c - 10 < r + 1)
					 b.setBackground(randomColor());
				 display.add(b);
			 }
		 }
		 content.add(display, BorderLayout.CENTER);
		 
		 // Add a menu bar at the top with some user options
		 JMenuBar menuBar = new JMenuBar();
		 this.setJMenuBar(menuBar);
		 JMenu options, help;
		 help = new JMenu("Help");
		 menuBar.add(help);
		 options = new JMenu("Options");
		 menuBar.add(options);
		 JMenuItem commandHelp = new JMenuItem("Help");
		 help.add(commandHelp);
		 JMenuItem instructions = new JMenuItem("Instructions");
		 help.add(instructions);
		 JMenuItem open = new JMenuItem("Open");
		 options.add(open);
		 JMenuItem file = new JMenuItem("File");
		 options.add(file);
		 
		 
		 setVisible(true);
	 }
	 
	 public Color randomColor() {
		Random r = new Random();
		return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

	public static void main(String args[]) {
		 TreeArt2 art = new TreeArt2();
	}
}
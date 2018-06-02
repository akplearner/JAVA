//package cs212unit4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random; //for color gen

import javax.swing.JButton;
import javax.swing.JFrame;

public class TreeArt extends JFrame {
	 public TreeArt() {
		 setSize(1000, 1000);  // wide, height
		 Container content = getContentPane();
		 content.setLayout(new GridLayout(10,21));
		 for (int r = 0; r < 10; r++) {
			 for (int c = 0; c < 21; c++) {
				 JButton b = new JButton();
				 if (c - 10 > -(r + 1) && c - 10 < r + 1)
					 b.setBackground(randomColor());
				 content.add(b);
			 }
		 }
		 setVisible(true);
	 }
	 
	 public Color randomColor() {
		Random r = new Random();
		return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

	public static void main(String args[]) {
		 TreeArt art = new TreeArt();
	}
}
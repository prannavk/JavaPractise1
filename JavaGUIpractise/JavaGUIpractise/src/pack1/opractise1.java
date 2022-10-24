package pack1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class opractise1 {
	
	opractise1() {
		JFrame jf = new JFrame();
		ImageIcon ic = new ImageIcon("bull.png");
		jf.setIconImage(ic.getImage());
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		JLabel l1 = new JLabel();
		l1.setText("Hey Man, How are you?");
		Border bd = BorderFactory.createLineBorder(Color.BLACK, 4);
		ImageIcon img = new ImageIcon("hoolilogo.png");
		l1.setIcon(img);
		l1.setHorizontalTextPosition(JLabel.RIGHT);
		l1.setVerticalTextPosition(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font("Comic Sans", Font.BOLD, 14));
		l1.setBackground(Color.LIGHT_GRAY);
		l1.setOpaque(true);
		l1.setBorder(bd);
		l1.setIconTextGap(40);
		//l1.setBounds(10, 10, 400, 400);

		jf.setTitle("WELCOME");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1080, 720);
		jf.setResizable(true);
		jf.setVisible(true);
		jf.add(l1);
		//jf.pack();
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		opractise1 op = new opractise1();
		

// 		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("Enter 1 word\n");
//		String w1 = sc.next();
//		sc.nextLine();
//		System.out.println("Enter 2 word\n");
//		String w2 = sc.nextLine();
//		System.out.println("Enter 3 words\n");
//		String w3 = sc.nextLine();
//		System.out.println(w1 + ", " + w2 + ", " + w3);

	}

}

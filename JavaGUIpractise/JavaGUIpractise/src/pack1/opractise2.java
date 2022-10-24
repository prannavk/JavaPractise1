package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.border.Border;

public class opractise2 implements ActionListener {

	private JFrame jf;
	private JPanel p1;
	private JPanel p2;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JPanel p3;
	private JButton jb1;

	opractise2() {
		jf = new JFrame();
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		p3 = new JPanel();
		jb1 = new JButton();
	}

	private void defineJFrame() {
		this.jf.setTitle("WORK1");
		this.jf.setSize(600, 800);
		this.jf.setResizable(true);
		ImageIcon windowIcon = new ImageIcon("bioniceyelogo.png");
		this.jf.setIconImage(windowIcon.getImage());
		this.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jf.getContentPane().setBackground(Color.BLACK);
		this.jf.setLayout(null);
		this.jf.setVisible(true);
	}

	private void configureAndAddTheComponents() {
		this.l1.setBounds(20, 20, 240, 240);
		this.l1.setText(" LEFT WING ");
		this.l1.setHorizontalTextPosition(JLabel.RIGHT);
		this.l1.setVerticalTextPosition(JLabel.CENTER);
		ImageIcon i1 = new ImageIcon("bull.png");
		this.l1.setIcon(i1);
		this.l1.setIconTextGap(6);
		this.l1.setForeground(Color.GREEN);
		this.l1.setFont(new Font("Comic Sans", Font.BOLD, 12));
		this.l1.setHorizontalAlignment(JLabel.CENTER);
		this.l1.setVerticalAlignment(JLabel.CENTER);
		this.l2.setText(" RIGHT WING ");
		this.l2.setHorizontalTextPosition(JLabel.RIGHT);
		this.l2.setVerticalTextPosition(JLabel.CENTER);
		ImageIcon i2 = new ImageIcon("owl.png");
		this.l2.setIcon(i2);
		this.l2.setIconTextGap(6);
		this.l2.setForeground(Color.RED);
		this.l2.setFont(new Font("Consolas", Font.BOLD, 12));
		this.l2.setVerticalAlignment(JLabel.CENTER);
		this.l2.setHorizontalAlignment(JLabel.CENTER);
		this.l1.setBounds(this.p1.getBounds());
		this.l2.setBounds(this.p2.getBounds());
		this.l1.setOpaque(false);
		this.l2.setOpaque(false);
		this.p1.setBackground(Color.LIGHT_GRAY);
		this.p1.setBounds(10, 10, 280, 200);
		this.p1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
		this.p2.setBackground(Color.YELLOW);
		this.p2.setBounds(300, 10, 280, 200);
		this.p2.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
		// this.p1.setAlignmentX(JPanel.LEFT_ALIGNMENT);
		// this.p1.setAlignmentY(JPanel.CENTER_ALIGNMENT);

		this.p3.setBounds(40, 220, 480, 200);
		this.p3.setBackground(Color.GREEN);
		this.p3.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		this.jb1.setText(" Click Here ");
		this.jb1.setForeground(Color.BLACK);
		this.jb1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		this.jb1.setFocusable(false);
		this.jb1.setBackground(Color.PINK);
		this.jb1.setHorizontalTextPosition(JButton.RIGHT);
		this.jb1.setVerticalTextPosition(JButton.CENTER);
		this.jb1.setIconTextGap(8);
		ImageIcon i3 = new ImageIcon("hoolilogo.png");
		this.jb1.setIcon(i3);
		this.jb1.setBounds(p3.getBounds());
		this.jb1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		this.jb1.addActionListener(this);
		
		this.l3.setText(" Just to Show ");
		this.l3.setHorizontalTextPosition(JLabel.RIGHT);
		this.l3.setVerticalTextPosition(JLabel.CENTER);
		this.l3.setBounds(40, 480, 400, 200);
		this.l3.setForeground(Color.PINK);
		this.l3.setFont(new Font("Times New Roman", Font.BOLD, 32));
		this.l3.setBackground(Color.darkGray);
		this.l3.setOpaque(true);
		this.l3.setIcon(i1);
		this.l3.setIconTextGap(6);
		this.l3.setBorder(BorderFactory.createLineBorder(Color.PINK, 26));
		//this.l3.setHorizontalAlignment(JLabel.LEFT);
		this.l3.setVerticalAlignment(JLabel.CENTER);
		this.l3.setVisible(false);

		this.p1.add(this.l1);
		this.p2.add(this.l2);
		this.jf.add(this.p1);
		this.jf.add(this.p2);
		this.p3.add(this.jb1); 
		this.jf.add(this.p3);
		this.jf.add(this.l3);
	}
	

	public static void main(String[] args) {
		opractise2 op = new opractise2();
		op.configureAndAddTheComponents();
		op.defineJFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.jb1)
			System.out.println("Button Clicked! And Label Shown");
			this.l3.setVisible(true);
		
	}
}

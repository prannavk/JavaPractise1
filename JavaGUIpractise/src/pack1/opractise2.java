package pack1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class opractise2 {
	
	JFrame jf;
	JPanel p1, p2;
	JLabel l1, l2;
	
	opractise2(){
		jf = new JFrame();
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel();
		l2 = new JLabel();
	}
	
	public void defineJFrame() {
		this.jf.setTitle("WORK1");
		this.jf.setSize(1080,720);
		this.jf.setResizable(false);
		this.jf.setVisible(true);
		ImageIcon windowIcon = new ImageIcon("bioniceyelogo.png");
		this.jf.setIconImage(windowIcon.getImage());
	}
	
	public void addTheComponents() {
		this.p1.add(l1);
		this.p2.add(l2);
		this.jf.add(p1);
		this.jf.add(p2);
	}
	
	public static void main(String[] args) {
		opractise2 op = new opractise2();
		op.defineJFrame();
		op.addTheComponents();
		
	}
}

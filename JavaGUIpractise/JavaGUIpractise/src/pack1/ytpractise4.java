package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ytpractise4 implements ActionListener {

	JButton button;
	MyFrame mf;
	JLabel label;
	ImageIcon icon2;

	ytpractise4() {
		mf = new MyFrame();
		button = new JButton();
		label = new JLabel();
		icon2 = new ImageIcon("basedniqqa.png");
	}

	public static void main(String[] args) {
		ytpractise4 y1 = new ytpractise4();
		ImageIcon icon = new ImageIcon("hoolilogo.png");
		y1.button.setIcon(icon);
		
		//To add the icon on top of the text
		y1.button.setHorizontalTextPosition(JButton.CENTER);
		y1.button.setVerticalTextPosition(JButton.BOTTOM);
		
		//To bring the text into the image i.e. reduce the gap between text and image
		y1.button.setIconTextGap(5);
		
		//to change colors and add a border
		y1.button.setForeground(Color.BLUE);
		y1.button.setBackground(Color.ORANGE);
		y1.button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		//y1.button.setBorder(BorderFactory.createEtchedBorder());
		
		//Another feature which is available with buttons is that we can change components
		//within a frame on a button click
		//Lets say we'd want to display a Label on the screen once the button is clicked
		y1.label.setIcon(y1.icon2);
//		y1.label.setBounds(50, 300, 200, 100);
//		y1.label.setText("HAHAHAHAHA");
//		y1.label.setFont(new Font("Comic Sans", Font.ITALIC, 12));
//		y1.label.setIconTextGap(8);
//		y1.label.setVerticalAlignment(JLabel.CENTER);
		y1.label.setVisible(false);
		y1.mf.add(y1.label);
		
		y1.button.setBounds(10, 10, 250, 200);
		y1.button.addActionListener(y1);
		y1.button.setText("Button1");
		y1.button.setFocusable(true);
		y1.button.setFont(new Font("Comic Sans", Font.ITALIC, 22));
		y1.mf.add(y1.button);

	}

	//If you want to disable the button after 1 click:
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.button) {
			System.out.println("Hello World");
			//this.button.setEnabled(false);
			this.mf.remove(button);
			this.label.setVisible(true);
			
		}
	}

}

package newwindowopenspackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage1 implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton myButton = new JButton("CLICK HERE");
	
	LaunchPage1(){
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		myButton.setForeground(Color.RED);
		myButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		myButton.setBackground(Color.BLACK);
		myButton.setOpaque(true);
		myButton.setBorder(BorderFactory.createLineBorder(Color.RED, 6));
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setSize(420, 420);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.myButton) {
			frame.dispose();
			//With this, it will basically close out of our frame
			//When we click on the 'click Here' button, its going to
			//get rid of the launch page
			
			@SuppressWarnings("unused")
			NewWindow1 nw1 = new NewWindow1();
		}
		
	}
}

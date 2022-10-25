package packagetutorial1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ytpractise1 {

	public static void main(String[] args) {
		/*
		 * JOptionPane = Its a standard dialog box that prompts users for a value
		 * or informs them of something.
		 */
		
		//JOptionPane.showMessageDialog(null, "Nothing!", "Title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Nothing!", "Title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "You're computer has a virus", "Title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Nothing!", "Title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Nothing!", "Title", JOptionPane.ERROR_MESSAGE);
		//MessageType : Depending on what value we give in the 4th parameter (MessageType), its
		//going to give our Message Dialog Box a different look and feel
		
		//System.out.println(JOptionPane.showConfirmDialog(null, "How are you, man?", "What", JOptionPane.YES_NO_CANCEL_OPTION));
		/*Here, this prints:
		 * 0 if we click 'YES'
		 * 1 if we click 'NO'
		 * 2 if we click 'CANCEL'
		 * -1 if we close the window
		 * 
		 * We can also store it in a variable
		 */
		
		byte answer = (byte)JOptionPane.showConfirmDialog(null, "How are you, man?", "What", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(answer);
		String name = JOptionPane.showInputDialog("Whats Your Name?");
		System.out.println("Hello " + name);
		ImageIcon icon = new ImageIcon("bull.png");
		String[] responses = {"Were All gonna make it", "I lost Hope", "Thanks man"};
		JOptionPane.showOptionDialog(null, "Youre gonne a make it", "IMPORTANT", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
		
	}

}

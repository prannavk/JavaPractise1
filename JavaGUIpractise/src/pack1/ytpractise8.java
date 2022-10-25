package pack1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class ytpractise8 {

	public static void main(String[] args) {
		/* 
		 * JLayeredPane = Its a swing container which provides a third dimension
		 * for positioning the components
		 * example: depth, Z-index
		 * 
		 * Similar to JPanel, but we can specify different layers on the 
		 * JLayeredPane. We can have components be stacked on top of one and other
		 * or underneath  
		 * */
		
		JFrame jame = new JFrame();
		jame.setTitle("Flow Layout demonstration");
		jame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jame.setSize(700, 500);
		jame.setResizable(true);
		jame.setLayout(null);
		jame.getContentPane().setBackground(Color.WHITE);
		
		
		//Lets create 3 labels
		JLabel l1 = new JLabel();
		l1.setText("LABEL1");
		l1.setHorizontalTextPosition(JLabel.CENTER);
		l1.setBackground(Color.RED);
		l1.setOpaque(true);
		l1.setBounds(50, 50, 200, 200);
		
		JLabel l2 = new JLabel();
		l2.setText("LABEL2");
		l2.setHorizontalTextPosition(JLabel.CENTER);
		l2.setBackground(Color.GREEN);
		l2.setOpaque(true);
		l2.setBounds(100, 100, 200, 200);
		
		JLabel l3 = new JLabel();
		l3.setText("LABEL3");
		l3.setHorizontalTextPosition(JLabel.CENTER);
		l3.setBackground(Color.BLUE);
		l3.setOpaque(true);
		l3.setBounds(150, 150, 200, 200);
		
		JLayeredPane jlp = new JLayeredPane();
		jlp.setBounds(10, 10, 400, 400);
		//The JLayeredPane has default names for Layers, which are:
		//{Default, Palette, Modal, PopUp, Drag}
		//using which we can arrange or specify a layer
		//jlp.add(l1, JLayeredPane.DEFAULT_LAYER);
		//jlp.add(l3, JLayeredPane.DRAG_LAYER);
		//jlp.add(l2, JLayeredPane.DEFAULT_LAYER);
		//we can add a number, since there is an associated number to each layer, BUT..
		//we need to box it (use the Integer Wrapper class)
		jlp.add(l1, Integer.valueOf(1));
		jlp.add(l2, Integer.valueOf(0));
		jlp.add(l3, Integer.valueOf(2));
		
		jame.add(jlp);
		jame.setVisible(true);
	}

}

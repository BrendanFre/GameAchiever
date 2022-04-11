package backend;
import java.awt.event.*;
import javax.swing.*;


public class AddGame extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3260241536701637595L;

	/**
	 * 
	 */
    // main class
   
    	// JTextField
        static JTextField t;
     
        // JFrame
        static JFrame f;
     
        // JButton
        static JButton b;
     
        // label to display text
        static JLabel l;
        static JLabel AddGameDesc;
     
        // default constructor
        AddGame()
        {
        }
        public static void main(String[] args)
        {
        // create a new frame to store text field and button
        f = new JFrame("Adding a New Game");
 
        // create a label to display text
        l = new JLabel("nothing entered");
        AddGameDesc = new JLabel ("Please Enter the Name of the Game.");
 
        // create a new button
        b = new JButton("submit");
 
        // create a object of the text class
        AddGame te = new AddGame();
 
        // addActionListener to button
        b.addActionListener(te);
 
        // create a object of JTextField with 16 columns
        t = new JTextField(16);
 
        // create a panel to add buttons and textfield
        JPanel p = new JPanel();
 
        // add buttons and textfield to panel
        p.add(AddGameDesc);
        p.add(t);
        p.add(b);
        p.add(l);
 
        // add panel to frame
        f.add(p);
 
        // set the size of frame
        f.setSize(300, 300);
        f.setVisible(true);
 
    }
 
    // if the button is pressed
    public void actionPerformed(ActionEvent e)
    {
    	String GameName;
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // set the text of the label to the text of the field
            GameName = t.getText();
            System.out.println(GameName);
            l.setText (GameName);
 
            // set the text of field to blank
            t.setText("  ");
        }
    }
}
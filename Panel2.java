

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

// this panel holds the input field along with its implementation
public class Panel2 extends JPanel implements ActionListener {
	
	private static JTextField input;
	
	// default constructor
	public Panel2() {
		
		input = new JTextField(10);
		input.setFont(new Font("Comic Sans", Font.PLAIN, 25));
		
		// ensuring text starts from the right as in a calculator
		input.setHorizontalAlignment(JTextField.RIGHT);
		input.setBounds(10, 75, 400, 100);
		add(input);
	
	}
	
	public static JTextField getInput() {
		
		return input;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

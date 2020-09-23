

import javax.swing.*;
import java.awt.*;

// this frame holds all three panels and their UI for display 
public class MainFrame extends JFrame {
	
	private Panel1 buttonsPanel;
	private Panel2 textPanel;
	private Panel3 basesPanel;
	private JLabel threeStripes, programmer;
	
	// default constructor  
	public MainFrame() {
		
		// removing the default layout manager completely 
		setLayout(null);
		
		threeStripes = new JLabel("\u2630");
		threeStripes.setFont(new Font("Comic Sans", Font.BOLD, 23));
		threeStripes.setBounds(10, 10, 75,45);
		add(threeStripes);
		
		programmer = new JLabel("PROGRAMMER");
		programmer.setFont(new Font("Times New Roman", Font.BOLD, 20));
		programmer.setBounds(70, 10, 250, 50);
		add(programmer);

		buttonsPanel = new Panel1();
		buttonsPanel.setBounds(10, 275, 360, 245);
		add(buttonsPanel);
		
		
		textPanel = new Panel2();
		textPanel.setBounds(10, 50, 350, 70);
		add(textPanel);
		
		basesPanel = new Panel3();
		basesPanel.setBounds(10, 110, 50, 150);
		add(basesPanel);
		
	}
}

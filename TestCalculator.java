
import javax.swing.*;

public class TestCalculator {
	
	// driver function 
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		// ensuring WINDOWS 10 look and feel 
		// SOURCE: elearning
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		MainFrame calc = new MainFrame();
		calc.setTitle("Calculator");
		calc.setVisible(true);
		calc.setBounds(125, 125, 380, 550);
		calc.setResizable(false);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}

}

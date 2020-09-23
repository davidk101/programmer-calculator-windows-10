

import java.awt.event.*;
import javax.swing.*;

// this panel holds all the base conversions and their implementations 
public class Panel3 extends JPanel implements ActionListener{

	private JRadioButton hex, dec, oct, bin;
	private ButtonGroup group = new ButtonGroup();
	protected static JLabel hex_val, dec_val, oct_val, bin_val;
	protected static String sentinel = "dec";
	
	// default constructor
	public Panel3() {
		
		hex = new JRadioButton("HEX");
		dec = new JRadioButton("DEC");
		oct = new JRadioButton("OCT");
		bin = new JRadioButton("BIN");
		
		// ensuring only JRadioButton can be selected
		group.add(hex);
		group.add(dec);
		group.add(oct);
		group.add(bin);
		
		add(hex);
		add(dec);
		add(oct);
		add(bin);
		
		hex.addActionListener(this);
		dec.addActionListener(this);
		oct.addActionListener(this);
		bin.addActionListener(this);
		
		hex_val = new JLabel("0");
		dec_val = new JLabel("0");
		oct_val = new JLabel("0");
		bin_val = new JLabel("0");
			
		add(hex_val);
		add(dec_val);
		add(oct_val);
		add(bin_val);
		
	}
	
	// converting from decimal to binary 
	public static String getBinary() {
		
		String s_value = getDecimal();
		int value = Integer.parseInt(s_value);
		String binary_value = Integer.toBinaryString(value);
		return binary_value;
	}
	
	// converting from decimal to octal 
	public static String getOctal() {
		
		String s_value = getDecimal();
		int value = Integer.parseInt(s_value);
		String octal_value = Integer.toOctalString(value);
		return octal_value;
				
	}
	
	// converting from decimal to hexadecimal 
	public static String getHexadecimal() {
	
		String s_value = getDecimal();
		int value = Integer.parseInt(s_value);
		String hex_value = Integer.toHexString(value);
		return hex_value;		
	}
	
	// converting to decimal 
	public static String getDecimal() {
		
		String s_value = Panel2.getInput().getText();
		int decimal_value = 0;
		
		// converting from any base to decimal 
		switch(sentinel) {
		
			case "hex":
				
				decimal_value = Integer.parseInt(s_value,16);
				break;
				
			case "dec":
				
				decimal_value = Integer.parseInt(s_value);
				break;
				
			case "oct":
				
				decimal_value = Integer.parseInt(s_value,8);
				break;
				
			case "bin":
				
				decimal_value = Integer.parseInt(s_value,2);
				break;
				
			default:
				
				decimal_value = Integer.parseInt(s_value,10);
	
		}
		
		String s_decimal_value = Integer.toString(decimal_value);
		
		return s_decimal_value;
	
	}
	
	// this function allows response for a specific action 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == hex) {
			
			sentinel = "hex";
			
			for(int i=0; i<30; i++) {
				
				Panel1.button[i].setEnabled(true);
			}
		
		}
		
		if (e.getSource() == dec) {

			sentinel = "dec";
			
			// deactivating certain buttons
			for (int i=0; i<30;i++) {
				
				if (i==6 || i==7 || i==12|| i==13|| i==18|| i==19) {
					
					Panel1.button[i].setEnabled(false);
					
				}
				
				else {
					
					Panel1.button[i].setEnabled(true);
				}
			}

		}
		
		if (e.getSource() == oct) {
			
			sentinel = "oct";
			
			// deactivating certain buttons
			for (int i=0; i<30; i++) {
					
				if (i==6 || i==7 || i==12|| i==13|| i==18|| i==19 || i==9 || i==10) {
						
					Panel1.button[i].setEnabled(false);
						
				}
					
				else {
						
					Panel1.button[i].setEnabled(true);
				}
			}
		}
		
		if (e.getSource() == bin) {
			
			sentinel = "bin";
			
			// deactivating certain buttons
			for (int i=0; i<30; i++) {
				
				if (i==6 || i==7 || i==12|| i==13|| i==18|| i==19 || i == 8 || i==9 || i==10 || i==14 || i==15 || i==16|| i==21|| i==22) {
						
					Panel1.button[i].setEnabled(false);
			
				}
				else {
						
					Panel1.button[i].setEnabled(true);
				}
			}
		}
		
	}

}



import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.*;

// this panel holds all the buttons on the bottom half of the screen along with their implementation 
public class Panel1 extends JPanel implements ActionListener {
	
	// this array holds all the implemented JButtons
	protected static JButton button[] = new JButton[30];
	String operator, output, s_output, input2;
	double d_input1, d_input2, d_output;
	
	// these JButtons have no implementation and are there for display
	private static JButton Lsh, Rsh, Or, Xor, Not, And, five_dot, four_dot, qword, ms;
	private int counter = 0;
	
	GridBagConstraints c = new GridBagConstraints();

	// default constructor 
	public Panel1() {
		
		// using the GridBagLayout
		setLayout(new GridBagLayout());
		
		// using the same features for all the buttons regarding filling the entire space alotted to the panel
		// SOURCE: https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 1;
		
		five_dot = new JButton("\u2E2D");
		c.gridx = 0;
		c.gridy = 0;
		add(five_dot,c);
		
		four_dot = new JButton("\u205B");
		c.gridx = 1;
		c.gridy = 0;
		add(four_dot,c);
		
		qword = new JButton("QWORD");
		c.gridx = 3;
		c.gridy = 0;
		add(qword,c);
		qword.addActionListener(this);
		
		ms = new JButton("MS");
		c.gridx = 5;
		c.gridy = 0;
		add(ms,c);
		
		Lsh = new JButton("Lh");
		c.gridx = 0;
		c.gridy = 1;
		add(Lsh,c);
				
		Rsh = new JButton("Rsh");
		c.gridx = 1;
		c.gridy = 1;
		add(Rsh,c);
		
		Or = new JButton("Or");
		c.gridx = 2;
		c.gridy = 1;
		add(Or,c);
		
		Xor = new JButton("Xor");
		c.gridx = 3;
		c.gridy = 1;
		add(Xor,c);
		
		Not = new JButton("Not");
		c.gridx = 4;
		c.gridy = 1;
		add(Not,c);
		
		And = new JButton("And");
		c.gridx = 5;
		c.gridy = 1;
		add(And,c);
		
		button[0] = new JButton("\u2191");
		button[1] = new JButton("Mod");
		button[2] = new JButton("CE");
		button[3] = new JButton("C");
		button[4] = new JButton("\u232B");
		button[5] = new JButton("\u00F7");
	
		c.gridx = 0;
		c.gridy = 2;
		add(button[0],c);
		
		c.gridx =1;
		c.gridy =2;
		add(button[1],c);
		
		c.gridx =2;
		c.gridy =2;
		add(button[2],c);
		
		c.gridx =3;
		c.gridy =2;
		add(button[3],c);
		
		c.gridx =4;
		c.gridy =2;
		add(button[4],c);
		
		c.gridx =5;
		c.gridy =2;
		add(button[5],c);

		
		button[6] = new JButton("A");
		button[7] = new JButton("B");
		button[8] = new JButton("7");
		button[9] = new JButton("8");
		button[10] = new JButton("9");
		button[11] = new JButton("\u00D7");
		
		c.gridx = 0;
		c.gridy = 3;
		add(button[6],c);
		
		c.gridx =1;
		c.gridy =3;
		add(button[7],c);
		
		c.gridx =2;
		c.gridy =3;
		add(button[8],c);
		
		c.gridx =3;
		c.gridy =3;
		add(button[9],c);
		
		c.gridx =4;
		c.gridy =3;
		add(button[10],c);
		
		c.gridx =5;
		c.gridy =3;
		add(button[11],c);
		
		button[12] = new JButton("C");
		button[13] = new JButton("D");
		button[14] = new JButton("4");
		button[15] = new JButton("5");
		button[16] = new JButton("6");
		button[17] = new JButton("-");
		
		c.gridx = 0;
		c.gridy = 4;
		add(button[12],c);
		
		c.gridx =1;
		c.gridy =4;
		add(button[13],c);
		
		c.gridx =2;
		c.gridy =4;
		add(button[14],c);
		
		c.gridx =3;
		c.gridy =4;
		add(button[15],c);
		
		c.gridx =4;
		c.gridy =4;
		add(button[16],c);
		
		c.gridx =5;
		c.gridy =4;
		add(button[17],c);
		
		button[18] = new JButton("E");
		button[19] = new JButton("F");
		button[20] = new JButton("1");
		button[21] = new JButton("2");
		button[22] = new JButton("3");
		button[23] = new JButton("+");
		
		c.gridx = 0;
		c.gridy = 5;
		add(button[18],c);
		
		c.gridx =1;
		c.gridy =5;
		add(button[19],c);
		
		c.gridx =2;
		c.gridy =5;
		add(button[20],c);
		
		c.gridx =3;
		c.gridy =5;
		add(button[21],c);
		
		c.gridx =4;
		c.gridy =5;
		add(button[22],c);
		
		c.gridx =5;
		c.gridy =5;
		add(button[23],c);
		
		button[24] = new JButton("(");
		button[25] = new JButton(")");
		button[26] = new JButton("\u00B1");
		button[27] = new JButton("0");
		button[28] = new JButton(".");
		button[29] = new JButton("=");
		
		c.gridx = 0;
		c.gridy = 6;
		add(button[24],c);
		
		c.gridx =1;
		c.gridy =6;
		add(button[25],c);
		
		c.gridx =2;
		c.gridy =6;
		add(button[26],c);
		
		c.gridx =3;
		c.gridy =6;
		add(button[27],c);
		
		c.gridx =4;
		c.gridy =6;
		add(button[28],c);
		
		c.gridx =5;
		c.gridy =6;
		add(button[29],c);
		
		for (int i=0; i<30;i++) {
			
			// enabling actions
			button[i].addActionListener(this);
			
			// enabling the buttons as per the decimal default base
			if (i==6 || i==7 || i==12|| i==13|| i==18|| i==19) {
				
				button[i].setEnabled(false);
				
			}
			
			else {
				
				button[i].setEnabled(true);
			}
		}
	}
	
	// this function allows response for a specific action 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == qword) {
			
			switch(counter % 4) {
			
			case 0: 
				qword.setText("BYTE");
				counter++;
				break;
			case 1: 
				qword.setText("WORD");
				counter++;
				break;
			case 2:
				qword.setText("DWORD");
				counter++;
				break;
			case 3:
				qword.setText("QWORD");
				counter++;
			
			}
		
		}
		
		if (e.getSource() == button[1]) {
			
			String input1 = Panel2.getInput().getText();
			d_input1 = Double.parseDouble(input1);
			Panel2.getInput().setText("");

			operator = "remainder";
	
		}
		
		if (e.getSource() == button[2] || e.getSource() == button[3]) {
			
			Panel2.getInput().setText("");
			
			Panel3.hex_val.setText("0");
			Panel3.dec_val.setText("0");
			Panel3.oct_val.setText("0");
			Panel3.bin_val.setText("0");
	
		}
		
		if (e.getSource() == button[4]) {
			
			String input = Panel2.getInput().getText();
			
			if (input.length() > 0) {
				
				input = input.substring(0,input.length()-1);
				
			}
			Panel2.getInput().setText(input);

	
		}
		
		if (e.getSource() == button[5]) {
			
			String input1 = Panel2.getInput().getText();
			d_input1 = Double.parseDouble(input1);
			Panel2.getInput().setText("");

			operator = "divide";

		}
		
		if (e.getSource() == button[6]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"A");

		}
		
		if (e.getSource() == button[6]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"A");

		}
		
		if (e.getSource() == button[7]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"B");

		}
		
		if (e.getSource() == button[8]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"7");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[9]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"8");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[10]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"9");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[11]) {
			
			String input1 = Panel2.getInput().getText();
			d_input1 = Double.parseDouble(input1);

			Panel2.getInput().setText("");

			operator = "multiply";
		
		}
		
		if (e.getSource() == button[12]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"C");

		}
		
		if (e.getSource() == button[13]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"D");

		}
		
		if (e.getSource() == button[14]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"4");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[15]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"5");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[16]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"6");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[17]) {
			
			String input1 = Panel2.getInput().getText();
			d_input1 = Double.parseDouble(input1);
			Panel2.getInput().setText("");

			operator = "subtract";

		}
		
		if (e.getSource() == button[18]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"E");

		}
		
		if (e.getSource() == button[19]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"F");

		}
		
		if (e.getSource() == button[20]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"1");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[21]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"2");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[22]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"3");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[23]) {
			
			String input1 = Panel2.getInput().getText();
			d_input1 = Double.parseDouble(input1);
			Panel2.getInput().setText("");
						
			operator = "add";

		}
		
		if (e.getSource() == button[24]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"(");

		}
		
		if (e.getSource() == button[25]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+")");

		}
		
		if (e.getSource() == button[27]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+"0");
			
			Panel3.hex_val.setText(Panel3.getHexadecimal());
			Panel3.dec_val.setText(Panel3.getDecimal());
			Panel3.oct_val.setText(Panel3.getOctal());
			Panel3.bin_val.setText(Panel3.getBinary());

		}
		
		if (e.getSource() == button[28]) {
			
			String input = Panel2.getInput().getText();
			Panel2.getInput().setText(input+".");

		}
		
		if (e.getSource() == button[29]) {
					
			switch (operator) {
			
				case "divide":
					
					input2 = Panel2.getInput().getText();
					
					d_input2 = Double.parseDouble(input2);
					
					d_output = d_input1 / d_input2;
					
					s_output = Double.toString(d_output);
					
					Panel2.getInput().setText(s_output);
					break;
					
				case "multiply":
				
					input2 = Panel2.getInput().getText();
					
					d_input2 = Double.parseDouble(input2);
					
					d_output = d_input1 * d_input2;
					
					s_output = Double.toString(d_output);
					
					Panel2.getInput().setText(s_output);
					break;
				
				case "subtract":
					
					input2 = Panel2.getInput().getText();
					
					d_input2 = Double.parseDouble(input2);
					
					System.out.println(d_input1);
					System.out.println(d_input1);
					
					d_output = d_input1 - d_input2;
					
					s_output = Double.toString(d_output);
					
					Panel2.getInput().setText(s_output);
					break;
					
				case "add":
					
					input2 = Panel2.getInput().getText();
					
					d_input2 = Double.parseDouble(input2);
					
					d_output = d_input1 + d_input2;
					
					s_output = Double.toString(d_output);
					
					Panel2.getInput().setText(s_output);
					break;
					
				case "remainder":
					
					input2 = Panel2.getInput().getText();
					
					d_input2 = Double.parseDouble(input2);
					
					d_output = d_input1 % d_input2;
					
					s_output = Double.toString(d_output);
					
					Panel2.getInput().setText(s_output);
					
	
			}
		
		}
				
	}

}

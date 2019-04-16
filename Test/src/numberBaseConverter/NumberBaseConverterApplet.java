package numberBaseConverter;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class NumberBaseConverterApplet extends JApplet{
	
	int base;        // the new base 
    int base10Num;   // the number in base 10 
                     // in 4 digits in the new base 
    int base10Num2;
    String letter;
    int remainder;
    String remainderS;
    String place = "";
    String reversePlace = "";
    String letters = "          abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    private JApplet appletPannel;
    
	
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					NumberBaseConverterApplet applet = new NumberBaseConverterApplet();
					applet.setVisible(true);
				}
			});
		} catch (Exception e) {
			System.err.println("createGUI didn't complete successfully");
		}
	}
	
	public NumberBaseConverterApplet() {
		
		setBounds(100, 100, 450, 300);
		appletPannel = new JApplet();
		setContentPane(appletPannel);
		GridBagLayout gbl_appletPannel = new GridBagLayout();
		gbl_appletPannel.columnWidths = new int[]{55, 225, 20, 0, 0};
		gbl_appletPannel.rowHeights = new int[]{0, 0, 0, 15, 42, 0};
		gbl_appletPannel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0};
		gbl_appletPannel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		appletPannel.setLayout(gbl_appletPannel);
		
		JLabel lblNewLabel_2 = new JLabel("Number:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		appletPannel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("To base:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 0;
		appletPannel.add(lblNewLabel, gbc_lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(2), new Integer(2), null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.gridx = 4;
		gbc_spinner.gridy = 0;
		appletPannel.add(spinner, gbc_spinner);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		appletPannel.add(separator, gbc_separator);
		
		JTextField output = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 7;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 3;
		appletPannel.add(output, gbc_textField);
		output.setColumns(10);
		output.setEditable(false);
		
		JFormattedTextField frmtdtxtfld = new JFormattedTextField();
		frmtdtxtfld.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (arg0.getKeyChar() == '\n') {
				calculate(frmtdtxtfld, spinner, output);
				}
			}
		});
		frmtdtxtfld.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		frmtdtxtfld.setToolTipText("Input a number");
		GridBagConstraints gbc_frmtdtxtfld = new GridBagConstraints();
		gbc_frmtdtxtfld.insets = new Insets(0, 0, 5, 5);
		gbc_frmtdtxtfld.fill = GridBagConstraints.BOTH;
		gbc_frmtdtxtfld.gridx = 1;
		gbc_frmtdtxtfld.gridy = 0;
		appletPannel.add(frmtdtxtfld, gbc_frmtdtxtfld);
		
		JButton btnNewButton = new JButton("Convert Number");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calculate(frmtdtxtfld, spinner, output);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		appletPannel.add(btnNewButton, gbc_btnNewButton);
		
	}
	
	private void calculate(JFormattedTextField frmtdtxtfld, JSpinner spinner, JTextField output) {
		place = "";
		letter = null;
		remainder = 0;
		reversePlace = ""; 
		
		// read in the base 10 number and the base 
	      base10Num = Integer.parseInt(frmtdtxtfld.getText());
	      base10Num2 = base10Num;
	      base = Integer.parseInt(spinner.getValue().toString());
	      
	      // Do the conversion (see notes in lab) 
	      // Print the result (see notes in lab) 
	      
	      
	      while(base10Num>0) {
	      // First compute place0 -- the units place.  Remember this comes     
	      // from the first division so it is the remainder when the     
	      // base 10 number is divided by the base (HINT %).
	      remainder = base10Num%base;
	      if (remainder>9) {
	    	  letter = Character.toString(letters.charAt(remainder));
	    	  place = place + letter;
	      }else {
	    	  remainderS = Integer.toString(remainder);
	    	  place = place + remainderS;
	      }
	      
	      // Then compute the quotient (integer division / will do it!) -     
	      // You can either store the result back in base10Num or declare a     
	      // new variable for the quotient     
	      base10Num = base10Num/base;
	      // Now compute place1 -- this is the remainder when the quotient     
	      // from the preceding step is divided by the base.       
	      // Then compute the new quotient
	      } 
	      int length = place.length();
	      for(int x = length-1; x >= 0; x--) {
	    	  reversePlace = reversePlace + place.charAt(x);
	      }
	      output.setText(base10Num2 + " in base " + base + ": " + reversePlace);
	}

}

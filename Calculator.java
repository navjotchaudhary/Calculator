

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
//import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
//import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
/*import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;*/

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	
	
	double firstnum=0;
	double secoundnum=0;
	double result;
	String operations;
	String answer;
	int count=0;
	int p=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\acer\\Desktop\\if_Calculator_16_171352.png"));
		frmCalculator.setOpacity(1f);
		frmCalculator.setBackground(Color.BLACK);
		frmCalculator.setForeground(Color.BLACK);
		frmCalculator.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 17));
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(Color.BLACK);
		frmCalculator.setBounds(100, 100, 304, 369);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setToolTipText("");
		textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setForeground(SystemColor.controlLtHighlight);
		textField.setBackground(SystemColor.windowText);
		textField.setBounds(0, -4, 291, 80);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(11);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(0, 129, 73, 53);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(0, 177, 73, 53);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn1.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(0, 230, 73, 53);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn8 = new JButton("8");
		//btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(74, 129, 73, 52);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(74, 177, 73, 53);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn2.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(74, 230, 73, 53);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(144, 129, 73, 53);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(144, 177, 73, 53);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn3.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(144, 230, 73, 53);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnplus = new JButton("+");
		btnplus.setForeground(Color.BLACK);
		//btnplus.setBackground(new Color(255, 0, 0));
		btnplus.setOpaque(true);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=0;
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("0");
				operations="+";
				count=0;
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnplus.setBounds(218, 177, 73, 53);
		frmCalculator.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		//btnminus.setBackground(new Color(255, 0, 0));
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=0;
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("0");
				operations="-";
				count=0;
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnminus.setBounds(218, 129, 73, 53);
		frmCalculator.getContentPane().add(btnminus);
		
		JButton btnmult = new JButton("*");
		//btnmult.setBackground(new Color(255, 0, 0));
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=0;
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("0");
				operations="*";
				count=0;
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmult.setBounds(218, 75, 73, 53);
		frmCalculator.getContentPane().add(btnmult);
		
		JButton btnp = new JButton(".");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (p==0)
				{
				String EnterNumber=textField.getText()+btnp.getText();
				textField.setText(EnterNumber);
				p=1;
				}
				}
		});
		btnp.setEnabled(true);
		//btnp.setBackground(new Color(255, 0, 0));
		btnp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnp.setBounds(144, 281, 73, 53);
		frmCalculator.getContentPane().add(btnp);
		
		JButton btn0 = new JButton("0");
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn0.getText();
				textField.setText(EnterNumber);
				count++;
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(74, 281, 73, 53);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnequals = new JButton("=");
		btnequals.setBackground(new Color(255, 140, 0));
		//btnequals.setBackground(new Color(255, 0, 0));
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=0;
				Double ans;
				secoundnum=Double.parseDouble(textField.getText());
				
				//answer=String.format("%0.2f", result);
				
				if(operations=="+")
				{
					
					ans = firstnum + secoundnum;
					ans.toString();
					textField.setText(String.valueOf(ans));
					
				}
				else if(operations=="-")
				{
					ans = firstnum - secoundnum;
					ans.toString();
					textField.setText(String.valueOf(ans));
					
					
				}
				
				else if(operations=="*")
				{
					ans = firstnum * secoundnum;
					ans.toString();
					textField.setText(String.valueOf(ans));
					
					
				}
				
				else if(operations=="%")
				{
					ans = firstnum % secoundnum;
					ans.toString();
					textField.setText(String.valueOf(ans));
					
					
				}
				
				else if(operations=="/")
				{
					ans = firstnum / secoundnum;
					ans.toString();
					textField.setText(String.valueOf(ans));
					
					
				}
				
				
			}
		});
		btnequals.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnequals.setBounds(218, 230, 73, 104);
		frmCalculator.getContentPane().add(btnequals);
		
		JButton button = new JButton("<-");
		//button.setBackground(new Color(255, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace=strB.toString();
					textField.setText(backspace);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(74, 75, 73, 53);
		frmCalculator.getContentPane().add(button);
		
		JButton btnC = new JButton("AC");
		btnC.setForeground(new Color(255, 140, 0));
		//btnC.setBackground(new Color(255, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(0, 75, 73, 53);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnpercent = new JButton("%");
		//btnpercent.setBackground(new Color(255, 0, 0));
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=0;
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpercent.setBounds(0, 281, 73, 53);
		frmCalculator.getContentPane().add(btnpercent);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=0;
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		///button_3.setBackground(new Color(255, 0, 0));
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_3.setBounds(146, 75, 71, 53);
		frmCalculator.getContentPane().add(button_3);
	}
}

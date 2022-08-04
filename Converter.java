/**
  *Rahnel Hans A. Kaamiño, ITCC11-A
  *October 20,2020
  *Midterm Exam
  **/
  
  import java.awt.*;
  import java.awt.event.*;
  import java.awt.event.ActionListener;
  import java.awt.event.ActionEvent;
  import javax.swing.*;
  import java.text.*;
  
 class Converter extends JFrame implements ActionListener {
	 public static DecimalFormat decimal = new DecimalFormat("#,###,##0.00"); /**Format for Decimal gets from internet**/
	 
	private Container c;
	private JPanel panel;
	private JLabel Dollar;
	private JLabel Peso;
	private JTextField t1;
	private JTextField t2;
	private JButton b1;
	private String convert = "Convert";
	private Double dollar;
		
		/**Constructor**/
	public Converter() {
		c = this.getContentPane();
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		setTitle("Converter USD to PHP");
		setSize(600,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Dollar = new JLabel("Dollar");
		t1 = new JTextField(15);
		
		Peso = new JLabel("Peso");
		t2 = new JTextField(15);
		
		b1 = new JButton("Converter");
		b1.setActionCommand(convert);
		b1.addActionListener(this);
		
		panel.add(Dollar);
		panel.add(t1);
		panel.add(b1);
		
		panel.add(Peso);
		panel.add(t2);
		c.add(panel);
		
		setVisible(true);
	}
		/**Puts amount rate of peso**/
	public double callDollar(double dollar) {
		return dollar*48.590000;
	}
	
		/**Main Program**/
	public static void main(String[] args){
		new Converter();
		}	
		
		/**Call for Functions**/
	public void actionPerformed(ActionEvent e) {
		String convert = e.getActionCommand();
		if(convert.equals(convert))
			dollar = Double.parseDouble(t1.getText());
			double Peso = callDollar(dollar);
			String p = ""+Peso;
			t2.setText(""+decimal.format(Double.parseDouble(p)));
		}
  }

		
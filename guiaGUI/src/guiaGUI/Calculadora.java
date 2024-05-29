package guiaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora implements ActionListener{
	private JFrame ventana = new JFrame("Calculadora");
	private JTextArea leyenda = new JTextArea("Calculadora para datos numéricos, pero sólo Divide!",2,20);
	
	private JLabel lblDividendo=new JLabel("Dividendo");
	private JTextField txtDividendo = new JTextField(20);
	
	private JLabel lblDivisor=new JLabel("Divisor");
	private JTextField txtDivisor = new JTextField(20);
	
	private JLabel lblCociente=new JLabel("Cociente");
	private JTextField txtCociente = new JTextField(20);
	
	private JButton btnCalcular=new JButton("Calcular");
	
	public Calculadora() {
		ventana.setSize(275, 250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		leyenda.setEditable(false);
		leyenda.setLineWrap(true);
		leyenda.setWrapStyleWord(true);
		leyenda.setBackground(ventana.getBackground());
		txtCociente.setEditable(false);
		txtCociente.setBackground(Color.WHITE);
		btnCalcular.addActionListener(this);
		ventana.setLayout(new FlowLayout());
		
		ventana.add(leyenda);
		ventana.add(lblDividendo);
		ventana.add(txtDividendo);
		ventana.add(lblDivisor);
		ventana.add(txtDivisor);
		ventana.add(lblCociente);
		ventana.add(txtCociente);
		ventana.add(btnCalcular);
		
		ventana.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String strDividendo = txtDividendo.getText();
		double dividendo = Double.parseDouble(strDividendo);
		String strDivisor=txtDivisor.getText();
		double divisor = Double.parseDouble(strDivisor);
		double dblCociente = dividendo/divisor;
		String output = String.valueOf(dblCociente);
		
		txtCociente.setText(output);
	}
	
	public static void main(String[] args)
	{Calculadora gui = new Calculadora(); }
	
}

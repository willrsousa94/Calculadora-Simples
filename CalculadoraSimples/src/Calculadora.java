import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

	JTextField tfNum01, tfNum02;
	JButton btSoma, btSubtracao, btMultiplicacao, btDivisao;
	
	//Declarando as variáveis double que receberão os números nos Text Fields.
	public double num1, num2;
	
	public Calculadora() {
		setSize(400,150);
		setTitle("Calculadora Simples");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Instância dos componentes
		
		tfNum01 = new JTextField(15);
		tfNum02 = new JTextField(15);
		btSoma = new JButton("Adicionar");
		btSubtracao = new JButton("Subtrair");
		btMultiplicacao = new JButton("Multiplicar");
		btDivisao = new JButton("Dividir");
		
		//Colocando os objetos na tela
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		getContentPane().add(tfNum01);
		getContentPane().add(tfNum02);
		getContentPane().add(btSoma);
		getContentPane().add(btSubtracao);
		getContentPane().add(btMultiplicacao);
		getContentPane().add(btDivisao);
		
		//Adicionar ações aos componentes
		
		btSoma.addActionListener(this);
		btDivisao.addActionListener(this);
		btMultiplicacao.addActionListener(this);
		btSubtracao.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		c.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//Convertendo os números para Double e armazenando nas variáveis
		num1 = Double.parseDouble(tfNum01.getText());
		num2 = Double.parseDouble(tfNum02.getText());
		
		//Colocando os botões para funcionar
		if(e.getSource()==btSoma) {
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " é igual a " + (num1 + num2));
		}
		if(e.getSource()==btSubtracao) {
			JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " é igual a " + (num1 - num2));
		}
		if(e.getSource()==btMultiplicacao) {
			JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " é igual a " + (num1 * num2));
		}
		if(e.getSource()==btDivisao) {
			JOptionPane.showMessageDialog(null, num1 + " : " + num2 + " é igual a " + (num1 / num2));
		}
	}
	
}

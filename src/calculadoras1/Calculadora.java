package calculadoras1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame{

		public Calculadora() {
			setVisible(true);
			setTitle("Calculadora" );
			setSize(310,400);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.componentes();
		}
		
		public void componentes() {
			JPanel resultado=new JPanel();
			resultado.setSize(300,300);
			resultado.setLocation(0,0);
			resultado.setBackground(Color.gray);
			resultado.setLayout(null);
			
			
			JLabel titulo=new JLabel("24.32",SwingConstants.CENTER);
			titulo.setBounds(10, 10, 270, 50);
			titulo.setOpaque(true);
			titulo.setForeground(Color.white);
			titulo.setBackground(Color.pink);
			resultado.add(titulo);
			
			
			JButton off=new JButton("off");
			off.setBounds(10, 70, 60, 40);
			off.setForeground(Color.white);
			off.setBackground(Color.black);
			resultado.add(off);
			

			JButton b1=new JButton();
			b1.setBounds(80, 70, 60, 40);
			b1.setForeground(Color.white);
			b1.setBackground(Color.black);
			resultado.add(b1);
			
			JButton b2=new JButton();
			b2.setBounds(150, 70, 60, 40);
			b2.setForeground(Color.white);
			b2.setBackground(Color.black);
			resultado.add(b2);
			
			JButton b3=new JButton("/");
			b3.setBounds(220, 70, 60, 40);
			b3.setForeground(Color.white);
			b3.setBackground(Color.black);
			resultado.add(b3);
			
			JButton num7=new JButton("7");
			num7.setBounds(10, 120, 60, 40);
			num7.setForeground(Color.white);
			num7.setBackground(Color.black);
			resultado.add(num7);
			
			JButton num8=new JButton("8");
			num8.setBounds(80, 120, 60, 40);
			num8.setForeground(Color.white);
			num8.setBackground(Color.black);
			resultado.add(num8);
			
			JButton num9=new JButton("9");
			num9.setBounds(150, 120, 60, 40);
			num9.setForeground(Color.white);
			num9.setBackground(Color.black);
			resultado.add(num9);
			
			JButton bx=new JButton("x");
			bx.setBounds(220, 120, 60, 40);
			bx.setForeground(Color.white);
			bx.setBackground(Color.black);
			resultado.add(bx);
			
			JButton num4=new JButton("4");
			num4.setBounds(10, 170, 60, 40);
			num4.setForeground(Color.white);
			num4.setBackground(Color.black);
			resultado.add(num4);
			
			JButton num5=new JButton("5");
			num5.setBounds(80, 170, 60, 40);
			num5.setForeground(Color.white);
			num5.setBackground(Color.black);
			resultado.add(num5);
			
			JButton num6=new JButton("6");
			num6.setBounds(150, 170, 60, 40);
			num6.setForeground(Color.white);
			num6.setBackground(Color.black);
			resultado.add(num6);
			
			JButton menos=new JButton("-");
			menos.setBounds(220, 170, 60, 40);
			menos.setForeground(Color.white);
			menos.setBackground(Color.black);
			resultado.add(menos);
			
			JButton num1=new JButton("1");
			num1.setBounds(10, 220, 60, 40);
			num1.setForeground(Color.white);
			num1.setBackground(Color.black);
			resultado.add(num1);
			
			JButton num2=new JButton("2");
			num2.setBounds(80, 220, 60, 40);
			num2.setForeground(Color.white);
			num2.setBackground(Color.black);
			resultado.add(num2);
			
			JButton num3=new JButton("3");
			num3.setBounds(150, 220, 60, 40);
			num3.setForeground(Color.white);
			num3.setBackground(Color.black);
			resultado.add(num3);
			
			JButton mas=new JButton("+");
			mas.setBounds(220, 220, 60, 90);
			mas.setForeground(Color.white);
			mas.setBackground(Color.PINK);
			resultado.add(mas);
			
			JButton num0=new JButton("0");
			num0.setBounds(10, 270, 60, 40);
			num0.setForeground(Color.white);
			num0.setBackground(Color.black);
			resultado.add(num0);
			
			JButton punto=new JButton(".");
			punto.setBounds(80, 270, 60, 40);
			punto.setForeground(Color.white);
			punto.setBackground(Color.black);
			resultado.add(punto);
			
			JButton igual=new JButton("=");
			igual.setBounds(150, 270, 60, 40);
			igual.setForeground(Color.white);
			igual.setBackground(Color.black);
			resultado.add(igual);
			
			add(resultado);
			
			
			
		}
	

}

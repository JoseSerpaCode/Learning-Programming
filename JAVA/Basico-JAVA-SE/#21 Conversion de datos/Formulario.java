import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

  private JTextField textfield1, textfield2;
  private JLabel label1, label2, label3;
  private JButton button1;

  String valor = "";
  Double Primer_numero, resultado;

  
  public Formulario(){
   setLayout(null);

   label1 = new JLabel("Valor 1:");
   label1.setBounds(50,5,100,30);
   add(label1);

   label2 = new JLabel("Valor 2:");
   label2.setBounds(50,35,100,30);
   add(label2);

   label3 = new JLabel("Resultado:");
   label3.setBounds(120,80,100,30);
   add(label3);

   textfield1 = new JTextField("");
   textfield1.setBounds(120,10,150,20);
   add(textfield1);

   textfield2 = new JTextField("");
   textfield2.setBounds(120,40,150,20);
   add(textfield2);

   button1 = new JButton("Sumar");
   button1.setBounds(10,80,100,30);
   add(button1);
   button1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource()==button1){
      int valor1 = 0, valor2 = 0, resultado = 0;

      valor1 = Integer.parseInt(textfield1.getText());
      valor2 = Integer.parseInt(textfield2.getText());

      resultado = valor1 + valor2;

      label3.setText("Resultado: " + resultado);
   }
  }

  public static void main(String args[]){

    Formulario Formulario1 = new Formulario();
    Formulario1.setBounds(0,0,300,150);
    Formulario1.setVisible(true);
    Formulario1.setResizable(false);
    Formulario1.setLocationRelativeTo(null);
 }
}
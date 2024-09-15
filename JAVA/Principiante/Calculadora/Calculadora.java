import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button0, buttonC, buttonAC;

  String valor = "";
  Double num1, num2, resultado;
  char operator;

  
  public Calculadora(){
   setLayout(null);

   textfield1 = new JTextField("");
   textfield1.setBounds(5,10,255,50);
   textfield1.setEditable(false);
   add(textfield1);

   button0 = new JButton("0");
   button0.setBounds(5,300,255,30);
   add(button0);
   button0.addActionListener(this);
   
   button1 = new JButton("1");
   button1.setBounds(5,250,60,30);
   add(button1);
   button1.addActionListener(this);

   button2 = new JButton("2");
   button2.setBounds(70,250,60,30);
   add(button2);
   button2.addActionListener(this);

   button3 = new JButton("3");
   button3.setBounds(135,250,60,30);
   add(button3);
   button3.addActionListener(this);

   button4 = new JButton("4");
   button4.setBounds(5,200,60,30);
   add(button4);
   button4.addActionListener(this);

   button5 = new JButton("5");
   button5.setBounds(70,200,60,30);
   add(button5);
   button5.addActionListener(this);

   button6 = new JButton("6");
   button6.setBounds(135,200,60,30);
   add(button6);
   button6.addActionListener(this);

   button7 = new JButton("7");
   button7.setBounds(5,150,60,30);
   add(button7);
   button7.addActionListener(this);

   button8 = new JButton("8");
   button8.setBounds(70,150,60,30);
   add(button8);
   button8.addActionListener(this);

   button9 = new JButton("9");
   button9.setBounds(135,150,60,30);
   add(button9);
   button9.addActionListener(this);

   button10 = new JButton("X");
   button10.setBounds(200,100,60,30);
   add(button10);
   button10.addActionListener(this);

   button11 = new JButton("/");
   button11.setBounds(135,100,60,30);
   add(button11);
   button11.addActionListener(this);

   button12 = new JButton("+");
   button12.setBounds(200,200,60,30);
   add(button12);
   button12.addActionListener(this);

   button13 = new JButton("-");
   button13.setBounds(200,150,60,30);
   add(button13);
   button13.addActionListener(this);

   button14 = new JButton("=");
   button14.setBounds(200,250,60,30);
   add(button14);
   button14.addActionListener(this);

   buttonAC = new JButton("AC");
   buttonAC.setBounds(5,100,60,30);
   add(buttonAC);
   buttonAC.addActionListener(this);

   buttonC = new JButton("C");
   buttonC.setBounds(70,100,60,30);
   add(buttonC);
   buttonC.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource()==button0){
     valor += button0.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button1){
     valor += button1.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button2){
     valor += button2.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button3){
     valor += button3.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button4){
     valor += button4.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button5){
     valor += button5.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button6){
     valor += button6.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button7){
     valor += button7.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button8){
     valor += button8.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==button9){
     valor += button9.getText();
     textfield1.setText(valor);
   }

    if(e.getSource()==buttonAC){
     textfield1.setText("");
    }

    if(e.getSource()==buttonC){
     String string = textfield1.getText();
     textfield1.setText("");
     for(int i=0; i<string.length()-1;i++){
       textfield1.setText(textfield1.getText()+string.charAt(i));
     }

     if(e.getSource()==button12){
       num1= Double.parseDouble(textfield1.getText());
       operator = '+';
       textfield1.setText("");
     }
      if(e.getSource()==button13){
        num1= Double.parseDouble(textfield1.getText());
        operator = '-';
        textfield1.setText("");
     }
      if(e.getSource()==button10){
        num1= Double.parseDouble(textfield1.getText());
        operator = 'X';
        textfield1.setText("");
     }
      if(e.getSource()==button11){
        num1= Double.parseDouble(textfield1.getText());
        operator = '/';
        textfield1.setText("");
     }

      if(e.getSource()==button14){
        num2= Double.parseDouble(textfield1.getText());

        switch(operator){

          case'+':
                 resultado=num1+num2;
                 break;
          case'-':
                 resultado=num1-num2;
                 break;
          case'X':
                 resultado=num1*num2;
                 break;
          case'/':
                 resultado=num1/num2;
                 break;
        }

        textfield1.setText(String.valueOf(resultado));
        num1=resultado;
         
        }

   }
  }

  public static void main(String args[]){

    Calculadora Calculadora1 = new Calculadora();
    Calculadora1.setBounds(0,0,285,400);
    Calculadora1.setVisible(true);
    Calculadora1.setResizable(false);
    Calculadora1.setLocationRelativeTo(null);
 }
}
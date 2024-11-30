import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{

  JFrame frame;
  JTextField textfield1;
  JButton[] numero_botones = new JButton [10];
  JButton[] funcion_botones = new JButton [8];
  JButton suma, resta, mult, div, decimal, igual, DEL, AC;
  JPanel panel;

  Double num1, num2, resultado;
  char operator;
  
   public Calculadora(){
   setLayout(null);

   textfield1 = new JTextField("");
   textfield1.setBounds(10,10,280,50);
   textfield1.setEditable(false);
   add(textfield1);

   suma = new JButton("+"); add(suma);
   resta = new JButton("-"); add(resta);
   mult = new JButton("X"); add(mult);
   div = new JButton("/"); add(div);
   decimal = new JButton("."); add(decimal);
   igual = new JButton("="); add(igual);
   DEL = new JButton("DEL"); add(DEL);
   AC = new JButton("AC"); add(AC);

   funcion_botones[0] = suma;
   funcion_botones[1] = resta;
   funcion_botones[2] = mult;
   funcion_botones[3] = div;
   funcion_botones[4] = decimal;
   funcion_botones[5] = igual;
   funcion_botones[6] = DEL;
   funcion_botones[7] = AC;

   for(int i = 0; i<8; i++){
     funcion_botones[i].addActionListener(this);
     funcion_botones[i].setFocusable(false);
   }

   for(int i = 0; i<10; i++){
     numero_botones[i] = new JButton(String.valueOf(i));
     numero_botones[i].addActionListener(this);
     numero_botones[i].setFocusable(false);
   }


   AC.setBounds(25,400,120,50);
   DEL.setBounds(155,400,120,50);

   panel=new JPanel();
   panel.setBounds(10,100,280,280);
   panel.setLayout(new GridLayout(4,4,5,5));
   add(panel);

   panel.add(numero_botones[7]);
   panel.add(numero_botones[8]);
   panel.add(numero_botones[9]);
   panel.add(suma);
   panel.add(numero_botones[4]);
   panel.add(numero_botones[5]);
   panel.add(numero_botones[6]);
   panel.add(resta);
   panel.add(numero_botones[1]);
   panel.add(numero_botones[2]);
   panel.add(numero_botones[3]);
   panel.add(mult);
   panel.add(decimal);
   panel.add(numero_botones[0]);
   panel.add(igual);
   panel.add(div);

 }

  public void actionPerformed(ActionEvent e){

    for(int i = 0; i<10; i++){
      if(e.getSource()==numero_botones[i]){
        textfield1.setText(textfield1.getText().concat(String.valueOf(i)));
      }
    }
    
    if(e.getSource()==decimal){
      textfield1.setText(textfield1.getText().concat("."));
    }

    if(e.getSource()==suma){
      num1= Double.parseDouble(textfield1.getText());
      operator = '+';
      textfield1.setText("");
    }

    if(e.getSource()==resta){
      num1= Double.parseDouble(textfield1.getText());
      operator = '-';
      textfield1.setText("");
    }

    if(e.getSource()==mult){
      num1= Double.parseDouble(textfield1.getText());
      operator = 'X';
      textfield1.setText("");
    }

    if(e.getSource()==div){
      num1= Double.parseDouble(textfield1.getText());
      operator = '/';
      textfield1.setText("");
    }

    if(e.getSource()==igual){
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

      if(e.getSource()==AC){
        textfield1.setText("");
      }

      if(e.getSource()==DEL){
        String string = textfield1.getText();
        textfield1.setText("");

          for(int i=0; i<string.length()-1;i++){
            textfield1.setText(textfield1.getText()+string.charAt(i));
          }
      }
   }

  public static void main(String args[]){

    Calculadora Calculadora1 = new Calculadora();
    Calculadora1.setBounds(0,0,320,500);
    Calculadora1.setVisible(true);
    Calculadora1.setResizable(false);
    Calculadora1.setLocationRelativeTo(null);
 }
}
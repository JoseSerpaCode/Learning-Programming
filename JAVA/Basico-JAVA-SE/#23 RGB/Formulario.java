import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{

  private JLabel label1, label2, label3;
  private JButton button1;
  private JComboBox combo1, combo2, combo3;

  public Formulario(){
   setLayout(null);

   label1 = new JLabel("Rojo:");
   label1.setBounds(10,10,100,10);
   add(label1);

   combo1 = new JComboBox();
   combo1.setBounds(120,10,50,30);
    for(int i = 0; i<=255; i++){
     combo1.addItem(String.valueOf(i));
   }
   add(combo1);

   label2 = new JLabel("Verde:");
   label2.setBounds(10,50,100,10);
   add(label2);

   combo2 = new JComboBox();
   combo2.setBounds(120,50,50,30);
    for(int i = 0; i<=255; i++){
     combo2.addItem(String.valueOf(i));
   }
   add(combo2);

   label3 = new JLabel("Azul:");
   label3.setBounds(10,90,100,10);
   add(label3);

   combo3 = new JComboBox();
   combo3.setBounds(120,90,50,30);
    for(int i = 0; i<=255; i++){
     combo3.addItem(String.valueOf(i));
   }
   add(combo3);

   button1 = new JButton("Fijar color");
   button1.setBounds(10,130,100,30);
   add(button1);
   button1.addActionListener(this);
 }

  public void actionPerformed(ActionEvent e){

    if(e.getSource()==button1){
      String cad1 = combo1.getSelectedItem().toString(), 
             cad2 = combo2.getSelectedItem().toString(), 
             cad3 = combo3.getSelectedItem().toString();

      int rojo = Integer.parseInt(cad1);
      int verde = Integer.parseInt(cad2);
      int azul = Integer.parseInt(cad3);

      Color color1 = new Color(rojo, verde, azul);
      button1.setBackground(color1);
   }
  }

  public static void main(String args[]){

    Formulario Formulario1 = new Formulario();
    Formulario1.setBounds(0,0,250,200);
    Formulario1.setVisible(true);
    Formulario1.setResizable(false);
    Formulario1.setLocationRelativeTo(null);
 }
}
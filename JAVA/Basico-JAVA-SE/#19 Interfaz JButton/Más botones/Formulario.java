import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

  private JLabel label1;
  private JButton button1, button2, button3, button4, button5, cerrar;
  
  public Formulario(){
   setLayout(null);

   label1 = new JLabel("En espera...");
   label1.setBounds(10,10,300,30);
   add(label1);
   
   button1 = new JButton("1");
   button1.setBounds(10,100,90,30);
   add(button1);
   button1.addActionListener(this);

   button2 = new JButton("2");
   button2.setBounds(110,100,90,30);
   add(button2);
   button2.addActionListener(this);

   button3 = new JButton("3");
   button3.setBounds(210,100,90,30);
   add(button3);
   button3.addActionListener(this);

   button4 = new JButton("4");
   button4.setBounds(10,200,90,30);
   add(button4);
   button4.addActionListener(this);

   button5 = new JButton("5");
   button5.setBounds(110,200,90,30);
   add(button5);
   button5.addActionListener(this);

   cerrar = new JButton("Cerrar");
   cerrar.setBounds(210,200,90,30);
   add(cerrar);
   cerrar.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button1){
     label1.setText("Has presionado el botón 1");
   }

    if(e.getSource()==button2){
     label1.setText("Has presionado el botón 2");
   }

    if(e.getSource()==button3){
     label1.setText("Has presionado el botón 3");
   }

    if(e.getSource()==button4){
     label1.setText("Has presionado el botón 4");
   }

    if(e.getSource()==button5){
     label1.setText("Has presionado el botón 5");
   }

    if(e.getSource()==cerrar){
     System.exit(0);
   }

  }


  public static void main(String args[]){

    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,450,400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
 }
}
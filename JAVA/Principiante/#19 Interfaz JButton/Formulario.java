import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

  JButton button;
  
  public Formulario(){
   setLayout(null);
   button = new JButton("Cerrar");
   button.setBounds(300,250,100,30);
   add(button);
   button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
     System.exit(0);
   }
  }


  public static void main(String args[]){

    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,450,350);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
 }
}
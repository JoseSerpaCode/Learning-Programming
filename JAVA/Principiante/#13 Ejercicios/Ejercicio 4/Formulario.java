import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

  private JTextField textfield;
  private JButton boton;
  
  public Formulario(){
   setLayout(null);

   textfield = new JTextField(); 
   textfield.setBounds(10,10,200,40);
   add(textfield);

   boton = new JButton("Aceptar");
   boton.setBounds(10,70,80,40);
   add(boton);
   boton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){

     if(e.getSource()==boton){
     String texto = textfield.getText();
     setTitle(texto);
   }
  }

  public static void main(String args[]){

    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,250,200);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
 }
}
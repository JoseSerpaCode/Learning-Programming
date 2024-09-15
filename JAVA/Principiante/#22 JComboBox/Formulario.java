import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{

  private JComboBox combo1;

  public Formulario(){
 
   setLayout(null);
   
   combo1 = new JComboBox();
   combo1.setBounds(10,10,80,20);
   add(combo1);

   combo1.addItem("rojo");
   combo1.addItem("amarillo");
   combo1.addItem("azul");
   combo1.addItem("verde");
   combo1.addItemListener(this);
 }

  public void itemStateChanged(ItemEvent e){

    if(e.getSource()==combo1){
      String seleccion = combo1.getSelectedItem().toString();
      setTitle(seleccion);
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
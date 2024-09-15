import javax.swing.*;

public class Interfaz extends JFrame{
  private JLabel label_1;
  
  public Interfaz(){
   setLayout(null);
   label_1 = new JLabel("Formulario Inicial");
   label_1.setBounds(10,20,200,300);
   add(label_1);
  }

  public static void main(String args[]){

    Interfaz formulario1 = new Interfaz();
    formulario1.setBounds(0,0,400,300);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
 }
}
import javax.swing.*;

public class Formulario extends JFrame{

  private JLabel label_1;
  private JLabel label_2;

  
  public Formulario(){
   setLayout(null);
   label_1 = new JLabel("Interfaz Gráfica");
   label_1.setBounds(10,20,300,30);
   add(label_1);

   label_2 = new JLabel("Versión 1.0");
   label_2.setBounds(10,100,300,30);
   add(label_2);
  }

  public static void main(String args[]){

    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,400,300);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
 }
}
import javax.swing.*;

public class Interfaz_2 extends JFrame{
  private JLabel label_1;
  private JLabel label_2;
  private JLabel label_3;
  private JLabel label_4;
  private JLabel label_5;
  
  public Interfaz_2(){
   setLayout(null);
   label_1 = new JLabel("Etiqueta 1");
   label_1.setBounds(0,120,200,300);
   add(label_1);

   label_2 = new JLabel("Etiqueta 2");
   label_2.setBounds(0,-120,200,300);
   add(label_2);

   label_3 = new JLabel("Etiqueta 3");
   label_3.setBounds(700,120,200,300);
   add(label_3);

   label_4 = new JLabel("Etiqueta 4");
   label_4.setBounds(700,-120,200,300);
   add(label_4);

   label_5 = new JLabel("Etiqueta 5");
   label_5.setBounds(350,0,200,300);
   add(label_5);
  }

  public static void main(String args[]){

    Interfaz_2 formulario1 = new Interfaz_2();
    formulario1.setBounds(0,0,400,300);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
 }
}
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{

  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3;
  private JMenuItem menuitem1, menuitem2,
                    menuitem3, menuitem4;

  public Formulario(){
   setLayout(null);

   menubar = new JMenuBar();
   setJMenuBar (menubar);

   menu1 = new JMenu("Opciones");
   menubar.add(menu1);

   menu2 = new JMenu("Tamaño");
   menu1.add(menu2);

   menu3 = new JMenu("Color fondo");
   menu1.add(menu3);

   menuitem1 = new JMenuItem("1080x720");
   menuitem1.addActionListener(this);
   menu2.add(menuitem1);

   menuitem2 = new JMenuItem("786x480");
   menuitem2.addActionListener(this);
   menu2.add(menuitem2);

   menuitem3 = new JMenuItem("Rojo");
   menuitem3.addActionListener(this);
   menu3.add(menuitem3);

   menuitem4 = new JMenuItem("Verde");
   menuitem4.addActionListener(this);
   menu3.add(menuitem4);
  
 }

  public void actionPerformed(ActionEvent e){

    Container fondo = this.getContentPane();

    if(e.getSource()==menuitem1){
      setSize(1080,720);
    }

    if(e.getSource()==menuitem2){
      setSize(786,480);
    }

    if(e.getSource()==menuitem3){
      fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource()==menuitem4){
      fondo.setBackground(new Color(0,255,0));
    }

   }

  public static void main(String args[]){

    Formulario Formulario1 = new Formulario();
    Formulario1.setBounds(0,0,250,200);
    Formulario1.setVisible(true);
    Formulario1.setLocationRelativeTo(null);
 }
}
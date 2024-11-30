import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JButton button1;

  String texto = "";
  
  public Formulario(){
   setLayout(null);

   textfield1 = new JTextField("");
   textfield1.setBounds(10,10,200,30);
   add(textfield1);

   textarea1 = new JTextArea("");
   scrollpane1 = new JScrollPane(textarea1);
   scrollpane1.setBounds(10,50,400,300);
   add(scrollpane1);

   button1 = new JButton("Aceptar");
   button1.setBounds(250,10,100,30);
   add(button1);
   button1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button1){
     texto += textfield1.getText() + "\n";
     textarea1.setText(texto);
     textfield1.setText("");
   }
  }

  public static void main(String args[]){

    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,500,400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
 }
}
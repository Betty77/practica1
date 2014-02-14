import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class practica implements ActionListener{

     JFrame f,f1,f2,f3;
     JPanel p,p2,p3;
     JButton b1,b2,b3,b4,b5,b6,b7,b8;
     JPasswordField tx;
     JTextField t1,t2,t3,t4,t5;
     JLabel l1,l2,l3,l4,l5;
     Preguntas Pre;

public practica(){

      
f=new JFrame("Control");
f1=new JFrame("contraseña");

      b1=new JButton("Maestro");
      b2=new JButton("Alumno");
      p = new JPanel();
      p.setLayout(new FlowLayout());
      p.add(b1);
      p.add(b2);
      f.setSize(250,250);
      f.add(p,BorderLayout.SOUTH);


b1.addActionListener(this);
b2.addActionListener(this);

f.setLayout(new FlowLayout());
f.add(b1); f.add(b2);
f1.setLayout(new FlowLayout());



     f.setVisible(true);
      f.setResizable(true);
}




public void actionPerformed(ActionEvent e){
if(e.getActionCommand()=="Maestro"){
   b1.setEnabled(false);
   b2.setEnabled(false);
   b3=new JButton("siguiente");
   b3.addActionListener(this);
   tx=new  JPasswordField("Maestro");
   f1.add(b3);
   f1.add(tx);
  
    f1.setSize(250,200);
    f1.setVisible(true);
}


if(e.getActionCommand()=="siguiente"){
  b1.setEnabled(true);
  b2.setEnabled(true);

  f2=new JFrame("Menu Profesor");
  p2=new JPanel();
  b4=new JButton("Modificar Reactivos");
  b5=new JButton("Eliminar Calificaciones");
  b6=new JButton("Reporte de calificaciones");
  b7=new JButton("Añadir reactivo");
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  
  p2.setLayout(new GridLayout(4,1));
  p2.add(b7);
  p2.add(b4);
  p2.add(b5);
  p2.add(b6);
  f2.add(p2);
f2.setSize(400,400);
f2.setVisible(true);

}

  
if(e.getActionCommand()=="Alumno")
  Pre=  new Preguntas();

if(e.getSource().equals(b7)){
   b8=new JButton("Guardar");
   f3=new JFrame("Añadir");
   p3=new JPanel();
   
   l1 = new JLabel("Escribe tu primer pregunta");
   t1= new JTextField(30);
   p3.add(l1);
   p3.add(t1);
     
f3.add(p3);
   
   l2 = new JLabel("Escribe la respuesta");
   t2= new JTextField(30);
   p3.add(l2);
   p3.add(t2);
   
   
   l3 = new JLabel("Escribe tu segunda  pregunta");
   t3= new JTextField(30);
   p3.add(l3);
   p3.add(t3); 
   
   
  
  l5 = new JLabel("Escribe tu respuesta");
   t5= new JTextField(30);
   p3.add(l5);
   p3.add(t5); 
    p3.add(b8);

f3.setSize(500,450);
f3.setVisible(true);

}
}

public static void main ( String args[]){
 practica pra=new practica();       
    }
}
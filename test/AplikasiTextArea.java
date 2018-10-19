import javax.swing.*;
import java.awt.*;
class AplikasiTextArea extends JFrame
{
 private JLabel label=new JLabel("Nama");
 private JTextArea area1=new JTextArea(3,20);
 AplikasiTextArea()
 {
 setTitle("Komponen JTextArea");
 setLocation(200,100);
 setSize(300,100);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void komponenVisual()
 {
 getContentPane().add(label);
 getContentPane().add(area1);
 getContentPane().setLayout(new FlowLayout());
 setVisible(true);
 }
 public static void main(String args[])
 {
 AplikasiTextArea ta=new AplikasiTextArea();
 ta.komponenVisual(); 
 }
} 
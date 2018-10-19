package Latihan2;

import javax.swing.*;
import java.awt.event.*; 

public class EventHandler extends JFrame {

JTextField data1=new JTextField(6);
 JTextField data2=new JTextField(6);
 JButton operasi=new JButton("+");
 JTextField hasil=new JTextField(6);
 JButton exit=new JButton("EXIT");
 EventHandler()
 {
 setTitle("Event Sederhana");
 setLocation(200,100);
 setSize(270,100);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void komponenVisual()
 {
 getContentPane().setLayout(null);
 getContentPane().add(data1);
 data1.setBounds(10,10,50,20);
 getContentPane().add(data2);
 data2.setBounds(60,10,50,20);
 getContentPane().add(operasi);
 operasi.setBounds(110,10,50,20);
 getContentPane().add(hasil);
 hasil.setBounds(160,10,90,20); 
 getContentPane().add(exit);
 exit.setBounds(160,35,90,20);
 setVisible(true);
 }
 void AksiReaksi()
 {
     data1.addKeyListener(new KeyAdapter()
 {
 public void keyPressed(KeyEvent e)
 {
 if(e.getKeyCode()==e.VK_ENTER)
 {
 data2.requestFocus();
 }
 }
 });
 data2.addKeyListener(new KeyAdapter()
 {
 public void keyPressed(KeyEvent e)
 {
 if(e.getKeyCode()==e.VK_ENTER)
 {
 operasi.requestFocus();
 }
 }
 }); 
 operasi.addKeyListener(new KeyAdapter()
 {
 public void keyPressed(KeyEvent e)
 {
 if(e.getKeyCode()==e.VK_ENTER)
 {
 int x=Integer.parseInt(data1.getText());
 int y=Integer.parseInt(data2.getText());
 String z=String.valueOf(x+y);
 hasil.setText(z);
 exit.requestFocus(); 
 }}
 }
 );
 operasi.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 int x=Integer.parseInt(data1.getText());
 int y=Integer.parseInt(data2.getText());
 String z=String.valueOf(x+y);
 hasil.setText(z);
 }
 });
 
 exit.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 System.exit(0);
 }
 });
 }
 
 public static void main(String args[])
 {
 EventHandler e1=new EventHandler();
 e1.komponenVisual();
 e1.AksiReaksi();
 }
}

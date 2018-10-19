
import javax.swing.*;
import java.awt.event.*;
class BillingPaymentPesanan extends JFrame
{
 JLabel lblnama=new JLabel("Nama Pemesan");
 JTextField txnama=new JTextField(20);
 JLabel lblmeja=new JLabel("Nomor Meja");
 JTextField txmeja=new JTextField(7);
 JLabel lblkelamin=new JLabel("Jenis Kelamin");
 JRadioButton pria=new JRadioButton("Pria");
 JRadioButton wanita=new JRadioButton("Wanita");
 ButtonGroup kelompok=new ButtonGroup();
  JLabel lblpaket=new JLabel("Paket Dipilih");
 JCheckBox p1=new JCheckBox("Paket Hemat 1");
 JCheckBox p2=new JCheckBox("Paket Hemat 2");
 JCheckBox p3=new JCheckBox("Paket Hemat 3"); 
 JButton cetak=new JButton("Cetak");
 JTextArea hasil=new JTextArea(); 
 BillingPaymentPesanan()
 {
 setTitle("Event Sederhana");
 setLocation(300,100);
 setSize(300,320);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void KomponenVisual()
 {
 getContentPane().setLayout(null);
 getContentPane().add(lblnama);
 lblnama.setBounds(10,10,100,20);
 getContentPane().add(txnama);
 txnama.setBounds(105,10,175,20);
 getContentPane().add(lblmeja);
 lblmeja.setBounds(10,33,80,20);
 getContentPane().add(txmeja);
 txmeja.setBounds(105,33,70,20);
 getContentPane().add(lblkelamin);
 lblkelamin.setBounds(10,56,80,20);
 kelompok.add(pria);
 kelompok.add(wanita);
 getContentPane().add(pria);
 pria.setBounds(105,56,50,20);
 getContentPane().add(wanita);
 wanita.setBounds(160,56,70,20);
 getContentPane().add(lblpaket);
 lblpaket.setBounds(10,80,70,20);
 getContentPane().add(p1);
 p1.setBounds(105,80,120,20);
 getContentPane().add(p2);
 p2.setBounds(105,103,120,20);
 getContentPane().add(p3);
 p3.setBounds(105,126,120,20);
 getContentPane().add(cetak);
 cetak.setBounds(10,150,270,20);
 getContentPane().add(hasil);
 hasil.setBounds(10,180,270,150);
 setVisible(true);
 }
 void AksiReaksi()
 {
 cetak.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 hasil.append(txnama.getText()+"\n");
 hasil.append(txmeja.getText()+"\n");
 if(pria.isSelected()==true) 
 {
 hasil.append(pria.getText()+"\n");
 }
 else
 {
 hasil.append(wanita.getText()+"\n");
 }
 if(p1.isSelected()==true)
 {
 hasil.append(p1.getText()+"\n");
 }
 if(p2.isSelected()==true)
 {
 hasil.append(p2.getText()+"\n");
 }
 if(p3.isSelected()==true)
 {
 hasil.append(p3.getText()+"\n");
 } 
 }
 });
 }
 public static void main(String args[])
 {
 BillingPaymentPesanan e5=new BillingPaymentPesanan();
 e5.KomponenVisual();
 e5.AksiReaksi();
 }
} 
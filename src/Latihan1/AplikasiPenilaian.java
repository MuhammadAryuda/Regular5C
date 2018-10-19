package Latihan1;
import javax.swing.*; 
public class AplikasiPenilaian extends JFrame 
{
JLabel lblnim=new JLabel("NIM");
JLabel nama=new JLabel("Nama");
JLabel kelas=new JLabel("Kelas");
JLabel nilai=new JLabel("Nilai");
JLabel tugas1=new JLabel("Tugas1");
JLabel tugas2=new JLabel("Tugas2");
JLabel tugas3=new JLabel("Tugas3");
JLabel tugas4=new JLabel("Tugas4");
JLabel tugas5=new JLabel("Tugas5");
JLabel uts=new JLabel("UTS");
JLabel uas=new JLabel("UAS");

JRadioButton kelasA=new JRadioButton("A");
JRadioButton kelasB=new JRadioButton("B"); 
JRadioButton kelasC=new JRadioButton("C");
 ButtonGroup grupkelas=new ButtonGroup();
JTextField txnim=new JTextField(20);
JTextField txnim2=new JTextField(20);
JTextField txnim3=new JTextField(20);
JTextField txnim4=new JTextField(20);
JTextField txnim5=new JTextField(20);
JTextField txnim6=new JTextField(20);
JTextField txnim7=new JTextField(20);
JTextField txnim8=new JTextField(20);
JTextField txnim9=new JTextField(20);
JButton tblcari=new JButton("Cari");
JButton save=new JButton("Save");
JButton update=new JButton("Update");
JButton exit=new JButton("Exit");
JLabel lblkelompok=new JLabel("Kelompok");
 String[] jeniskelompok={"1","2","3","4","5","6","7"};
 JComboBox cbkelompok=new JComboBox(jeniskelompok);

 AplikasiPenilaian()
 {
 setTitle("Lembar Penilaian"); 
 setLocation(300,100);
 setSize(300,150);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
 
 void komponenVisual()
 {
 getContentPane().setLayout(null);
 getContentPane().add(lblnim);
 getContentPane().add(nama);
 getContentPane().add(kelas);
 getContentPane().add(txnim);
 getContentPane().add(txnim2);
 getContentPane().add(txnim3);
 getContentPane().add(txnim4);
 getContentPane().add(txnim5);
 getContentPane().add(txnim6);
 getContentPane().add(txnim7);
 getContentPane().add(txnim8);
 getContentPane().add(txnim9);
 getContentPane().add(nilai);
 getContentPane().add(tugas1);
 getContentPane().add(tugas2);
 getContentPane().add(tugas3);
 getContentPane().add(tugas4);
 getContentPane().add(tugas5);
 getContentPane().add(uts);
 getContentPane().add(uas);
 getContentPane().add(save);
 getContentPane().add(update);
 getContentPane().add(exit);
 lblnim.setBounds(10,10,70,20);
 nama.setBounds(10,30,70,20);
 kelas.setBounds(10,50,70,20);
 txnim.setBounds(75,10,100,20);
 txnim2.setBounds(75,32,202,20);
 txnim3.setBounds(75,130,100,20);
 txnim3.setText("0");
 txnim4.setBounds(75,150,100,20);
 txnim4.setText("0");
 txnim5.setBounds(75,170,100,20);
 txnim5.setText("0");
 txnim6.setBounds(75,190,100,20);
 txnim6.setText("0");
 txnim7.setBounds(75,210,100,20);
 txnim7.setText("0");
 txnim8.setBounds(75,230,100,20);
 txnim8.setText("0");
 txnim9.setBounds(75,250,100,20);
 txnim9.setText("0");
 nilai.setBounds(10,110,70,20);
 tugas1.setBounds(10,130,70,20);
 tugas2.setBounds(10,150,70,20);
 tugas3.setBounds(10,170,70,20);
 tugas4.setBounds(10,190,70,20);
 tugas5.setBounds(10,210,70,20);
 uts.setBounds(10,230,70,20);
 uas.setBounds(10,250,70,20);
 getContentPane().add(tblcari);
 tblcari.setBounds(180,10,95,20);
 save.setBounds(180,210,95,20);
 update.setBounds(180,230,95,20);
 exit.setBounds(180,250,95,20);
getContentPane().add(kelasA);
 kelasA.setBounds(75,50,50,20);
 getContentPane().add(kelasB);
 kelasB.setBounds(125,50,50,20);
 getContentPane().add(kelasC);
 kelasC.setBounds(175,50,50,20);
 grupkelas.add(kelasA);
 grupkelas.add(kelasB);
 grupkelas.add(kelasC);  
  getContentPane().add(lblkelompok);
 lblkelompok.setBounds(10,70,100,20);
 getContentPane().add(cbkelompok);
 cbkelompok.setBounds(75,70,100,20);
 setVisible(true);
 }
 public static void main(String args[])
 {
 AplikasiPenilaian ap=new AplikasiPenilaian();
 ap.komponenVisual(); 
 }
}

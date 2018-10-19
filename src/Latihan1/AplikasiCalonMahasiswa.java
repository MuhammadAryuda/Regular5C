package Latihan1;
import javax.swing.*; 
public class AplikasiCalonMahasiswa extends JFrame 
{
JLabel lblnim=new JLabel("Nama");
JLabel nama=new JLabel("tgl lahir");
JLabel kelas=new JLabel("Gol. Darah");
JLabel nilai=new JLabel("Data Penanggung Jawab");
JLabel tugas1=new JLabel("Nama");
JLabel tugas2=new JLabel("Alamat");
JLabel tugas3=new JLabel("No. HP");
JLabel tugas4=new JLabel("Status");
JLabel tugas5=new JLabel("No. HP");

JRadioButton kelasA=new JRadioButton("A");
JRadioButton kelasB=new JRadioButton("B");
JRadioButton kelasC=new JRadioButton("AB");
JRadioButton kelasD=new JRadioButton("O");
 ButtonGroup grupkelas=new ButtonGroup();
JTextField txnim=new JTextField(20);
JTextField txnim2=new JTextField(20);
JTextField txnim3=new JTextField(20);
JTextField txnim4=new JTextField(20);
JTextField txnim5=new JTextField(20);
JTextField txnim6=new JTextField(20);
JTextField txnim7=new JTextField(20);
JButton save=new JButton("Save");
JButton update=new JButton("Update");
JButton exit=new JButton("Exit");
JLabel lblkelompok=new JLabel("Jenis Kel");
 String[] jeniskelompok={"Laki-Laki","Perempuan"};
 JComboBox cbkelompok=new JComboBox(jeniskelompok);

 AplikasiCalonMahasiswa()
 {
 setTitle("Pengisian Data Induk Calon Mahasiswa/i"); 
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
 getContentPane().add(nilai);
 getContentPane().add(tugas1);
 getContentPane().add(tugas2);
 getContentPane().add(tugas3);
 getContentPane().add(tugas4);
 getContentPane().add(tugas5);
 getContentPane().add(save);
 getContentPane().add(update);
 getContentPane().add(exit);
 lblnim.setBounds(10,10,70,20);
 nama.setBounds(10,30,70,20);
 kelas.setBounds(10,50,70,20);
 txnim.setBounds(75,10,202,20);
 txnim2.setBounds(75,32,202,20);
 txnim3.setBounds(75,130,202,20);
 txnim4.setBounds(75,150,202,20);
 txnim5.setBounds(75,170,202,20);
 txnim6.setBounds(75,190,202,20);
 txnim7.setBounds(75,92,202,20);
 nilai.setBounds(10,110,170,20);
 tugas1.setBounds(10,130,70,20);
 tugas2.setBounds(10,150,70,20);
 tugas3.setBounds(10,170,70,20);
 tugas4.setBounds(10,190,70,20);
 tugas5.setBounds(10,90,70,20);
 save.setBounds(180,210,95,20);
 update.setBounds(180,230,95,20);
 exit.setBounds(180,250,95,20);
getContentPane().add(kelasA);
 kelasA.setBounds(75,50,50,20);
 getContentPane().add(kelasB);
 kelasB.setBounds(125,50,50,20);
 getContentPane().add(kelasC);
 kelasC.setBounds(175,50,50,20);
 getContentPane().add(kelasD);
 kelasD.setBounds(225,50,50,20);
 grupkelas.add(kelasA);
 grupkelas.add(kelasB);
 grupkelas.add(kelasC);  
 grupkelas.add(kelasD);
  getContentPane().add(lblkelompok);
 lblkelompok.setBounds(10,70,100,20);
 getContentPane().add(cbkelompok);
 cbkelompok.setBounds(75,70,100,20);
 setVisible(true);
 }
 public static void main(String args[])
 {
 AplikasiCalonMahasiswa ap=new AplikasiCalonMahasiswa();
 ap.komponenVisual(); 
 }
}

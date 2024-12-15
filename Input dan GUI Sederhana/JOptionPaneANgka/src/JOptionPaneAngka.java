import javax.swing.JOptionPane;

public class JOptionPaneAngka {

    public static void main(String[] args) {
       String angka_1 = JOptionPane.showInputDialog("Masukkan angka pertama : ");
       String angka_2 = JOptionPane.showInputDialog("Masukkan angka kedua : ");
       
       double angka1 = Double.parseDouble(angka_1);
       double angka2 = Double.parseDouble(angka_2);
       
       double tambah = angka1 + angka2;
       double kurang = angka1 - angka2;
       double kali = angka1 * angka2;
       double bagi = angka1 / angka2;
       double modulo = angka1 % angka2;
       
       String pesan1 = "Hasil dari " + (int) angka1 + " + " + 
               (int) angka2 + " = " + tambah;
       
       JOptionPane.showMessageDialog(null, pesan1);
       
    }
    
}

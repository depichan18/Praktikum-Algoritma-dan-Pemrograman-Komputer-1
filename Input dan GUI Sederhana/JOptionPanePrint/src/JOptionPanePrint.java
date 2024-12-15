import javax.swing.JOptionPane;

public class JOptionPanePrint {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama Anda: ",
                "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Nama yang Anda masukkan: " + nama);
        String nrp = JOptionPane.showInputDialog(null, "Masukkan NRP Anda: ",
                "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        System.out.println("NRP yang anda masukkan: " + nrp);
        String pesan = "Nama: " + nama + "\nNRP: " + nrp;
        JOptionPane.showMessageDialog(null, pesan, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}

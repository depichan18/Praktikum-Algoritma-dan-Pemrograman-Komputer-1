import java.util.Scanner;

public class AngkaGanjil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Masukkan sebuah angka:");
            if (!input.hasNextInt()){
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.next();
                continue;
            }
            int angka = input.nextInt();
            
            if (angka < 0) {
                System.out.println("Angka tidak valid. Coba lagi!");
                continue;
            }
            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " adalah genap. Coba lagi!");
            } else {
                System.out.println("Anda menemukan angka ganjil: " + angka + "!");
                System.out.println("Permainan berakhir.");
                return;
            }
        }
    }
}

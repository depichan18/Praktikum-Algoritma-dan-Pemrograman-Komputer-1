import java.util.Scanner;

public class AngkaRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka_rahasia = 2024;
        int user_input;
        
        do {
            System.out.print("Masukkan Angka tebakan (4 digit):");
            user_input = input.nextInt();
            
            if (user_input != angka_rahasia) {
                System.out.println("Angka yang anda masukkan salah!");
            }
        } while (user_input != angka_rahasia);
        
        System.out.println("Tebakan Anda benar!");
    }
}

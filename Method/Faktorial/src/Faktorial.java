import java.util.Scanner;

public class Faktorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan sebarang bilangan: ");
            int x = input.nextInt();
            if ( x < 0) {
                System.out.println("Input tidak valid. Masukkan lagi!");
            } else {
                System.out.println("Hasil dari " + x + "! adalah " + faktorial(x));
                break;
            }
        }
    }
    
    public static int faktorial(int n) {
        int hasil = 1;
        for(int i = 1; i <= n; n--) {
            hasil = n * hasil ;
        }
        return hasil;
    }
}

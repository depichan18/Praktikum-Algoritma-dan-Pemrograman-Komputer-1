import java.util.Scanner;

public class Jumlah2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai n kurang dari 20:");
        int limit = input.nextInt();
        double sum = 0;
        
        for (double n = 1; n <= limit; n++) {
            sum += n / (n+1);
        }
        System.out.println(sum);
    }
}

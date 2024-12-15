import java.util.Scanner;

public class PemainBola {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pemain: ");
        int pemain = input.nextInt();
        
        System.out.println("Masukan posisi pemain: ");
        String posisi = input.nextLine();
        
        System.out.println("Masukkan besaran biaya(dalam euro) yang dimiliki: ");
        double biaya = input.nextDouble();
        
        if (biaya >= 20) {
            if (pemain > 1) {
                System.out.println("Anda berhk mendapatkan diskon 30%!");
            }
            else {
                switch (posisi){
                    case "kiper":
                        System.out.println("Anda mendapatkan diskon 20%.");
                        break;
                    case "bek":
                        System.out.println("Anda mendapatkan diskon 23%.");
                        break;
                    case "gelandang":
                        System.out.println("Anda mendapatkan diskon 16%.");
                        break;
                    case "penyerang":
                        System.out.println("Anda mendapatkan diskon 10%.");
                        break;
                    default:
                        System.out.println("Anda tidak mendapatkan diskon.");
            }
            else {
                System.out.println("Anda tidak berhal dapat diskon. ");
            }
        }
    }

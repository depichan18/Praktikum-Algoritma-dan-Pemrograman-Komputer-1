import java.util.Scanner;

public class Hari {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan nomor hari 1 sampai 7: ");
        int week = input.nextInt();
        
        switch (week) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
                
            default:
                System.out.println("Nomor yang anda masukkan salah.");
        }
    }
    
}

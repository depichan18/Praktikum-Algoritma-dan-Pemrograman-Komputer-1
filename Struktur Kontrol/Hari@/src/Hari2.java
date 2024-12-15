import java.util.Scanner;

public class Hari2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan hari 1 sampai 7: ");
        String week = input.nextLine();
        
        switch (week) {
            case "senin":
                System.out.println("1");
                break;
            case "selasa":
                System.out.println("2");
                break;
            case "rabu":
                System.out.println("3");
                break;
            case "kamis":
                System.out.println("4");
                break;
            case "jumat":
                System.out.println("5");
                break;
            case "sabtu":
                System.out.println("6");
                break;
            case "minggu":
                System.out.println("7");
                break;
                
            default:
                System.out.println("Hari yang anda masukkan salah.");
        }
    }
    
}

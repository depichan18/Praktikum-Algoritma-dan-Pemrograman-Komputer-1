import java.util.Scanner;

public class SkorTim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Skor tim A: ");
        int a = input.nextInt();
        System.out.print("Skor Tim B: ");
        int b = input.nextInt();
        
        if(a < 0 || b < 0){
            System.out.println("Input tidak valid.");
        }
        else {
            if (a > b) {
                if ( a - b > 3) {
                    System.out.println("Tim A menang telak lawan B dengan skor A: " + a + " dan skor B: " + b);
                }
                else {
                    System.out.println("Tim A menang lawan B dengan skor A: " + a + " dan skor B: " + b);
                }
            }
            else if (a < b) {
                if (b - a > 3) {
                    System.out.println("Tim B menang telak lawan A dengan skor A: " + a + " dan skor B: " + b);
                } 
                else {
                    System.out.println("Tim B menang lawan A dengan skor A: " + a + " dan skor B: " + b);
                }
            }
            else {
                System.out.println("Pertandingan imbang dengan skor A: " + a + " dan skor B: " + b);
            }
        }
    }
}
    

import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String suatuString;
        int i, jum;
        char karakter;
        
        System.out.println("Masukkan sebuah kalimat: ");
        suatuString = scan.nextLine();
        
        jum=0;
        for (i = 0; i < suatuString.length(); i++) {
            karakter = suatuString.charAt(i);
            if (karakter >= 'A' && karakter <= 'Z') {
                jum++;
            }
        }
        System.out.println("Jumlah huruf kapital adalah " + jum);
    }
    
}

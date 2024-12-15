import java.util.Scanner;

public class OperasiAngka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka pertama");
        double angka_1 = scan.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        double angka_2 = scan.nextDouble();
        
        double jumlah = angka_1 + angka_2;
        double kurang = angka_1 - angka_2;
        double kali = angka_1 * angka_2;
        double bagi = angka_1 / angka_2;
        double modulo = angka_1 % angka_2;
        
        System.out.println(angka_1 + " + " +  angka_2 + " = " + jumlah);
        System.out.println(angka_1 + " - " +  angka_2 + " = " + kurang);
        System.out.println(angka_1 + " * " +  angka_2 + " = " + kali);
        System.out.println(angka_1 + " / " +  angka_2 + " = " + bagi);
        System.out.println(angka_1 + " % " +  angka_2 + " = " + modulo);
        
        
    }
    
}

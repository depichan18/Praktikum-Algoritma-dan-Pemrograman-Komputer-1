import java.util.Scanner;

public class Prisma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan alas: ");
        double alas = scan.nextDouble();
        
        System.out.println("Masukkan tinggi prisma: ");
        double tinggi = scan.nextDouble();
        
        double tinggisegitiga = Math.sqrt(Math.pow(alas, 2)-(Math.pow(alas/2, 2)));
        double luasAlas = alas*tinggisegitiga/2;
        double volume = luasAlas * tinggi;
        double keliling = 3*alas;
        
        double luasPermukaan = (2*luasAlas) + (keliling*tinggi);
        
        System.out.println("Volume prisma adalah: " + volume);
        System.out.println("Luas permukaannya adalah: " + luasPermukaan);
    }
    
}

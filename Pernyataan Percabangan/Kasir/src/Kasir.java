import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ini adalah kasir toko.");
        System.out.println("Anggap uang satuan rupiah.");
        System.out.println("Uang pembeli adalah: ");
        int uang = input.nextInt();
        
        int total_harga = 0;
        for (int i = 1; i>0; i++) {
            System.out.println("Harga barang ke- " + i + " : ");
            int harga = input.nextInt();
            total_harga = total_harga + harga;
            
            System.out.println("Total biaya saat ini : " + total_harga);
            
            if (total_harga > uang) {
                System.out.println("Uang anda tidak cukup!");
                total_harga = total_harga - harga;
                break;
            }
        }
        System.out.println("Total biaya yang harus dibayarkan : " + total_harga);
    }
}

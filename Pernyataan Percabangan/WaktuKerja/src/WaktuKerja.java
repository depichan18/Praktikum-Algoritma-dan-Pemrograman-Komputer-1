import java.util.Scanner;

public class WaktuKerja {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Waktu Kevin menganggur: ");
        int hari = input.nextInt();
        
        int hari_kerja = 0;
        int hari_libur = 0;
        int jumlah = 0;

            for (int i = 1; i <= hari; i++) {
                if (hari % 6 == 0 || hari % 7 == 0) {
                    hari_libur++;
                    jumlah++;
                } else {
                    hari_kerja++;
                    jumlah++;
                }

                if (hari_kerja > 100) {
                    System.out.println("Anda dipecat!");
                    break;
                }
            }
        System.out.println("Total hari kerja adalah " + hari_kerja);
        System.out.println("Total hari libur adalah " + hari_libur);
        
        int harike = hari - hari_kerja;
        System.out.println("Hari ke " + harike + "adalah hari ke-100 kevin bekerja" );
    }
    
}

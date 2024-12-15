import java.util.Scanner;
import javax.swing.JOptionPane;

public class GUIKasir {

    public static void main(String[] args) {
        String[] barang = {"Baju", "Celana", "Topi", "Kaos Kaki"};
        int[] stok = {10, 5, 8, 15};
        int[] harga = {100000, 150000, 50000, 20000};

        JOptionPane.showMessageDialog(null, "Selamat Datang di Butik.");
        int uang = inputUang("Masukkan jumlah uang yang Anda(minimal 20.000): ");
        boolean beliLagi = true;

        while (beliLagi) {
            int pilihanBarang = tampilkanDanPilihBarang(barang, stok, harga, uang);
            int jumlahBeli = masukkanJumlahBeli(barang[pilihanBarang], stok[pilihanBarang]);
            int totalHarga = jumlahBeli * harga[pilihanBarang];
            
            if (uang >= totalHarga) {
                uang -= totalHarga;
                stok[pilihanBarang] -= jumlahBeli;
                if (jumlahBeli > 0){
                    JOptionPane.showMessageDialog(null, "Anda berhasil membeli " + jumlahBeli + " " + barang[pilihanBarang] +
                        "\nSisa uang Anda: Rp" + uang);
                }

                if (uang == 0) {
                    JOptionPane.showMessageDialog(null, "Uang Anda habis. Terima kasih telah berbelanja!");
                    break;
                }
                
                
                int pilihanBeliLagi = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin membeli barang lain?", "Pembelian Lagi", JOptionPane.YES_NO_OPTION);
                if (pilihanBeliLagi == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Terima kasih telah berbelanja!");
                    break;
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Uang Anda tidak cukup untuk membeli barang ini.");
                
                int pilihanBeliLagi = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin membeli barang lain?", "Pembelian Lagi", JOptionPane.YES_NO_OPTION);
                if (pilihanBeliLagi == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Terima kasih telah datang di butik!");
                    break;
                }
            }
        }
    }

    public static int tampilkanDanPilihBarang(String[] barang, int[] stok, int[] harga, int uang) {
        while (true) {
            String daftarBarang = "Barang yang tersedia:\n";
            for (int i = 0; i < barang.length; i++) {
                daftarBarang += (i + 1) + ". " + barang[i] + " - Stok: " + stok[i] + " - Harga: Rp" + harga[i] + "\n";
            }
            daftarBarang += "\nMasukkan nomor barang yang ingin dibeli (1-" + barang.length + "): \n";
            daftarBarang += "Jumlah Uang Anda Sekarang : " + uang;

            int pilihan = inputInteger(daftarBarang) - 1;
            if (pilihan >= 0 && pilihan < barang.length) {
                return pilihan;
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Masukkan sesuai jumlah barang.");
            }
        }
    }

    public static int masukkanJumlahBeli(String barang, int stokTersedia) {
        while (true) {
            int jumlahBeli = inputInteger("Berapa banyak " + barang + " yang ingin Anda beli? (Stok tersedia: " + stokTersedia + ")");
            if (jumlahBeli > 0 && jumlahBeli <= stokTersedia) {
                return jumlahBeli;
            } else if (jumlahBeli > stokTersedia) {
                JOptionPane.showMessageDialog(null, "Jumlah melebihi stok yang tersedia. Silakan masukkan jumlah yang valid.");
                return 0;
            } else {
                JOptionPane.showMessageDialog(null, "Jumlah harus lebih dari 0. Silakan coba lagi.");
            }
        }
    }

    public static int inputUang(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(message);
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Proses dibatalkan.");
                System.exit(0);
            }
            Scanner scanner = new Scanner(input);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 20000) {
                    return number;
                }
            }
            JOptionPane.showMessageDialog(null, "Input harus sesuai jumlah uang minimal atau lebih. Silakan input lagi.");
        }
    }
    public static int inputInteger(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(message);
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Proses dibatalkan.");
                System.exit(0);
            }
            Scanner scanner = new Scanner(input);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1) {
                    return number;
                }
            }
            JOptionPane.showMessageDialog(null, "Input harus sesuai pilihan daftar(1-4). Silakan masukkan lagi.");
        }
    }
}

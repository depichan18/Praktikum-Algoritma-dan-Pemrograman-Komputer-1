public class Lingkaran {

    public static void main(String[] args) {
        double PHI = 3.14;
        double jarijari, luas, keliling;
        
        System.out.println("Menghitung Luas Lingkaran dan Kelilingnya");
        
        jarijari = 7;
        
        luas = PHI*jarijari*jarijari;
        
        System.out.println("Luas Lingkaran adalah " + luas);
        
        keliling = 2*PHI*jarijari;
        
        System.out.println("Kelilingnya adalah " + keliling);
    }
    
}

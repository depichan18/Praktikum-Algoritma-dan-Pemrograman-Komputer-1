import java.util.Scanner;

public class Celcius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan suhu dalam celcius: ");
        int celcius, kelvin;
        double reamur, fahrenheit;
        
        celcius = input.nextInt();
        kelvin = celcius + 273;
        reamur = 4.0/5.0*celcius;
        fahrenheit = (9.0/5.0*celcius) + 32;
        
        System.out.println("Celcius dalam kelvin: " + kelvin);
        System.out.println("Celclius dalam reamur: " + reamur);
        System.out.println("Celcius dalam fahrenheit:" + fahrenheit);
    }
    
}

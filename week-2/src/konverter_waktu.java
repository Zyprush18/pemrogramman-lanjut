import java.util.Scanner;

public class konverter_waktu {
    public static void main(){
        System.out.println("==== Selamat Datang di Konverter waktu: detik ke jam ====");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan detik: ");
        double detik = input.nextDouble();

        double jam = detik / 3600;

        System.out.printf("%d detik setara dengan %.1f jam",(int)(detik), jam);
    }
}

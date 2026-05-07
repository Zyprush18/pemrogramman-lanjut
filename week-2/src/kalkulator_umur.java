import java.time.Year;
import java.util.Scanner;

public class kalkulator_umur{
    public static void main(String[] args) {
        System.out.println("==== Selamat Datang di Kalkulator Umur ====");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tahun Kelahiran Anda: ");
        int tahun_kelahiran = input.nextInt();

        int hasil = Year.now().getValue() - tahun_kelahiran;
        System.out.println("Umur Anda Sekarang Adalah "+ hasil +" Tahun");
    }
}
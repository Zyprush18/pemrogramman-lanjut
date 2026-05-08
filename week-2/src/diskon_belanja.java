import java.util.Scanner;

public class diskon_belanja {
    public static void main(){
        System.out.println("==== Selamat Datang Di Penghitung Harga Belanja Setelah Diskom ====");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Harga Barang: ");
        double harga_belanja = input.nextDouble();

        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah_barang = input.nextInt();

        System.out.print("Masukkan Diskon (%): ");
        double diskon = input.nextDouble();

        double total = harga_belanja * jumlah_barang;
        double harga_bayar = total - (total * diskon / 100);

        System.out.println("Total Harga Anda setelah dikurangi diskon sebesar: "+ harga_bayar);
    }

}

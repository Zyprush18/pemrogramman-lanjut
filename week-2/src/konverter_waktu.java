import java.util.Scanner;

public class konverter_waktu {
    public static void main(){
        System.out.println("====");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan detik: ");
        int detik = input.nextInt();

        int jam = detik / 3600;
        int menit = detik / 60;

        System.out.println(detik + " detik setara dengan "+ jam + " jam dan "+ menit + " menit");
    }

}

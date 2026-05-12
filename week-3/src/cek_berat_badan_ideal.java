import java.util.Scanner;

public class cek_berat_badan_ideal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan Anda: ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Tinggi Anda (cm): ");
        double tinggi = input.nextDouble();

        double tinggi_m = tinggi / 100;
        double bb_ideal = berat / Math.pow(tinggi_m, 2);

        if (bb_ideal < 18.5){
            System.out.println("Kurus");
        } else if (bb_ideal < 25) {
            System.out.println("Ideal");
        } else if (bb_ideal < 30) {
            System.out.println("Kelebihan Berat Badan");
        }else {
            System.out.println("Obesitas");
        }

    }

}

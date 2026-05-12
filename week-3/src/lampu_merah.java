import java.util.Scanner;

public class lampu_merah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Warna Lampu Lalu Lintas Sekarang (Merah/Kuning/Hijau): ");
        String lampu = input.nextLine();

        switch (lampu.toLowerCase()){
            case "merah":
                System.out.println("Berhenti");
                break;
            case "kuning":
                System.out.println("Hati-Hati");
                break;
            case "hijau":
                System.out.println("Jalan");
                break;
            default:
                System.out.println("Warna Lampu Lalu Lintas Tidak Di kenali");
        }
    }
}

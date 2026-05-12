import java.util.Scanner;

public class konversi_nilai_predikat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Predikat (A/B/C/D/E): ");
        String nilai = input.nextLine();

        switch (nilai.toUpperCase()){
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup Baik");
                break;
            case "D":
                System.out.println("Kurang Baik");
                break;
            case "E":
                System.out.println("Sangat Kurang Baik");
                break;
            default:
                System.out.println("Nilai Tidak di kenali");

        }

    }
}

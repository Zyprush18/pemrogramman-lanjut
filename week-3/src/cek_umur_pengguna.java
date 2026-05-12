import java.util.Scanner;

public class cek_umur_pengguna {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();

        if (umur >= 60){
            System.out.println("Umur Kategori Lansia");
        } else if (umur >= 18 && umur <= 59) {
            System.out.println("Umur Kategori Dewasa");
        } else if (umur >= 13 && umur <= 17) {
            System.out.println("Umur Kategori Remaja");
        } else if(umur >= 6 && umur <= 12) {
            System.out.println("Umur Kategori Anak-Anak");
        } else if (umur >= 3 && umur <= 5) {
            System.out.println("Umur Kategori Balita");
        }else{
            System.out.println("Umur Kategori Bayi");
        }

    }
}

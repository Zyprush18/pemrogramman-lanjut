import java.util.Random;
import java.util.Scanner;

public class tebak_angka {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angka_random = rand.nextInt(10);

        System.out.print("Masukkan Angka Tebakan Anda (0-10): ");
        int tebakan = input.nextInt();

        if (tebakan == angka_random){
            System.out.println("Tebakan Anda Benar");
        }else{
            System.out.printf("Tebakan Anda Salah. Jawaban yang benar Adalah %d", angka_random);
        }
    }
}

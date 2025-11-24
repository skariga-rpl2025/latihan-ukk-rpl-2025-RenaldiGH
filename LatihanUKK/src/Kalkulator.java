
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        int pilih;

        System.out.println("======= KAlKULATOR SEDERHANA =======");
        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Masukan pilihan (1-4) : ");
        pilih = input.nextInt();

        System.out.println("Masukan angka : ");
        angka1 = input.nextDouble();

        System.out.println("Masukan angka : ");
        angka2 = input.nextDouble();

        switch (pilih) {
            case 1 :
                hasil = angka1 + angka2;
                break;

            case 2 :
                hasil = angka1 - angka2;
                break;

            case 3 :
                hasil = angka1 * angka2;
                break;

            case 4 :
                hasil = angka1 / angka2;
                break;

            default:
                System.out.println("Input tidak valid");

                return;

        }
        System.out.println("hasil : " + hasil);

    }
}

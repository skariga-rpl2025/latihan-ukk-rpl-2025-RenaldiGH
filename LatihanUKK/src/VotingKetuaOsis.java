/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;

public class VotingKetuaOsis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan = "";

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B) atau ketik 'selesai' untuk berhenti: ");
            pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("selesai")) {
                break;
            }

            if (pilihan.equalsIgnoreCase("A")) {
                suaraA++;
            } else if (pilihan.equalsIgnoreCase("B")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Pilih A atau B saja.");
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Total suara Kandidat A: " + suaraA);
        System.out.println("Total suara Kandidat B: " + suaraB);

        input.close();
    }
}



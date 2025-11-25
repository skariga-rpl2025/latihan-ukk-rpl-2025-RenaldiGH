/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;

public class PendaftaranAngotaGYM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String lagi;

        System.out.println("===== PENDAFTARAN ANGGOTA GYM =====\n");

        do {
            System.out.print("Masukkan nama anggota: ");
            String nama = input.nextLine();
            totalAnggota++;

            System.out.print("Daftar anggota lagi? [ya/tidak]> ");
            lagi = input.nextLine();

            System.out.println(); 

        } while (lagi.equalsIgnoreCase("ya"));

        System.out.println("----------------------------------------");
        System.out.println("Total anggota yang didaftarkan: " + totalAnggota);

        input.close();
    }
}

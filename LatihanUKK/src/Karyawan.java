/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba
 */
public class Karyawan {

    private int nip;
    private String nama;
    private String jabatan;

    public Karyawan(int nip, String nama, String jabatan) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void tampilkanData() {
        System.out.println("==== DATA KARYAWAN ====");
        System.out.println("NIP   : " + nip);
        System.out.println("Nama  : " + nama);
        System.out.println("Jabatan : " + jabatan);
    }
}

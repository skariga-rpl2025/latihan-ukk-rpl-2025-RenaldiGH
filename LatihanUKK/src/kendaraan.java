/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba
 */
public class kendaraan {

    private int noPlat;
    private String warna;
    private int tahun;

    public kendaraan(int noPlat, String warna, int tahun) {
        this.noPlat = noPlat;
        this.warna = warna;
        this.tahun = tahun;
    }

    public int getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(int noPlat) {
        this.noPlat = noPlat;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void tampilkanData() {
        System.out.println("==== DATA KENDARAAN ====");
        System.out.println("No. Plat : " + noPlat);
        System.out.println("Warna    : " + warna);
        System.out.println("Tahun    : " + tahun);
    }
}

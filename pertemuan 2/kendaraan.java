/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Kendaraan {
    // Atribut 
    String merk;
    String tipe;
    int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan kendaraan
    void tambahKecepatan(int km) {
        this.kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk mengurangi kecepatan kendaraan
    void kurangiKecepatan(int km) {
        if (this.kecepatan - km < 0) {
            this.kecepatan = 0;
        } else {
            this.kecepatan -= km;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk menghentikan kendaraan
    void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }
}

public class kendaraan {
    public static void main(String[] args) {
        // Membuat objek kendaraan
        Kendaraan kendaraan1 = new Kendaraan("Toyota", "Mobil", 60);
        Kendaraan kendaraan2 = new Kendaraan("Yamaha", "Motor", 40);

        // Menampilkan informasi awal dan melakukan aksi pada kendaraan pertama
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahKecepatan(20);
        kendaraan1.kurangiKecepatan(30);
        kendaraan1.berhenti();
        kendaraan1.tampilkanInfo();

        System.out.println(); // Memberi jarak antara kendaraan pertama dan kedua

        // Menampilkan informasi awal dan melakukan aksi pada kendaraan kedua
        kendaraan2.tampilkanInfo();
        kendaraan2.tambahKecepatan(30);
        kendaraan2.kurangiKecepatan(40);
        kendaraan2.berhenti();
        kendaraan2.tampilkanInfo();
    }
}

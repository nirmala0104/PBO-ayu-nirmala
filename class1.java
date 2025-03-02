/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
//Definisi Kelas
class Mahasiswa{
    //Atribut (data) 
    String nama;
    int nim;
    
    //Konstruktor (metode khusus untuk inisialisasi objek)
    Mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    //Metode untuk menampilkan informasi
    void tampilkanInfo(){
        System.out.println("Nama: " + nama + ",NIM: " + nim);
    }
}

//Program Utama
public class class1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", 220001);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 220002);
        
        //Menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}

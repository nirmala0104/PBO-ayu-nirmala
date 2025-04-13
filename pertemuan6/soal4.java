/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> daftartugas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("\n===MENU TO-DO LIST===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan;
            if (scanner.hasNextInt()){
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
            }else{
                System.out.println("harap masukkan angka yang valid ");
                scanner.next();
                continue;
            }
            switch(pilihan){
                case 1:
                    System.out.print("masukkan tugas baru: ");
                    String tugas = scanner.nextLine();
                    daftartugas.add(tugas);
                    System.out.println("tugas berhasil ditambahkan");
                    break;
                case 2:
                      if (daftartugas.isEmpty()) {
                        System.out.println("Daftar tugas kosong.");
                    } else {
                        System.out.println("\nDaftar Tugas:");
                        for (int i = 0; i < daftartugas.size(); i++) {
                            System.out.println((i + 1) + ". " + daftartugas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (daftartugas.isEmpty()) {
                        System.out.println("Tidak ada tugas yang bisa dihapus.");
                    } else {
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        if (scanner.hasNextInt()) {
                            int indeks = scanner.nextInt();
                            if (indeks > 0 && indeks <= daftartugas.size()) {
                                daftartugas.remove(indeks - 1);
                                System.out.println("Tugas berhasil dihapus.");
                            } else {
                                System.out.println("Nomor tugas tidak valid.");
                            }
                        } else {
                            System.out.println("Harap masukkan angka yang valid!");
                            scanner.next(); // Membersihkan input yang salah
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan To-Do List!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    
            }
        }
    }
}
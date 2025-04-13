/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Random;
import java.util.Scanner;

public class soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int angkarahasia = random.nextInt(100)+1;//memilih angka dari 1 sampai 100
        int tebakan = -1;
        int percobaan = 0;
        
        System.out.println("Selamat Datang di Permainan Tebak Angka");
        System.out.println("Saya telah memilih angka dari 1-100");
        System.out.println("Coba tebak atau 0 untuk keluar");
        
        while (tebakan != angkarahasia){
            System.out.print("Masukkan Tebakan Anda : ");
            tebakan = scanner.nextInt();
           
            if (tebakan==0){
                System.out.println("Permainan dihentikan. Terimakasih telah bermain!");
                break;
            }
            
            percobaan ++;
            if(tebakan>angkarahasia){
            System.out.println("terlalu besar! coba lagi");
            
            }else if(tebakan<angkarahasia){
            System.out.println("terlalu kecil!! coba lagi");
            }else {
            System.out.println("selamat!! Anda berhasil menebak angka dengan benar dalam:"+percobaan+" percobaan");
            break;
            }
        }
        scanner.close();
            
                
    }
}
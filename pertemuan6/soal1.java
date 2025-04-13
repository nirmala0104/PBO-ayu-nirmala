/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class soal1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctusername = "admin";
        String correctpassword = "password123";
        
        int attempts = 0;
        boolean success = false;
     
        while (attempts < 3){
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();
         
            if (username.equals(correctusername)&& password.equals(correctpassword)){
                System.out.println("Selamat datang, " + username + "!");
                return;//menghentikan program saat login berhasil
            }else {
                attempts++;
                System.out.println("usename atau password salah!!percobaan: "+ attempts + "/3");
            }
        }
        if(!success){
            System.out.println("akun anda diblokir!!!");
        }
        scanner.close();
    }
}
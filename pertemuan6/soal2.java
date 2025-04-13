/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char ulangi;
       
        do{
            //memasukkan angka pertama
            System.out.print("masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
           
            //memasukkan operator 
            System.out.print("masukkan operator(+,_,*,/,%): ");
            char operator = scanner.next().charAt(0);
           
            //memasukkan angka kedua
            System.out.print("masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
           
            double hasil;
            boolean valid = true;
           
            //menggunakan switch-case untuk mengoprasikan matematika
            switch (operator){
                case '+':
                hasil = angka1 + angka2;
                break;
               
                case '-':
                    hasil = angka1 - angka2;
                    break;
                   
                case '*':
                    hasil = angka1 * angka2;
                    break;
                    
                case '/':
                    if (angka2 !=0){
                        hasil = angka1/angka2;
                    }else {
                        System.out.println("error: pembagian dengan nol tidak boleh!");
                        valid = false;
                        hasil = 0;
                    }
                    break;
                    
                case '%':
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    valid = false;
                    hasil = 0;   
            }
            
            //menampilkan hasil jika operasi valid
            if (valid){
                System.out.println("hasil: "+hasil);
            }
            // menanyakan apakah ingin menghitung lagi
            System.out.print("Apakah anda ingin menghitung lagi? (y/n)");
            ulangi = scanner.next().charAt(0); 
          
        }while(ulangi == 'y'|| ulangi == 'Y');
        
        System.out.println("terima kasih telah menggunakan kalkulator!!");
        scanner.close();
    }
}

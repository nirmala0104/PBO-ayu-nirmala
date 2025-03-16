/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Kalkulator {
//Metode pertama: Menjumlahkan dua angka
    int tambah(int a, int b){
        return a+b;
    }
//Metode kedua: Menjumlahkan tiga angka (Overloading)
    int tambah(int a, int b, int c){
        return a+b+c;
    }
//Metode ketiga: Menjumlahkan dua angka desimal (overloading)
    double tambah(double a, double b){
        return a+b;
    }
}

public class polimorfisme_kompilasi {
    public static void main(String args[]) {
        Kalkulator k=new Kalkulator();
        
        System.out.println(k.tambah(5, 10)); //Memanggil metode pertama
        System.out.println(k.tambah(5, 10, 15)); //Memanggil motode kedua
        System.out.println(k.tambah(5.5, 2.5)); //Memanggil metode ketiga
    }
}

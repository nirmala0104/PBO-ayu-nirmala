/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Hewan{
    String nama;
    
    Hewan(String nama){
        this.nama=nama;
    }
    
    void info(){
        System.out.println("Nama: "+nama);
    }
}

class Kucing extends Hewan{
    Kucing(String nama){
        super(nama); //Memanggil konstruktor superclass
    }
}
public class lat5 {
    public static void main(String args[]) {
        //Membuat objek Kucing
        Kucing kucing = new Kucing("tom");
        
        //Memanggil method info() untuk menampilkan nama kucing
        kucing.info();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */

interface Hewan{
    void makan();
}

interface Mamalia{
    void menyusui();
}

class Kucing implements Hewan, Mamalia{
    public void makan(){
        System.out.println("Kucing makan ikan.");
    }
    public void menyusui(){
        System.out.println("Kucing menyusui anaknya.");
    }
}
public class multiple_inheritance {

    public static void main(String args[]) {
        //Membuat objek Kucing
        Kucing kucing = new Kucing();
        
        //Memanggil Method-method yang dimiliki oleh kucing
        kucing.makan();
        kucing.menyusui();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Hewan {
    void makan(){
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void suara(){
        System.out.println("Meow!");
    }
}

class KucingAnggora extends Kucing {
    void jenis(){
        System.out.println("Ini adalah kucing anggora.");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args){
        KucingAnggora anggora = new KucingAnggora();
        anggora.makan(); //dari superclass Hewan
        anggora.suara(); //dari subclass Kucing
        anggora.jenis(); //dari subclass KucingAnggora
    }
}

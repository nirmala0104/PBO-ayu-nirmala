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

class Kucing extends Hewan{
    void suara(){
        System.out.println("Meow!");
    }
}

class Anjing extends Hewan{
    void suara(){
        System.out.println("Guk Guk!");
    }
}

public class hierarchical_inheritance{
    public static void main(String[] args) {
        Kucing persia = new Kucing();
        Anjing golden = new Anjing();
        
        
        persia.makan(); //dari superclass hewan
        persia.suara(); //dari subclass Kucing
        
        golden.makan(); //dari superclass hewan
        golden.suara(); //dari subclass Anjing
    }
}

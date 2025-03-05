/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
//Interface
interface Hewan{
    void bersuara(); //Method abstrak
}

//Implementasi pada kelas kucing
class Kucing implements Hewan{
    @Override
    public void bersuara(){
        System.out.println("Kucing mengeong: Meow Meow");
    }
}

//Implementasi pada kelas Anjing
class Anjing implements Hewan{
    @Override
    public void bersuara(){
        System.out.println("Anjing menggonggong: Woof Woof");
    }
}

//Main class untuk menjalankan program
public class InterfaceClass {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        anjing.bersuara();
    }
}

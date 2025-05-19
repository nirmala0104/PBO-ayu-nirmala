/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Mesin{
    private void cekBahanBakar(){
        System.out.println("Cek bahan bakar sebelum menyalakan mesin...");
    }
    
    public void nyalakanMesin(){
        cekBahanBakar(); //bisa dipanggil didalam kelas
        System.out.println("Mesin menyala!");
    }
}

public class lat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Mesin mobil = new Mesin();
        mobil.nyalakanMesin();
        //mobil.cekBahanBakar(); //error: cekBahanBakar() bersifat Private
    }
}

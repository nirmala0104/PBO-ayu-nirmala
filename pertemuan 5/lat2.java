/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Mahasiswa{
    private String nama; //tidak bisa diakses langsung dari luar kelas
    //Constructor
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    //Getter untuk mengakses nama
    public String getNama(){
        return nama;
    }
}

public class lat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Mahasiswa mhs = new Mahasiswa("Adi");
        //System.out.println(mhs.nama); //error: nama bersifat private
        System.out.println(mhs.getNama()); //akses melalui metode getter
    }
}

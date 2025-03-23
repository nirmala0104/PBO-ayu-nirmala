/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class BankAccount{
    private double saldo; //tidak bisa diakses langsung
    public BankAccount(double saldoAwal){
        this.saldo = saldoAwal;
    }
    
    //Getter
    public double getSaldo(){
        return saldo;
    }
    
    //Setter dengan validasi
    public void setSaldo(double jumlah){
        if(jumlah>=0){
            this.saldo = jumlah;
        } else{
            System.out.println("Saldo tidak bisa negatif!");
        }
    }
    
    //nyetor saldo
    public void setor(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
            System.out.println("Berhasil menyetor: Rp" + jumlah);
        } else{
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
    }
}
public class lat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //membuat objek rekening bank dengan saldo awal Rp 1.000.000
        BankAccount rekening = new BankAccount(1000000);
        
        //menampilkan saldo awal
        System.out.println("Saldo awal: Rp" + rekening.getSaldo());
        //nyetor uang
        rekening.setor(100000);
        System.out.println("Saldo setelah setor: Rp" + rekening.getSaldo());
    }
}

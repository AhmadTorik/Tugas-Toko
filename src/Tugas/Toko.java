/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Toko {
    public int id_barang;
    public String nama_barang;
    public int harga_barang;
    public String merek_barang;
    public int jumlahbarang;
    
    public Toko (int id_barang, String nama_barang, int harga_barang,String merek_barang,int jumlahbarang)
    {
     this.id_barang = id_barang;
     this.nama_barang = nama_barang;
     this.harga_barang = harga_barang;
     this.merek_barang = merek_barang;
     this.jumlahbarang = jumlahbarang;
    }
    
    public void info()
    {   Scanner masukan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI TOKO BUKU ");
        System.out.println("============================ ");
        System.out.print("ID Barang : " +this.id_barang);
        id_barang= masukan.nextInt();
        System.out.print("Nama Barang : "+this.nama_barang);
         nama_barang= masukan.next();
        System.out.print("Harga Barang : "+this.harga_barang);
         harga_barang= masukan.nextInt();
        System.out.print("Merek Barang : "+this.merek_barang);
         merek_barang= masukan.next();
          System.out.print("Jumlah Barang : "+this.jumlahbarang);
         jumlahbarang= masukan.nextInt();
          System.out.println("============================ ");
    }
}

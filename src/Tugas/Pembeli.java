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
class Pembeli extends Toko {
    public int id_pembeli;
    public String nama_pembeli;
    public String alamat;
    public int no_telepon;

    public Pembeli(int id_pembeli,String nama_pembeli,String alamat,int no_telepon,int id_barang, String nama_barang, int harga_barang, String merek_barang,int jumlahbarang) {
        super(id_barang, nama_barang, harga_barang, merek_barang,jumlahbarang);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telepon = no_telepon;
    }
    public void info()
    {   super.info();
        Scanner masukan = new Scanner(System.in);
         System.out.print("ID Pembeli : "+ this.id_pembeli);
         
         id_pembeli = masukan.nextInt();
        System.out.print("Nama Pembeli : "+ this.nama_pembeli);
        
         nama_pembeli = masukan.next();
        System.out.print("Alamat : "+ this.alamat);
        
         alamat = masukan.next();
        System.out.print("No.Telepon : " + this. no_telepon);
      
         no_telepon = masukan.nextInt();
         System.out.println("============================ ");
    }
}

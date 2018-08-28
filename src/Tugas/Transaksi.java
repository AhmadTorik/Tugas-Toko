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
public class Transaksi extends Pembeli {
    public int bayar;
    public String tanggaltransaksi;
    public String kasir;
    public int total;
    public int kembali;
   

    Transaksi(int total,int kembali,int bayar,String kasir,String tanggaltransaksi,int id_pembeli, String nama_pembeli, String alamat, int no_telepon, int id_barang, String nama_barang, int harga_barang, String merek_barang,int jumlahbarang)
    {
     super(id_pembeli, nama_pembeli, alamat, no_telepon, id_barang, nama_barang, harga_barang, merek_barang,jumlahbarang);
     this.bayar = bayar;
     this.tanggaltransaksi = tanggaltransaksi;
     this.kasir =kasir;
     this.total = total;
     this.kembali = kembali;
    }
    public void info()
    {    Scanner masukan = new Scanner(System.in);
        super.info();
         System.out.print("Tanggaltransaksi : "+ this.tanggaltransaksi);
         tanggaltransaksi = masukan.next();
         System.out.print("Kasir : "+ this.kasir);
         kasir = masukan.next();
         System.out.print("Bayar : "+this.bayar);
         bayar = masukan.nextInt();
          System.out.println("Total : "+ (jumlahbarang*harga_barang));
          System.out.println("Kembali : "+ (bayar-(jumlahbarang*harga_barang)));
          System.out.println("============================ ");
          System.out.println("TERIMA KASIH ");
         
         
    }
    }
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author ASUS
 */
public class DetailPeminjaman extends Peminjam
{
    private int tanggalpeminjaman;
    private int tanggalkembali;
    
    public DetailPeminjaman(int tanggalpeminjaman,int tanggalkembali, String peminjam, String buku )
    {
        super(peminjam,buku);
        this.tanggalpeminjaman = tanggalpeminjaman;
        this.tanggalkembali= tanggalkembali;
    }
    public void info()
    {
        super.info();
        System.out.println("Tanggal Peminjaman : "+this.tanggalpeminjaman);
        System.out.println("Tanggal Pengembalian : "+this.tanggalkembali);
    }
}

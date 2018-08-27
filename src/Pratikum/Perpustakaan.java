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
public class Perpustakaan {
    private String buku;
    
    public Perpustakaan (String buku)
    {
        this.buku = buku;
    }
    public void info()
    {
        System.out.println("Buku yang dipinjam : "+this.buku);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author ASUS
 */
public class Demo {
    public static void main (String[]args)
    {
        B objek = new B();
        objek.setA(50);
        objek.setB(150);
        //akan meanggil method yang terdapat pada kelas B
        objek.tampilkanNilai();
    }
}

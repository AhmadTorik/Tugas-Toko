/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ASUS
 */
public class Gajah extends Hewan {
    public static void testclassMethod()
    {
        System.out.println("The class method in hewan...");
    }
    //Meng Override Method Pada Class Animal
    public void testInstanceMethod()
    {
        System.out.println("The Instance Method In Gajah...");
    }
    public static void main(String[]Args)
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Hewan();
        Hewan.testclassMethod();
        myHewan.testInstanceMethod();
    }
}

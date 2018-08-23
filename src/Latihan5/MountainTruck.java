/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class MountainTruck extends Truck{
    //the Mountaintruck SubClass adds one fields
    public int seatHeight;
    //theMountainTruck subclass has one constructor
    public MountainTruck(int startHeight,int startCadance, int startSpeed, int startGear) {
        
        super(startCadance, startSpeed, startGear);
        seatHeight = seatHeight;
    }
    //the mountaintruck subclass adds one method
    public void seatHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public static void main (String[]args)
    {
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck (0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
         System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
         System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        
        
    }
}

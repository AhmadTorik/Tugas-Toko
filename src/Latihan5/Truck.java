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
public class Truck {
    //The truck class has Three Fields
    public int cadance;
    public int gear;
    public int speed;
    //The Truck class has one Constructor
    public Truck (int startCadance, int startSpeed, int startGear)
    {
        gear = startGear;
        cadance = startCadance;
        speed = startSpeed;
    }
    //the Truck class has four methods
    public void setCadance(int newValue)
    {
        cadance = newValue;
    }
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    public void applybrake (int decrement)
    {
        speed = decrement;
    }
    public void speedUp(int increment)
    {
        speed = increment;
    }
}

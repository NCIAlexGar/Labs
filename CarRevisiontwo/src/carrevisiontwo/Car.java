/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrevisiontwo;

/**
 *
 * @author Alex
 */
public class Car extends Vechile{
    int numDoors;
    
    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors=numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
    @Override
    public String getDetails(){
        return  "model:" + model + "\nbrand:" + brand + "\nYear:" + year + "\nnumDoors:" + numDoors;
    }
    
    
}

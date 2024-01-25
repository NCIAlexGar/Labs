/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

/**
 *
 * @author Alex
 */
public class Vechile {
   String brand, model;
    int year;
    
    public Vechile(String brand,String model, int year){
        this.model=model;
        this.year=year;
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getDetails(){
        return "Brand:" + brand + "\nModel:" + model + "\nyear:" + year;
    }
 
}

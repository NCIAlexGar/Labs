/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactp;

/**
 *
 * @author Alex
 */
public class Contact {
    String name;
    String surname;
    String email;
    String address;
    int phonenumber;

    public Contact(String name, String surname, String email, String address, int phonenumber) {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.address=address;
        this.phonenumber=phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }
    
    
     public String getDetails(){
         return "Name:" + name + "\nSurname:" + surname + "\nemail:" + email + "\naddress:" + email + "\nPhone Number:" + phonenumber;
     }  
    
}

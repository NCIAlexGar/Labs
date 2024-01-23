/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactp;

/**
 *
 * @author Alex
 */
public class extraInfo extends Contact{
    String position;
    double salary;

    public extraInfo(String name, String surname, String email, String address, int phonenumber, String position, double salary) {
        super(name, surname, email, address, phonenumber);
        this.position=position;
        this.salary=salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

   
    
    @Override
    public String getDetails(){
        return "Name:" + name + "\nSurname:" + surname + "\nemail:" + email + "\naddress:" + email + "\nPhone Number:" + phonenumber + "\nPosition:" + position + "\nSalary:" + salary;
    }
    
}

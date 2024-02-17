/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ticketbookingsystem;

/**
 *
 * @author x22440482
 */
public interface BookingInterface {
    
    
    public void add(String name, int ticketNum); 
    public void remove(); 
    public Ticket searchTicketByName(String name);
    public boolean isEmpty();
    public void result(); 
    public int size();
    
    
}

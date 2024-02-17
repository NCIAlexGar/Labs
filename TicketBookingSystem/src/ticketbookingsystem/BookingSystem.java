/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketbookingsystem;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author x22440482
 */
public class BookingSystem implements BookingInterface{
    private Queue<Ticket> tickets;
    
   public BookingSystem() {
        this.tickets = new LinkedList<>();
    }
   
    @Override
    public void add(String name, int ticketNum ){
        Ticket ticket = new Ticket(name, ticketNum);
        tickets.offer(ticket);
        
        
        
    }
    
    @Override
    public void remove(){
         tickets.poll();
    }
    
    @Override
    public Ticket searchTicketByName(String name){
        
        for (Ticket ticket : tickets) {
            if (ticket.getName().equals(name)) {
                return ticket;
            }
        }
        return null;
        
    }
    
    @Override
    public boolean isEmpty(){
        
         return tickets.isEmpty();
        
    }
    
    @Override
    public void result(){
        System.out.println("Tickets:");
        for (Ticket ticket : tickets) {
            System.out.println("Name: " + ticket.getName() + ", Ticket Number: " + ticket.getTicketNum());
        }
    }
    
    @Override
    public int size(){
       return tickets.size();
        
       
    }

   

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketbookingsystem;

import java.util.Scanner;

/**
 *
 * @author x22440482
 */
public class TicketBookingSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BookingInterface bookingSystem = new BookingSystem();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add a ticket");
            System.out.println("2. Remove a ticket");
            System.out.println("3. Search for a ticket by name");
            System.out.println("4. Check if the system is empty");
            System.out.println("5. Display all tickets");
            System.out.println("6. Get the number of tickets");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ticket number: ");
                    int ticketNum = scanner.nextInt();
                    bookingSystem.add(name, ticketNum);
                    break;
                case 2:
                    bookingSystem.remove();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Ticket searchedTicket = bookingSystem.searchTicketByName(searchName);
                    if (searchedTicket != null) {
                        System.out.println("Ticket found: " + searchedTicket.getName() + ", Ticket Number: " + searchedTicket.getTicketNum());
                    } else {
                        System.out.println("Ticket not found.");
                    }
                    break;
                case 4:
                    System.out.println("System is" + (bookingSystem.isEmpty() ? " " : " not ") + "empty");
                    break;
                case 5:
                    bookingSystem.result();
                    break;
                case 6:
                    System.out.println("Number of tickets: " + bookingSystem.size());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
        
        
        
    }
    


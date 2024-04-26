package Bioskop;

import java.util.ArrayList;
import java.util.List;

public class User {
    
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private List<String> ticketLists;
    private static final int MAX_TICKET = 20;

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
        this.ticketLists = new ArrayList<>();
    }

    public boolean addTicket(String ticket) {
        if (ticketLists.size() < MAX_TICKET) {
            ticketLists.add(ticket);
            return true;
        } else {
            System.out.println("Cannot add more tickets. Max limit reached.");
            return false;
        }
    }

    public void displayAllTickets() {
        if (ticketLists.isEmpty()) {
            System.out.println("No tickets booked.");
        } else {
            System.out.println("Tickets for " + fullName + ":");
            for (String ticket : ticketLists) {
                System.out.println(ticket);
            }
        }
    }

    public boolean isMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getMaxTicket() {
        return MAX_TICKET;
    }
}

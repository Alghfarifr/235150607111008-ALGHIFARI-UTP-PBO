package Bioskop;
public class Main {
    public static void main(String[] args) {
        User user = new User(email, password, fullName);
        Movie movie = new Movie("Avengers: Endgame", 180);
        Studio studio = new Studio(1, "Premiere");
        Ticket ticket = new Ticket(movie, studio);

        System.out.println("Email:  " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Full Name: " + user.getFullName());
        System.out.println("Movie: " + ticket.getMovie().getTitle());
        System.out.println("Studio Number: " + ticket.getStudio().getNumber());
        System.out.println("Studio Type: " + ticket.getStudio().getType());
        System.out.println("Ticket Price: " + ticket.getPrice() + " IDR");

    }
}
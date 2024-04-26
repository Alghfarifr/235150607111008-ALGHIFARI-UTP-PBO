package Bioskop;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private ArrayList<User> listUsers;
    private ArrayList<Studio> listStudios;

    class User {
        private String email;
        private String password;
        private ArrayList<Ticket> tickets;

        public User(String email, String password) {
            this.email = email;
            this.password = password;
            this.tickets = new ArrayList<>();
        }

        public boolean checkCredentials(String email, String password) {
            return this.email.equals(email) && this.password.equals(password);
        }

        public void addTicket(Ticket ticket) {
            tickets.add(ticket);
        }
    }
}
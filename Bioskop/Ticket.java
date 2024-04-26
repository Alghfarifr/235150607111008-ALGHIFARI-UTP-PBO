package Bioskop;

public class Ticket {
    private Movie movie;
    private Studio studio;
    private double price; 
    private User user;

    public Ticket(Movie movie, Studio studio) {
        this.movie = movie;
        this.studio = studio;
        this.price = getTicketPrice();
        this.studio = studio;
        this.user = user;
    }

    private double getTicketPrice() {
        switch (studio.getType()) {
            case "Premiere":
                return 120000; 
            case "Imax":
                return 100000; 
            default:
                return 50000;  
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public Studio getStudio() {
        return studio;
    }

    public double getPrice() {
        return price;
    }
}

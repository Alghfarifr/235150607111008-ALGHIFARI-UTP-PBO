package Bioskop;
public class Studio {
    private int index;
    private int number;
    private String type;
    private String movieTitle;

    public Studio(int number, String type) {
        this.index = index;
        this.number = number;
        this.type = type;
        this.movieTitle = movieTitle;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getStudioInfo() {
        return "Studio Index: " + index + ", Type: " + type + ", Movie: " + movieTitle;
    }
}
package Day1Assignment;

public class Game {

    private String gameName;
    private String authorName;
    private float price;

    public Game() {}

    public Game(String gameName, String authorName, float price) {
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game Name: " + gameName +
                ", Author: " + authorName +
                ", Price: " + price;
    }
}

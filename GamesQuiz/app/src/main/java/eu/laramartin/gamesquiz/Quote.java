package eu.laramartin.gamesquiz;

/**
 * Created by lariki on 6/6/16.
 */
public class Quote {
    String phrase;
    String author;
    String game;
    int backgroundColor;

    public Quote(String phrase, String author, String game) {
        this.phrase = phrase;
        this.author = author;
        this.game = game;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}

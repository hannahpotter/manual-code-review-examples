package game;

public class Player
{
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public getName() {
        return this.name;
    }

    public getScore() {
        return this.score;
    }
}
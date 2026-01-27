package game;

import java.util.List;
import java.util.ArrayList;

public class Game
{
    /**
     * List of players (name, point) in the game.
     */
    private ArrayList<Player> players;

    /**
     * Create a new game with no players
     */
    public Game() {
        this.players = new ArrayList<>();
    }

    /**
     * Add a new player to the game with a starting score of 0.
     */
    public void addPlayer(String name) {
        players.add(new Player(name, 0));
    }

    /**
     * Get the player's score.
     * Return 0 if there is no player with the given name.
     */
    public int getPlayerScore(String name) {
        for(Player player : players) {
            if (player.getName().equals(name)) {
                return player.getScore();
            }
        }

        return 0;
    }

    /**
     * Get the list of all players.
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }
}

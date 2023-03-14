/*Clas for building play games toys*/

package toy;

public class Game extends Toy{


    private final int players;

    public Game(String name, int players, int winRate, int qty) {
        super(name, winRate, qty);
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Game: " + super.toString() + "; Max players to play: " + getPlayers();
    }
}

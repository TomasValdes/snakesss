package engine.snakesss;

//Responsible for game logic, each instance of a game is new grid players can play on
public class Game {
    int[][] grid;
    /**
     * Initializes a game instance
     */
    public Game(){
        int gridSize = 30;
        this.grid = new int[gridSize][gridSize];
    }

    /**
     * Adds a player to the given game, spawning them on the grid
     * @return true if successful, false otherwise
     */
    public boolean joinGame(Player newPlayer){
        return true;
    }
}

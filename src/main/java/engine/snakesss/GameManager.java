package engine.snakesss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/**
 * Holds all instances of running games
 */
public class GameManager extends LinkedHashMap<Integer, Game> {
    private static final LinkedHashMap<Integer, Game> liveGames = new LinkedHashMap<>();

    public static Game getGame(int gameID){
        return liveGames.get(gameID);
    }

    public static void replaceLiveGame(int gameID, Game newGame) {
        liveGames.replace(gameID, newGame);
    }

    public static ArrayList<GameDTO> getAllGames(){
        ArrayList<GameDTO> liveGamesInfo = new ArrayList<>();
        Collection<Game> values = liveGames.values();
        for (Game game:
                values) {
            liveGamesInfo.add(new GameDTO(game));
        }
        return liveGamesInfo;
    }

}


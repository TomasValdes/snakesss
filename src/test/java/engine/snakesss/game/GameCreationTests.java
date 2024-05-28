package engine.snakesss.game;

import engine.snakesss.Game;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameCreationTests {
    @Test
    void createNewGame(){
        Game testGame = new Game();
    }
}

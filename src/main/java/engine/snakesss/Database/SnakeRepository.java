package engine.snakesss.Database;

import engine.snakesss.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnakeRepository extends JpaRepository<Game, Long> {
}

package engine.snakesss.REST;

import engine.snakesss.Database.SnakeRepository;
import engine.snakesss.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SnakeController {

    private final SnakeRepository repository;

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/games")
    List<Game> getAllGames() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    public SnakeController(SnakeRepository repository) {
        this.repository = repository;
    }
}

package bglist.game;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @PutMapping("/games/{id}")
    public Game putGame(@PathVariable Long id, @RequestBody GameRequest game){
        return gameService.putGame(id, game);
    }

    @PostMapping("/games")
    public Game postGame(@RequestBody GameRequest game){
        return gameService.postGame(game);
    }
}


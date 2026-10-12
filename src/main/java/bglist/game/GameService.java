package bglist.game;



import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public Optional<Game> getGameById(Long game_id){
        return gameRepository.findById(game_id);
    }

    public Game putGame(Long id, GameRequest gameRequest){
        Optional<Game> game = gameRepository.findById(id);
        if(game.isEmpty()) {return null;}

        Game newGame = game.get();
        newGame.setName(gameRequest.name());
        newGame.setMinPlayers(gameRequest.minPlayers());
        newGame.setMaxPlayers(gameRequest.maxPlayers());
        newGame.setMinMinutes(gameRequest.minMinutes());
        newGame.setMaxMinutes(gameRequest.maxMinutes());

        return gameRepository.save(newGame);
    }

    public Game postGame(GameRequest gameRequest){
        Game newGame = new Game();
        newGame.setName(gameRequest.name());
        newGame.setMinPlayers(gameRequest.minPlayers());
        newGame.setMaxPlayers(gameRequest.maxPlayers());
        newGame.setMinMinutes(gameRequest.minMinutes());
        newGame.setMaxMinutes(gameRequest.maxMinutes());

        return gameRepository.save(newGame);
    }
}

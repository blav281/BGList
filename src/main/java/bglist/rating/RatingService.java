package bglist.rating;


import bglist.game.Game;
import bglist.game.GameRepository;
import bglist.user.User;
import bglist.user.UserRepository;

import java.util.Optional;

public class RatingService {
    private final RatingRepository ratingRepository;
    private final UserRepository userRepository;
    private final GameRepository gameRepository;

    public RatingService(RatingRepository ratingRepository, UserRepository userRepository, GameRepository gameRepository) {
        this.ratingRepository = ratingRepository;
        this.userRepository = userRepository;
        this.gameRepository = gameRepository;
    }

    public Rating putRating(Long user_id, Long game_id, int score){
        Optional<User> user = userRepository.findById(user_id);
        if(user.isEmpty()) {return null;}
        Optional<Game> game = gameRepository.findById(game_id);
        if (game.isEmpty()) {return null;}

        Optional<Rating> rating = ratingRepository.findByUser_IdAndGame_Id(user_id, game_id);
        Rating newRating;
        if(rating.isEmpty()){
            newRating = new Rating();
            newRating.setUser(user.get());
            newRating.setGame(game.get());
            newRating.setScore(score);
            ratingRepository.save(newRating);
        }else{
            newRating = rating.get();
            newRating.setScore(score);
            ratingRepository.save(newRating);
        }

        return newRating;
    }
}

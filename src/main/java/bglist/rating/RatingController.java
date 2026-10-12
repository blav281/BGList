package bglist.rating;

import org.springframework.web.bind.annotation.*;

@RestController
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService){
        this.ratingService = ratingService;
    }

    @PutMapping("/users/{user_id}/ratings/{game_id}")
    public Rating putRating(@PathVariable Long user_id, @PathVariable Long game_id, @RequestBody Integer score){
        return ratingService.putRating(user_id, game_id, score);
    }
}



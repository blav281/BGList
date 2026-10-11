package bglist.rating;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService){
        this.ratingService = ratingService;
    }
}



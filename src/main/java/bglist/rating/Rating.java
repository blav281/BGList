package bglist.rating;


import bglist.game.Game;
import bglist.user.User;
import jakarta.persistence.*;

@Entity
@Table(name="ratings",
        uniqueConstraints = @UniqueConstraint(columnNames = {"game_id", "user_id"}))
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Integer score;

    public void setGame(Game game) {
        this.game = game;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


}

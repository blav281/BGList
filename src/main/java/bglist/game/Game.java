package bglist.game;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private Integer minPlayers;
    private Integer maxPlayers;

    private Integer minMinutes;
    private Integer maxMinutes;

    @ElementCollection
    @CollectionTable(
            name = "game_tags",
            joinColumns = @JoinColumn(name = "game_id")
    )
    @Column(name = "tag")
    private List<String> tags = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setMinPlayers(Integer minPlayers) {
        this.minPlayers = minPlayers;
    }

    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setMinMinutes(Integer minMinutes) {
        this.minMinutes = minMinutes;
    }

    public void setMaxMinutes(Integer maxMinutes) {
        this.maxMinutes = maxMinutes;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}

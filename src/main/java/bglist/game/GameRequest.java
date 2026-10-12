package bglist.game;

import java.util.List;

public record GameRequest(
        String name,

        Integer minPlayers,
        Integer maxPlayers,

        Integer minMinutes,
        Integer maxMinutes,

        List<String> tags
) {}

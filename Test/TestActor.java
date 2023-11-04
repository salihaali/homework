import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestActor {
    Actor actor;
    FeatureFilm film;

    @BeforeEach
    void setUp() {
        actor = new Actor();
        film = new FeatureFilm();
    }


    @Test
    void numberOfFilmsActorParticipate() {
        //GIVEN
        actor.setActedFilmCount(1);

        //WHEN
        int result = actor.actInFilm(film);

        //THEN
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, result);
    }
}

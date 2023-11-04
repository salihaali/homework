import java.util.ArrayList;
import java.util.List;

public class FeatureFilm extends Film {

    private byte duration;

    FeatureFilm() {
        super();
        this.duration = 100;
    }

    FeatureFilm(String title, List<Actor> actors, double budget, byte duration) {
        super(title, actors, budget);
        this.duration = duration;
    }

    public byte getDuration() {
        return duration;
    }

    public void setDuration(byte duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "FeatureFilm " +
                "duration=" + duration +
                ", title='" + title + '\'' +
                ", actors=" + actors +
                ", budget=" + budget;
    }
}

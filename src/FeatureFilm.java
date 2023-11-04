import java.util.ArrayList;
import java.util.List;

public class FeatureFilm extends Film {

    private int duration;

    FeatureFilm() {
        super();
        this.duration = 100;
    }

    FeatureFilm(String title, List<Actor> actors, double budget, int duration) {
        super(title, actors, budget);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
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

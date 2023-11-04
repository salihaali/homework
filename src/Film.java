import java.util.ArrayList;
import java.util.List;

public class Film implements Ratingable {
    protected String title;
    protected List<Actor> actors;
    protected double budget;

    Film() {
        this.title = "Boss";
        this.actors = new ArrayList<>();
        this.budget = 1000;
    }

    Film(String title, List<Actor> actors, double budget) {
        this.title = title;
        this.actors = actors;
        this.budget = budget;
    }

    @Override
    public double calculateFilmRating(List<Actor> actors) {
        double rating = 0;
        int actorNum = actors.size();
        for (int i = 0; i < actors.size(); i++) {
            rating += actors.get(i).getPopularityRatio();

        }
        return (rating / actorNum);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", actors=" + actors +
                ", budget=" + budget +
                '}';
    }
}

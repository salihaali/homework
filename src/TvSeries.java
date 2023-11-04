import java.util.List;

public class TvSeries extends Film {

    private int seriesCount;
    private double rating;

    public TvSeries(String title, List<Actor> actors, double budget, int seriesCount, double rating) {
        super(title, actors, budget);
        this.seriesCount = seriesCount;
        this.rating = rating;
    }

    public int getSeriesCount() {
        return seriesCount;
    }

    public void setSeriesCount(int seriesCount) {
        this.seriesCount = seriesCount;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "seriesCount=" + seriesCount + '\'' +
                ", rating=" + rating + '\'' +
                ", title='" + title + '\'' +
                ", actors=" + actors + '\'' +
                ", budget=" + budget +
                '}';
    }
}

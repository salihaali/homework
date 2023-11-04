import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Actor actor1 = new Actor();
        Actor actor2 = new Actor("Stalone", 67, "male", (byte) 8, 30);
        Actor actor3 = new Actor("Jennifer Lopez", 55, "female", (byte) 7, 12);
        Actor actor4 = new Actor("Tatyana Maslani", 35, "female", (byte) 6, 2);

        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);

        List<Actor> actorList = new ArrayList<>();
        actorList.add(actor3);
        actorList.add(actor4);

        FeatureFilm film1 = new FeatureFilm("Fast and Furious", actors, 13000000, (byte)8);
        TvSeries tvSeries = new TvSeries("Orphan black", actorList, 12500, 35, 4);

        System.out.println("The actor before acting in another film -> film count: " + actor1.getActedFilmCount());
        System.out.println("The actor before acting in another film -> film count: " + actor4.getActedFilmCount());
        actor1.actInFilm(film1);
        actor3.actInFilm(film1);


        System.out.println("The actor AFTER acting in another film -> film count: " + actor1.getActedFilmCount());
        System.out.println("The actor AFTER acting in another film -> film count: " + actor4.getActedFilmCount());
        System.out.println(tvSeries.toString());
        System.out.println(film1.toString());

        System.out.println(film1.calculateFilmRating(actorList));


    }
}
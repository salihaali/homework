public class Actor implements Popularable {
    private String name;
    private int age;
    private String gender;
    private byte popularityRatio;
    private int actedFilmCount;



    Actor(String name, int age, String gender, byte popularityRatio, int actedFilmCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.popularityRatio = popularityRatio;
        this.actedFilmCount = actedFilmCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte getPopularityRatio() {
        return popularityRatio;
    }

    public void setPopularityRatio(byte popularityRatio) {
        this.popularityRatio = popularityRatio;
    }

    public int getActedFilmCount() {
        return actedFilmCount;
    }

    public void setActedFilmCount(int actedFilmCount) {
        this.actedFilmCount = actedFilmCount;
    }

    @Override
    public int actInFilm(FeatureFilm film) {
        this.actedFilmCount += 1;
        return actedFilmCount;

    }

    @Override
    public String toString() {
        return "Actor: " +
                "name - " + name +
                ", age - " + age +
                ", gender - " + gender +
                ", popularityRatio - " + popularityRatio +
                ", actedFilmCount =" + actedFilmCount;
    }
}

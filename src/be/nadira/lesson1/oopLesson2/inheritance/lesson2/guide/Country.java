package be.nadira.lesson1.oopLesson2.inheritance.lesson2.guide;

public class Country {

    private long population;
    private String language;
    private String continent;

    public Country(long population, String language, String continent) {
        this.population = population;
        this.language = language;
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", language='" + language + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}

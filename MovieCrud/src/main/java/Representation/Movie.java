package Representation;

import java.util.Date;

public class Movie {

    private long id;
    private String name;
    private Date duration;
    private String language;
    private String year;
    private String actor;

    public Movie(long id, String name, String year){

        this.id = id;
        this.name = name;
        this.year = year;
    }
    public Movie(String name, String year, String actor){

        this.name = name;
        this.year = year;
        this.actor = actor;
    }

    public Movie(long id, String name, Date duration, String language, String year, String actor)
    {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.language = language;
        this.year = year;
        this.actor = actor;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

}

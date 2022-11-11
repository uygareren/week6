package com.example.week_rep2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Serializable {


    private String name;
    private String director;
    private int year;
    private List<String> stars = new ArrayList<>();
    private String description;

    public Movie(String name, String director, int year, List<String> starts, String description) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.stars = starts;
        this.description = description;
    }



    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public List<String> getStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStarts(List<String> starts) {
        this.stars = starts;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

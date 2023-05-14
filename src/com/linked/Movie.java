package com.linked;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Movie {


    private int movieId;
    private String movieName;
    private String actorName;
    private String directorName;
    private Date releaseDate;

    public Movie() {
        this(0, " ", " ", " ", "0000-00-00");
    }

    public Movie(int movieId, String movieName, String actorName, String directorName, String releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.actorName = actorName;
        this.directorName = directorName;
        this.releaseDate = Util.toDate(releaseDate);
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

}

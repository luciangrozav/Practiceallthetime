package org.fasttrackit;

public class TheDarkKnight {

    String moviedirector;
    int movieminutelength;
    String name;

    public TheDarkKnight(String director, int minutelength)
    {
        this.moviedirector=director;
        this.movieminutelength=minutelength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void fightscenes (int batman, int joker)
    {
        int total;
        total= batman + joker;
        System.out.println(total + " total fight scenes.");
    }
}

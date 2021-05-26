package org.fasttrackit;

abstract class Movie {
    protected final int yearofrelease;  // package-private

    int characternumber;
    String style;
    String name;
    int minutelength=300;

    Movie(int year)
    {
        this.yearofrelease=year;
    }



}

package org.fasttrackit;

public class Troy {

    private int minute;
    private int scenes;
    private int yearofrelease;

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getScenes() {
        return scenes;
    }

    public void setScenes(int scenes) {
        this.scenes = scenes;
    }

    Troy(int year)
    {
        this.yearofrelease=year;
    }

    static void calculation(int n) // polimorfism
    {
        System.out.println("Method calculating is: " + n*n*n*n);
    }

    static int mainactor()
    {
        System.out.println("Brad Pitt is playing Achilles in the movie!");
        System.out.println("Salary in dolars: ");
        return 100000;


    }
    static void display()
    {
        System.out.println("Troy released in 2004!");
    }

}

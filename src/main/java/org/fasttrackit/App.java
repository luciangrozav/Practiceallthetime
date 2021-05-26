package org.fasttrackit;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello Lucian! Welcome to practice!");


        int prod=1;
        int prod2=1;
        int[] list = {1, 2, 3, 4, 5, 6};

        for (int x : list) {  // enhanced for
            prod *=x;
        }
        System.out.println(prod);

        for(int i=0; i< list.length; i++)
        {
            prod2*= list[i];
        }
        System.out.println(prod2);
        System.out.println(" ");

        Movie movie1 = new FightClub(1999);

        movie1.name = "Fight club";
        movie1.characternumber=1;
        movie1.style = "Drama";
        ((FightClub)movie1).character= "Tyler Durden";

        System.out.println("The number " + movie1.characternumber + " character in the movie " + movie1.name + ", which is a " + movie1.style + ", is: " + ((FightClub) movie1).character);
        System.out.println("Year of release is: " + movie1.yearofrelease);
        System.out.println(" ");

        System.out.println("Movie minute-length: " + movie1.minutelength);
        FightClub fightClub = new FightClub(1999);
        fightClub.display();

    }
}

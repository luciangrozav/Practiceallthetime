package org.fasttrackit;

public class FightClub extends Movie {

    String character;
    int minutelength=220;

    void display()
    {
        System.out.println("Fight club minute length: " + super.minutelength); // foloseste valoarea tipului de data din clasa Parinte
    }

    FightClub(int year){
        super(year);
    }

    static void calculation(int n, int m) // polimorfism
    {
        System.out.println("Method calculating is: " + n*n*n*n*n*m);
    }


}

package org.fasttrackit;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello Lucian! Welcome to practice!");


        int prod=1;
        int prod2=1;
        int[] list = {1, 2, 3, 4, 5, 6};

        for (int x : list) {
            prod *=x;
        }
        System.out.println(prod);

        for(int i=0; i< list.length; i++)
        {
            prod2*= list[i];
        }
        System.out.println(prod2);
    }
}

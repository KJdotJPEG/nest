package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Insert number");
        int numint = Input.nextInt();
        //the number of times the code will nest numbers will always be up to the max value, which is user inputted.
        for(int i=1;i<=numint;i++)
        {
            //remember that i++/j++ just means i/j + 1
            //this code puts all of the integers in a line
            for(int j=1;j<=i;j++)
                System.out.print(j+ " ");
            System.out.println();
            }
        //the code for going back down the number chain
        for (int i=numint-1; i>=1; i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+ " ");
            System.out.println();

        }
        //this was actually painful to do





            }


        }




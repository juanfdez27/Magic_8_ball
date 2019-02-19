package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declare

        Scanner keyboard;
        int testing;
        String question;


        // initialization phase
        keyboard =  new Scanner(System.in);
        System.out.println("Ask me a yes or no question");
        question = keyboard.nextLine();
        System.out.println("Rate your day so far from 1-100");
        value = keyboard.nextInt();

        if (0<value && value<11){
            System.out.println("NO!!!!!");
        }
        else if (10<value && value<21){
            System.out.println("Not the best idea");
        }
        else if (20<value && value<31){
            System.out.println("It could be worse");
        }
        else if (30<value && value<41){
            System.out.println("Man up kiddo");
        }
        else if (40<value && value<51){
            System.out.println("Gotta have the bad days to appreciate the good ones");
        }
        else if (50<value && value<61){
            System.out.println("Sounds like the average day");
        }
        else if (60<value && value<71){
            System.out.println("Keep the good stuff coming");
        }
        else if (70<value && value<81){
            System.out.println("New year, new you?");
        }
        else if (80<value && value<91){
            System.out.println("It's your lucky day!");
        }
        else if (90<value && value<101){
            System.out.println("Buy a lottery ticket");
        }













    }
}

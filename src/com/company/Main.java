package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declare

        Scanner keyboard;
        int value;
        String question;


        // initialization phase
        keyboard =  new Scanner(System.in);

        System.out.println("Rate your day from 1-100");
        value = keyboard.nextInt();

        if (0<value && value<11){
            System.out.println("Rough day huh?");
        }
        else if (10<value && value<21){
            System.out.println("Keep your head up");
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













    }
}

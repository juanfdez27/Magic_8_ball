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

        if (0<value && value<11);{
            System.out.println("Rough day huh?");
        }
        else if (10<value && value<21);{
            System.out.println("Keep your head up");
        }











    }
}

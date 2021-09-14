/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.next();

        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Are the Battery terminals corroded? ");
            answer = input.next();

            if (answer.equalsIgnoreCase("y"))
                System.out.println("Clean the terminals and try starting again.");

            else

                System.out.println("Replace cables and try again");

        } else {

            System.out.print("Does the car make a slicking noise? ");

            answer = input.next();

            if (answer.equalsIgnoreCase("y"))

                System.out.println("Replace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                answer = input.next();

                if (answer.equalsIgnoreCase("y"))

                    System.out.println("Check spark plug connection.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    answer = input.next();
                    if (answer.equalsIgnoreCase("y")){

                        System.out.println("Does your car have fuel injection? ");

                        answer = input.next();

                        if (answer.equalsIgnoreCase("y"))

                            System.out.println("Get in it for service.");

                        else

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.println("This should not be possible.");

                    }

                }

            }

        }

        input.close();

    }

}
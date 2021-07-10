package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        String answer;
        Scanner scanner = new Scanner(System.in);

        //taking input of a integer number and validating it
        System.out.print("Enter an integer number: ");
        if (scanner.hasNextInt())
            number = scanner.nextInt();
        else {
            System.out.println("Enter a valid input !");
            return;
        }

        //checking conditions
        if (number % 5 ==0 && number % 3 ==0)
            answer = "FizzBuzz";
        else if (number % 5 == 0)
            answer = "Fizz";
        else if(number % 3 == 0)
            answer = "Buzz";
        else
            answer = ""+number;

        //printing answer
        System.out.println(answer);
    }
}

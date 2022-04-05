package com.coderscampus.game;

import java.util.Random;
import java.util.Scanner;

public class Assignment2App {

	public static void main(String[] args) {

		Random randomNumber = new Random();
		int random = randomNumber.nextInt(100) + 1;
		System.out.println("Random number is " + random);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");

		int inputInt = Integer.valueOf(scanner.nextLine());


		messageToDisplay(inputInt, random, scanner);

	}

	public static void messageToDisplay(int playerNumber, int randomNum, Scanner scanner) {
		
		int count = 1;		

		while (count < 5) {
			
			
			if (playerNumber > 100 || playerNumber < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				playerNumber = Integer.valueOf(scanner.nextLine()); 
				
			} else if (playerNumber < randomNum) {
				System.out.println("Please pick a higher number");
				playerNumber = Integer.valueOf(scanner.nextLine());
				count++;
				

			} else if (playerNumber > randomNum) {
				System.out.println("Please pick a lower number");
				playerNumber = Integer.valueOf(scanner.nextLine());
				count++;
				

			} else if (playerNumber == randomNum) {
				System.out.println("You win!");
				break;
			}
		} if (count == 5 && playerNumber != randomNum) {
			
			System.out.println("You lose, the number to guess was " + randomNum);
		} else if (count == 5 && playerNumber == randomNum) {
			System.out.println("You win!");
		}
		scanner.close();

		
	}

	
}

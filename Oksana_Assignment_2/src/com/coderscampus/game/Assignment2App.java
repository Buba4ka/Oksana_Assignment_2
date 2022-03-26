package com.coderscampus.game;

import java.util.Random;
import java.util.Scanner;

public class Assignment2App {

	public static void main(String[] args) {

		Random randomNumber = new Random();
		int random = randomNumber.nextInt(100) + 1;
		System.out.println("Random nuber is " + random);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");
		
		int inputInt = Integer.valueOf(scanner.nextLine());
		while (inputInt <1 || inputInt >100) {
			
			System.out.println("Your guess is not between 1 and 100, please try again");
			inputInt = Integer.valueOf(scanner.nextLine());
			
		}
		messageToDisplay(inputInt, random,scanner);

		

	}

	public static void messageToDisplay(int playerNumber, int randomNum, Scanner scanner) {
		
		int count =1;

		while (count < 5 && playerNumber != randomNum) {
			if (playerNumber < randomNum) {

				System.out.println("Please pick a higher number");
				playerNumber = Integer.valueOf(scanner.nextLine());
				count++;

			} else if (playerNumber > randomNum) {
				System.out.println("Please pick a lower number");
				playerNumber = Integer.valueOf(scanner.nextLine());
				count++;

			} else  {
				
				System.out.println("You win!");	
				count++;
				scanner.close();
			}
			
		}
		
		if (playerNumber != randomNum && count == 5) {
			
			System.out.println("You lose, the number to guess was " + randomNum);
			scanner.close();
		}
		
		

	}



}
